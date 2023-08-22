package Java;

import java.util.Scanner;

public class DT_SR22082023 {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=n-1;
		int t2=n-1;
		String z="";
		int o=0;
		String s1[]=new String [n-1];
		for(int i=0;i<n;i++){
		    if(i==n-1){
		        for(int j=0;j<n;j++){
		        System.out.print("*");
		        //z+='*';
		        if(j!=n-1)
		        System.out.print("-");
		        //z+='-';
		        }
		    }
		    else{
		    for(int j=t1;j>0;j--){
		        System.out.print("#");
		        z+='#';
		    }
		    if(i<n-1){
		        for(int j=0;j<=i;j++){
		            System.out.print("*");
		            z+="*";
		            if(j!=i){
		            System.out.print("-");
		            z+='-';
		            }
		        }
		    }
		    for(int j=t2;j>0;j--){
		        System.out.print("#");
		        z+='#';
		    }
		    t1--;
		    t2--;
		    }
		
		    System.out.println();
		  //  System.out.println(z);
		  if(i<n-1){
		    s1[o++]=z;
		    z="";
		  }
		    
		}
		for(int i=s1.length-1;i>=0;i--){
		    System.out.println(s1[i]);
		}
		System.out.print(".");
}
