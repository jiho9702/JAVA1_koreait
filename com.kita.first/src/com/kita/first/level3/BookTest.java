package com.kita.first.level3;

public class BookTest {
	public static void main(String[] args) {
		
		Student minsu = new Student();
		
		for(int i=1; i<5; i++) {
			int result = minsu.readBooks();
			switch(result) {
			case 1: //민수가 book1을 다 읽었을 경우
				minsu.book1 = new ComicBook(8);
				System.out.println("새 만화책을 가져왔다");
				break;
			case 2:
				minsu.book2 = new MajorTextBook(7);
				System.out.println("새 전공서적을 가져왔다");
				break;
			case 3:
				minsu.book3 = new Book(4);
				System.out.println("새 책을 가져왔다");
				break;
			}
			System.out.println("--------------------");
		}
	}
}
