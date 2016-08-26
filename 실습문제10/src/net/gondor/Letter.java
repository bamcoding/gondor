package net.gondor;

public class Letter {
	private String title;
	private String name;
	private String contents;
	private int num;
	private int count;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Letter(String title, String name, String contents) {
		this.title = title;
		this.name = name;
		this.contents=contents;
	}
	
	public void showLetter(){
		String total = num+"	"+title+"	"+name+"	"+count;
		System.out.println("----------------------------------------");
		System.out.println("번호\t"+num);
		System.out.println("작성자\t"+name);
		System.out.println("조회수\t"+count);
		System.out.println("글 제목\t"+title);
		System.out.println("글 내용\t"+contents);		
		System.out.println("----------------------------------------");
	}
	
	public String toString(){
		String total = num+"	"+title+"	"+name+"	"+count;
		return total;
	}

}
