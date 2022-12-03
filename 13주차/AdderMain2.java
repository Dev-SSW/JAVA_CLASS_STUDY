public class AdderMain2{
	public static void main(String[] args){
		Sum num = new Sum();

        Thread at1 = new thread(num,1,50);
        Thread at2 = new thread(num,51,100);
        
        at1.start();
        at2.start();
        
	}
}

class Sum{
	int num;
	synchronized void addNum(int n) {
		num += n;
	}
	synchronized int getNum() {
		return num;
	}
}

class thread extends Thread{
	private Sum num;
	private int start;
	private int end;
	public thread(Sum num,int start,int end) {
		this.num = num; this.start = start; this.end = end;
	}
	//@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			num.addNum(i);
		}
		System.out.println(num.getNum());
	}	
}