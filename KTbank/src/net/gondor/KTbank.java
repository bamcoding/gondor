package net.gondor;

import java.util.Scanner;
import java.util.UUID;
import java.util.Map;
import java.util.HashMap;

public class KTbank {
	/**
	 * 고객 생성
	 */
	private static final String createCustomer = "0";
	/**
	 * 계좌 개설
	 */
	private static final String createAccount = "1";
	/**
	 * 계좌 입금/출금
	 */
	private static final String useAccount = "2";
	/**
	 * 종료
	 */
	private static final String quit = "3";
	/**
	 * 준비금
	 */
	private int baseMoney;
	private Scanner input = new Scanner(System.in);
	/**
	 * An empty value for Scanner
	 */
	private String scanChar;
	/**
	 * 이름을 키로 고객의 정보에 접근한다.
	 */
	Map<String, Customer> customer = new HashMap<String, Customer>();
	/**
	 * 이름을 키로 계좌의 정보에 접근한다.
	 */
	Map<String, Account> account = new HashMap<String, Account>();
	
	/**
	 * 초기화와 동시에 기능을 수행한다.
	 */
	public KTbank() {
		System.out.println("=================================");
		System.out.println("	케이티 은행입니다	");
		System.out.println("=================================");
		System.out.println("케이티 은행을 초기화 합니다");
		baseMoney = 1000000;
		System.out.printf("준비금 : %,d\n", baseMoney);
		System.out.println("영업을 시작합니다.");

		while (true) {
			showMenu();
			scanChar = input.nextLine();
			if (scanChar.equals(createCustomer)) {
				createCustomer();
			} else if (scanChar.equals(createAccount)) {
				createAccount();
			} else if (scanChar.equals(useAccount)) {
				useAccount();
			} else if (scanChar.equals(quit)) {
				System.out.println("안녕히 가세요.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("안녕히 가세요.");
			}
			System.out.println();
		}
	}

	/**
	 * 계좌 입금/출금을 담당
	 */
	private void useAccount() {
		System.out.println("계좌 입금 / 출금 업무를 선택하셨습니다.");
		System.out.println("예금주의 이름을 입력해주세요.");
		String name = input.nextLine();
		if (!account.containsKey(name)) {
			System.out.println("등록된 계좌가 없습니다. 계좌 등록을 먼저 해주세요");
			createAccount();
		}
		System.out.printf("\"%s\"님의 계좌 정보입니다.\n", name);
		infoAccount(name);
		System.out.println("맞습니까?(Y/N)");
		scanChar = input.nextLine();
		if (scanChar.equalsIgnoreCase("y")) {
			// useAccount()
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("---------------------------------");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 취소");
			System.out.println("---------------------------------");
			scanChar = input.nextLine();
			if (scanChar.equals("1")) {
				System.out.printf("\"%s\"님의 계좌에 입금을 진행합니다." + "\n얼마를 입금하시겠습니까?\n", name);
				int depositMoney = input.nextInt();
				input.nextLine();
				if (!isCustomerMoney(name, depositMoney)) {
					System.out.println("잔액이 부족합니다.");
				} else {
					// 고객의 잔액에서 금액을 뺀다.
					receiveMoneyFromCustomer(name, depositMoney);
					// 계좌에 입금한다.
					giveMoneyToAccount(name, depositMoney);
					System.out.printf("\"%s\"님이 가진 현금 중  %,d원을 계좌에 입금했습니다.\n", name, depositMoney);
					checkAccountD(name);
				}
			} else if (scanChar.equals("2")) {
				accessWithdraw(name);
			} else {
				System.out.println("처음으로 돌아갑니다");
			}
		} else {
			System.out.println("등록된 계좌가 없습니다. 계좌 등록을 먼저 해주세요");
			createCustomer();
		}
	}

	/**
	 * 계좌 입금/출금 기능의 출금을 담당.
	 * 전부 출금하지 않을거라면 반복하기 위해서 메소드로 만듦
	 * @param name
	 */
	private void accessWithdraw(String name) {
		System.out.printf("\"%s\"님의 계좌에 출금을 진행합니다.\n", name);
		infoAccount(name);
		System.out.println("얼마를 출금하시겠습니까?");
		int withdrawMoney = input.nextInt();
		input.nextLine();
		if (isAccountMoney(name, withdrawMoney)) {
			System.out.printf("\"%s\"님의 계좌에서 %,d원을 출금했습니다.\n", name);
			// 계좌에서 뺀다
			receiveMoneyFromAccount(name, withdrawMoney);
			// 고객에게 준다.
			giveMoneyToCustomer(name, withdrawMoney);

			checkAccountD(name);
		} else {
			System.out.println("잔액이 충분치 않습니다.");
			int AccountMoney = account.get(name).getMoney();
			System.out.printf("잔액 %,d원 전부를 출금하시겠습니까?(Y/N)\n", AccountMoney);
			scanChar = input.nextLine();
			if (scanChar.equalsIgnoreCase("y")) {
				receiveMoneyFromAccount(name, AccountMoney);
				giveMoneyToCustomer(name, AccountMoney);
				checkAccountW(name);

			} 
			else {
				accessWithdraw(name);
			}
		}
	}

	/**
	 * 고객의 돈을 사용합니다.
	 * @param name
	 * @param depositMoney
	 */
	private void receiveMoneyFromCustomer(String name, int depositMoney) {
		int customerMoney = customer.get(name).getMoney() - depositMoney;
		customer.get(name).setMoney(customerMoney);
	}

	/**
	 * 계좌에 돈을 집어넣습니다.
	 * @param name
	 * @param depositMoney
	 */
	private void giveMoneyToAccount(String name, int depositMoney) {
		depositMoney += account.get(name).getMoney();
		account.get(name).setMoney(depositMoney);
	}

	/**
	 * 계좌에서 돈을 꺼냅니다.
	 * @param name
	 * @param withdrawMoney
	 */
	private void receiveMoneyFromAccount(String name, int withdrawMoney) {
		int accountMoney = account.get(name).getMoney() - withdrawMoney;
		account.get(name).setMoney(accountMoney);
	}

	/**
	 * 고객에게 돈을 줍니다.
	 * @param name
	 * @param withdrawMoney
	 */
	private void giveMoneyToCustomer(String name, int withdrawMoney) {
		withdrawMoney += customer.get(name).getMoney();
		customer.get(name).setMoney(withdrawMoney);
	}

	/**
	 * 고객이 출금하기 전에
	 * 계좌에 금액이 모자라지 않은지 확인하는 메소드
	 * @param name
	 * @param withdrawMoney
	 * @return
	 */
	private boolean isAccountMoney(String name, int withdrawMoney) {
		boolean isMoney = false;
		if (withdrawMoney <= account.get(name).getMoney()) {
			isMoney = true;
		}
		return isMoney;
	}

	/**
	 * 고객이 입금하기 전에
	 * 입금하기 위한 잔액이 부족하지 않은지 확인하는 메소드
	 * @param name
	 * @param depositMoney
	 * @return
	 */
	private boolean isCustomerMoney(String name, int depositMoney) {
		boolean isMoney = false;
		if (depositMoney <= customer.get(name).getMoney()) {
			isMoney = true;
		}
		return isMoney;
	}

	/**
	 * 계좌 개설을 담당하는 메소드
	 */
	private void createAccount() {
		System.out.println("계좌 개설 업무를 도와 드리겠습니다.");
		System.out.println("예금주 명을 입력해 주세요");
		String name = input.nextLine();
		String accountNum = UUID.randomUUID().toString();
		System.out.printf("\"%s\"님의 계좌 번호는 \"%s\"입니다\n", name, accountNum);
		System.out.println("계좌에 5,000원을 입금합니다.");
		System.out.println("계속하시려면 Y를 입력하세요.");
		System.out.println("N을 입력하면, 개설업무가 취소됩니다.");
		System.out.println("계속하시겠습니까?(Y/N)");
		scanChar = input.nextLine();
		if (scanChar.equalsIgnoreCase("y")) {
			// 고객의 잔액과 5,000원을 비교하는 함수 조건
			int customerMoney = customer.get(name).getMoney();
			if (5000 <= customerMoney) {
				System.out.printf("\"%s\"님이 가진 현금 중 5,000원을 계좌에 입금했습니다.\n", name);
				// 계좌 생성
				account.put(name, new Account());
				account.get(name).setAccountNum(accountNum);
				// 고객의 잔액에서 5,000을 뺀다
				receiveMoneyFromCustomer(name, 5000);
				giveMoneyToAccount(name, 5000);
				// 계좌 확인
				checkAccountD(name);
			} else {
				System.out.printf("\"%s\"님이 가진 현금 중 5,000이 안되는 군요.\n", name);
				System.out.println("계좌 개설을 취소합니다.");
				System.out.println("안녕히 가세요.");
			}
		} else {
			System.out.println("계좌 개설을 취소합니다.");
			System.out.println("안녕히 가세요.");
		}
	}

	/**
	 * 계좌를 확인하시겠습니까?
	 * 입금용 계좌확인 메소드
	 * 추가 입금 -> 계좌 확인 -> 추가 입금 을 반복한다.
	 * @param name
	 */
	private void checkAccountD(String name) {

		System.out.println("계좌를 확인하시겠습니까?(Y/N)");
		scanChar = input.nextLine();
		if (scanChar.equalsIgnoreCase("y")) {
			infoAccount(name);
		}
		extraDeposit(name);
	}

	/**
	 * 계좌를 확인하시겠습니까?
	 * 출금용 계좌확인 메소드
	 * 추가 출금 -> 계좌 확인 -> 추가 출금 을 반복한다.
	 * @param name
	 */
	private void checkAccountW(String name) {
		System.out.println("계좌를 확인하시겠습니까?(Y/N)");
		scanChar = input.nextLine();
		if (scanChar.equalsIgnoreCase("y")) {
			infoAccount(name);
		}
		extraWithdraw(name);
	}
	/**
	 * 계좌 정보를 바로 보여주는 메소드
	 * @param name
	 */
	private void infoAccount(String name) {
		System.out.println("---------------------------------");
		System.out.printf("[은행명 : 케이티은행, 예금주: %s, " + "계좌번호 : %s, 잔액 : %d원]\n", name, account.get(name).getAccountNum(),
				account.get(name).getMoney());
		System.out.println("---------------------------------");
	}

	/**
	 * 추가 출금을 담당한다
	 * 추가 입금과 동일하게 기능 수행 후에는 계좌를 확인할 수 있다.
	 * @param name
	 */
	private void extraWithdraw(String name) {
		if (isAccountMoney(name, 1)) {
			System.out.println("추가 출금하시겠습니까?(Y/N)");
			scanChar = input.nextLine();
			if (scanChar.equalsIgnoreCase("y")) {
				System.out.printf("출금 금액을 입력하세요. (\"%s\"님의 계좌 잔액 : " + "%,d)\n", name, account.get(name).getMoney());
				int money = input.nextInt();
				input.nextLine();
				receiveMoneyFromAccount(name, money);
				giveMoneyToCustomer(name, money);
				System.out.printf("\"%s\"님의 계좌에서 %,d원을 출금했습니다.\n", name, money);
				checkAccountD(name);
			} else {
				System.out.println("안녕히 가세요.");
			}
		} else {
			System.out.println("잔액이 부족하므로 추가 출금할 수 없습니다\n" + "안녕히 가세요.");
		}
	}
	/**
	 * 추가 입금을 담당한다.
	 * 계좌를 확인하는 것은 덤.
	 * @param name
	 */
	private void extraDeposit(String name) {
		System.out.println("추가 입금하시겠습니까?(Y/N)");
		scanChar = input.nextLine();
		if (scanChar.equalsIgnoreCase("y")) {
			System.out.printf("입금 금액을 입력하세요. (\"%s\"님의 잔액 : " + "%,d)\n", name, customer.get(name).getMoney());
			int money = input.nextInt();
			input.nextLine();
			receiveMoneyFromCustomer(name, money);
			giveMoneyToAccount(name, money);
			System.out.printf("\"%s\"님이 가진 현금 중 %,d원을 계좌에 입금했습니다.\n", name, money);
			checkAccountD(name);
		} else {
			System.out.println("안녕히 가세요.");
		}
	}
	/**
	 * 고객 생성을 담당한다.
	 */
	private void createCustomer() {
		System.out.println("은행에 방문할 고객을 생성합니다.");
		System.out.println("고객의 이름을 입력하세요.");
		String name = input.nextLine();
		//이름이 있는지 없는지 확인한다.(중복확인?)
		if (customer.containsKey(name)) {
			int money = customer.get(name).getMoney();
			System.out.printf("\"%s\"님의 잔액은 %,d원 입니다.\n", name, money);
			System.out.println("새로운 잔액을 입력하세요.");
			money = input.nextInt();
			input.nextLine();
			customer.get(name).setMoney(money);
			System.out.printf("\"%s\"님의 잔액은 %,d원 입니다.\n", name, money);
		} else {
			System.out.printf("\"%s\"님의 잔액을 입력하세요.\n", name);
			int money = input.nextInt();
			input.nextLine();
			System.out.printf("\"%s\"님의 잔액은 %,d원 입니다.\n", name, money);
			customer.put(name, new Customer());
			customer.get(name).setMoney(money);
		}
	}
	/**
	 * 메뉴를 출력
	 */
	private void showMenu() {
		System.out.println("어서오세요. 무엇을 도와 드릴까요?");
		System.out.println("---------------------------------");
		System.out.println("0. 고객 생성");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 계좌 입금 / 출금");
		System.out.println("3. 종료");
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		new KTbank();
	}
}
