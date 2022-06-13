package logical;

public class ReveseNum {
	public static void main(String[] args) {
		 int N=89756;
		 int r=0;
		 while(N>0) {
			 int rm=N%10;
			 r=r*10 + rm;
			 N=N/10;
		 }
		 System.out.println(+r);
		 
		 
	}
	}
