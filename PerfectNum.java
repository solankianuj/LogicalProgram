package logical;

public class PerfectNum {
	public static void main(String[] args) {
		perfectNumber(28);
	}


static void perfectNumber(int N) {
	int p=0;
	for (int i=1;i<N;i++) {
		int div=N%i;
		if(div==0) {
			 p=p+i;
		}	
	}
	if(p==N)
	System.out.println(+N+" :Is Perfect Number.");
	else
		System.out.println(+N+" :Is Not Perfect Number.");
	
}
	
}