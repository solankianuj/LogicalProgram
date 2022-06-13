package logical;
import java.util.Scanner;
public class StopWatch {
	public static void main(String[] args) {
		
		long start = 0;
		long stop = 0;
		System.out.println("Press 1 to start the stopwatch");
		Scanner Bt =new Scanner(System.in);
		int on=Bt.nextInt();
		if(on==1) {
	     start=System.currentTimeMillis();
		
		}
		
		System.out.println("Press 2 to stop the stopwatch");
		int off=Bt.nextInt();
		if(off==2) {
		stop=System.currentTimeMillis();
		System.out.println();
		}
		float v=(stop-start)/1000f;
		System.out.println(+v+" sec. time elapsed");
	}
}
