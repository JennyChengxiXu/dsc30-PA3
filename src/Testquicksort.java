import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Testquicksort {
    public static int partition(int[] arr,int low, int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while (i<=j){
            while(i<=j && arr[i]<=pivot){
                i++;
            }
            while(i<=j && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int tem=arr[i];
                arr [i]=arr[j];
                arr[j]=tem;

            }
        }
        int tep=arr[low];
        arr[low]=arr[j];
        arr[j]=tep;
        return j;
    }

    public static void main(String[] args) {
        int[] new1=new int[]{9, 6, 4, 1, 0};
        int low=0;
        int high=4;
        int index1=partition(new1,0,4);
        System.out.println(Arrays.toString(new1));
        System.out.println(index1);
        int index2=partition(new1,0,index1-1);
        System.out.println(Arrays.toString(new1));
        System.out.println(index2);
        int index3=partition(new1, index2+1, index1-1);
        System.out.println(Arrays.toString(new1));
        System.out.println(index3);
        int index4=partition(new1, index2+1, index3-1);
        System.out.println(Arrays.toString(new1));
        System.out.println(index4);





    }

}
