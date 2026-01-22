package Arrays;

import java.lang.*;
import java.io.*;

public class Test03 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		int a[],n,i,max,min,c=0,s=0;
		a=new int[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter size of array");
		n= Integer.parseInt(br.readLine());
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		max=a[0];
		min=a[0];
		
		for(i=0;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
			c++;
			s=s+a[i];
		}
		System.out.println();
		for(i=0;i<n;i++) {
		System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		System.out.println("Average = "+(s/c));
		System.out.println("count = "+c);

	}

}
