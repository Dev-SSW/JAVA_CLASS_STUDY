import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {

	static void printList(LinkedList l) { // 리스트의 요소를 모두 출력하는 메소드
		Iterator itr = l.iterator();// Iterator 객체 반환	
		while (itr.hasNext()){ // Iterator 객체에 요소가 있을 때 까지 반복
			String e = (String) itr.next(); // 다음 요소 반환
			String separator;
			if (itr.hasNext())  
				separator = "->"; // 마지막 요소가 아니면 -> 출력
			else
				separator = "\n"; // 마지막 요소이면 줄바꿈
			System.out.print(e+separator );

		}

	}

	public static void main(String[] args){

		LinkedList myList = new LinkedList(); // 빈 리스트 생성
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		Collections.sort(myList); // 요소 정렬
		printList(myList); // 정렬된 요소 출력
		Collections.reverse(myList); // 요소의 순서를 반대로
		printList(myList); // 요소 출력로
		int index = myList.indexOf("아바타");// "아바타" 요소의 인덱스 검색(이진탐색)
		System.out.println("아바타는" + index + "번째 요소입니다.");
	}

}
