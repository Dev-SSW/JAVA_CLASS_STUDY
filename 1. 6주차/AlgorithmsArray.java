import java.util.Scanner;
import java.util.Arrays;

class AlgorithmsArray {
	static int currentSize;
	public static void main(String[] args) {
		 
		 final int num = 3;
		 
		 double[] values= new double[num];
		 double average, largest;
		 int pos = 0;
		 
		 
		 System.out.println("숫자 " + num +"개를 입력하세요.");
		 filling(values);
		 
		 System.out.println("당신이 입력한 결과 입니다");
		 printingArray(values);
		 
		 average = avg(values);
		 System.out.println("Average Vaue : " + average);

		 largest = max(values);
		 System.out.println("Maximum Vaue : " + largest);
		 
		 System.out.println("숫자 3이 있나요? ");
		 linearSearch(values, 3);
		 
		 System.out.println( pos + "위치에 있는 값을 지웠습니다");
		 removeElement(values, pos);          // 1) sorting array   2) no sorting array(작성,실행후 comment 처리)
		 printingArray(values);
		 
		 System.out.println( pos + "위치에 2022을 넣었습니다");
		 insertElement(values, pos, 2022);      // 1) sorting array   2) no sorting array(작성,실행후 comment 처리)
		 printingArray(values);
		 System.out.println("아래와 같이 java.util package에 있는 Arrays클래스를 이용해서 values를 출력해 보세요.");
		 System.out.println(Arrays.toString(values));
		 
		 Arrays.sort(values);
		 System.out.println("정렬된 값은 " + Arrays.toString(values));
		 
		 double newValues[];
	     newValues =  copyArray(values);
	     System.out.println("복사된 newValues의 내용은 "+ Arrays.toString(newValues));


	}
	
	public static double[] copyArray(double[] values) {
		double[] arr = Arrays.copyOf(values,values.length);
		
		return arr;
		
	}
	
	public static void insertElement(double[] values, int pos, int a) {
		values[pos] = a;
		double tmp = 0;
		//sorting array
		Arrays.sort(values);
		System.out.println("sorting array로 정렬");
		System.out.println(Arrays.toString(values));
		//no sorting array
		for (int i = 0; i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[i] > values[j]) {
					tmp = values[i];
					values[i] = values[j];
					values[j] = tmp;
				}
			}
		}
		System.out.println("no sorting array로 정렬");
		System.out.println(Arrays.toString(values));
	}
	
	public static void removeElement(double[] values, int pos) {
		values[pos] = 0;
		double tmp = 0;
		//sorting array
		Arrays.sort(values);
		System.out.println("sorting array로 정렬");
		System.out.println(Arrays.toString(values));
		//no sorting array
		for (int i = 0; i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[i] > values[j]) {
					tmp = values[i];
					values[i] = values[j];
					values[j] = tmp;
				}
			}
		}
		System.out.println("no sorting array로 정렬");
		System.out.println(Arrays.toString(values));
		
		
	}
	public static void linearSearch(double[] values , double search) {
		int count = 0;
		for (int i = 0; i<values.length; i++) {
			if (values[i] == search) {
				System.out.println((i+1)+"번째에서 발견되었습니다.");
				continue;
			}
			else if (values[i] != search) {
				count++;
				if ( count == values.length) {
					System.out.println("발견되지 않았습니다.");
					break;
				}
			}
			
		}
	}
	public static double avg(double[] values) {
		double sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		double avg = 0;
		avg = sum / values.length;
		return avg;
	}
	
	public static double max(double[] values) {
		double max = values[0];
		for (int i =0; i<values.length; i++) {
			if ( max < values[i]) {
				max = values[i];
			}
		}
		return max;
	}
	
	public static void filling(double[] values) {	
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<values.length; i++) {
			values[i] = 0;
		}
		for (int i=0; i<values.length; i++) {
			values[i] = sc.nextInt();	
			System.out.println(Arrays.toString(values));
		}
		sc.close();
	}
	
	public static void printingArray(double[] values){
	 for ( int i = 0; i < values.length; i++) {
		 System.out.print(values[i]+"  ");
	    }
	 System.out.println();
	}
}
	

