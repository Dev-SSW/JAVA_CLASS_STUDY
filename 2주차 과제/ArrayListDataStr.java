import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDataStr {
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 :" + list1);
		System.out.println("list2 :" + list2);
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(0,5);
		list1.add(1,4);
		list1.add(2,2);
		list1.add(3,0);
		list1.add(4,1);
		list1.add(5,3);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);	
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		System.out.println("list1.containAll(list2) : " + list1.containsAll(list2));
		//list1이 list2 요소들을 모두 포함하고 있는가? bool값 출력
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		list2.set(3, "AA");
		print(list1,list2);
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1,list2);
		for(int i = list2.size()-1; i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
	}

}