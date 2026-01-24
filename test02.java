package Arrays;
import java.lang.*;
import java.io.*;


public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int a[],n,i;
		a=new int[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter size of array");
		n=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++) {
		System.out.print(" " +a[i]);
		}
		System.out.println();
		
		

	}

}
