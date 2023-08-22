package Java;

import java.util.Scanner;

public class SR_UndoOperation {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            sc.nextLine();
            int h=0;
            int tik=0;
            int index=0;
            for(int p=0;p<n;p++){
                char c[]=sc.nextLine().toCharArray();
                for(int i=0;i<c.length;i++){
                    if(c[i]=='^'){
                        index=i-1;
                        for(int j=i;j<c.length;j++){
                            if(c[j]=='^'){
                                h++;
                                c[j]='*';
                            }
                            else{
                                break;
                            }
                        }
                        for(int j=index;j>=0;j--){
                            if(h!=0){
                                if(c[j]!='*'){
                                    c[j]='*';
                                    //tik=1;
                                    h--;
                                }
                            }
                            else{
                                break;
                            }
                        }
                        h=0;
                        for(int pp=0;pp<c.length;pp++){
                            if(c[pp]!='*'){
                                tik=1;
                                break;
                            }
                        }
                        if(tik==0)
                        System.out.print("-1");
                        tik=0;
                    }
                }
                for(int j=0;j<c.length;j++){
                    if(c[j]!='*')
                    System.out.print(c[j]);
                }
                System.out.println();
            }
        }
        
        
        
	}
}

