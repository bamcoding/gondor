package net.gondor;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PCBoard implements BoadFunction{
	private List<Letter> list= new ArrayList<Letter>();
	private Scanner input = new Scanner(System.in);
	public PCBoard(){		
		list.add(new Letter("글 제목입니다.","ㅎㅎㅎ","글의 내용입니다. ㅎㅎ 좋죠?"));
		list.get(0).setNum(list.size());
		list.add(new Letter("글 제목입니다.","ㅎㅎㅎ","글의 내용입니다. ㅎㅎ 좋죠?"));
		list.get(1).setNum(list.size());
		list.add(new Letter("글 제목입니다.","ㅎㅎㅎ","글의 내용입니다. ㅎㅎ 좋죠?"));
		list.get(2).setNum(list.size());
		list.add(new Letter("글 제목입니다.","ㅎㅎㅎ","글의 내용입니다. ㅎㅎ 좋죠?"));
		list.get(3).setNum(list.size());
		String selChar = null;
		int selNum = 0;
		String letterName = null;
		String letterTitle = null;
		String letterContents = null;
		while (true) {
			menu();
			selChar = input.nextLine();
			if (selChar.equals("1")) {
				showBoard();
			} 
			else if (selChar.equals("2")) {
				System.out.println("보고 싶으신 글의 번호를 입력해주세요.");
				selNum = input.nextInt();
				input.nextLine();
				if (selNum >= 0 && selNum > list.size()) {
					System.out.println("글이 존재하지 않습니다.");
				}
				else{
					list.get(selNum-1).showLetter();
					list.get(selNum-1).setCount((list.get(selNum-1).getCount()+1));
				}
			} 
			else if (selChar.equals("3")) {
				System.out.println("글쓰기를 선택하셨습니다.");
				System.out.println("작성자를 입력해주세요.");
				letterName = input.nextLine();
				System.out.println("글 제목을 입력해주세요");
				letterTitle = input.nextLine();
				System.out.println("글 내용을 입력해주세요");
				letterContents = input.nextLine();
				
				list.add(new Letter(letterTitle,letterName,letterContents));
				list.get(list.size()-1).setNum(list.size());
			} 
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	private void showBoard() {
		System.out.println("번호"+"	"+"글제목"+"		"+"작성자"+"	"+"조회수");
		System.out.println("========================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("----------------------------------------");
		}
	}

	private void menu() {
		System.out.println("1. 목록 보기");
		System.out.println("2. 자세히 보기");
		System.out.println("3. 글쓰기");
		System.out.println("4. 나가기");
	}
	
	public static void main(String[] args) {
		new PCBoard();
}
}
