package net.gondor;

public interface BankInterface {
	/**
	 * 고객 생성
	 */
	public static final String CREATE_CUSTOMER = "0";
	/**
	 * 계좌 개설
	 */
	public static final String CREATE_ACCOUNT = "1";
	/**
	 * 계좌 입금/출금
	 */
	public static final String USE_ACCOUNT = "2";
	/**
	 * 종료
	 */
	public static final String QUIT = "3";
}
