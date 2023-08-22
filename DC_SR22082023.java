package Java;

import java.util.Scanner;

public class DC_SR22082023 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            char[] c=sc.nextLine().toCharArray();
            int n=sc.nextInt();
            int z=0;
            while(z!=n){
                char f=c[0];
                for(int i=0;i<c.length-1;i++){
                    c[i]=c[i+1];

                }
                c[c.length-1]=f;
                z++;
            }
            String g="";
            for(int i=0;i<c.length;i++){
                g+=c[i];
            }
            g=g.replaceAll("\\s","");
            System.out.print(g);
        }
    }
}
