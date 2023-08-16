package Java;

import java.util.*;

public class DC_LC16082023{
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] a =new int [k];
        ArrayList<Integer>al=new ArrayList<>();
        int p=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(p<k){
                    a[p]=nums[j];
                    p++;
                }
                if(p==k){
                    Arrays.sort(a);
                    al.add(a[a.length-1]);
                    break;
                }
            }
            p=0;
            Arrays.fill(a,0);
        }
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}