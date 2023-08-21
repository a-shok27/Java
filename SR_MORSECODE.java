package Java;
import java.util.*;
public class SR_MORSECODE {
    public static void main(String[] args){
    int a[]=new int[127];
		int h=1;
		for(int i=97;i<=122;i++){
		    a[i]=h;
		    h++;
		}
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		String s1[]=sc.nextLine().split(" ");
		for(int i=0;i<s1.length;i++){
		    int z=s1[i].length();
		    for(int j=97;j<=122;j++){
		        if(a[j]==z){
		            System.out.print((char)j+);
		            break;
		        }
		    }
		        
		}
		System.out.print(" ");
	}
    }
}
