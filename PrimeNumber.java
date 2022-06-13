package logical;

public class PrimeNumber {
	public static void main(String[] args) {
		primeNum(18);
	}
	
	
static void primeNum(int N) {
	int flag=0;
	for(int i=2; i<N;i++) {
		int num = N%i;
		if(num==0) {
			System.out.println(+N+" : Is Not A  Prime Number.");
			 flag=1;
			 break;
		}
	}
	if(flag==0) {
		System.out.println(+N+" : Is A Prime Number.");
	}
	
}
}
