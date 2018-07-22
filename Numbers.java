package program;
import java.util.Scanner;
public class Numbers {
public static void main(String[] args) {
	int i,n=0,k,sum=0;
      Scanner in=new Scanner(System.in);
	System.out.println("Enter the Integer");
	n=in.nextInt();
	k=in.nextInt();
	int a[]=new int [n];
	for(i=0;i<n;i++){
		a[i]=in.nextInt();
		
	}
	for(i=0;i<k;i++){
	sum=sum+a[i];
	}
	System.out.println(sum);
	
		

	}
}

