package corejavaprograms;

public class test20 {

	public static void main(String[] args) {
		// TODO Armstrong number
		
		
		int n=156,i=1,r=1,s=0,t;
		t=n;
		while(i<n) {
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if (t==s) {
			System.out.println("armstrong");
		}
		else {
			
			System.out.println("not");
		}

	}

}
