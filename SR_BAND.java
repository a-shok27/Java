package Java;

import java.util.Scanner;

public class SR_BAND {
        public static void main(String[] args) {
		try (//Your Code Here
        Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0,j=10;i<=90&&j<=100;i+=10,j+=10){
                for(int k=0;k<n;k++){
                    if(i==0){
                        if(a[k]>=i&&a[k]<=j){
                            c++;
                        }
                    }
                    else if(a[k]>i&&a[k]<=j){
                        c++;
                    }
                }
                if(i==0)
                System.out.print("Band "+i+"-"+j+":"+" "+c);
                else{
                    int h=i+1;
                System.out.print("Band "+h+"-"+j+":"+" "+c);
                }
                c=0;
                System.out.println();
            }
        }

	}
}
