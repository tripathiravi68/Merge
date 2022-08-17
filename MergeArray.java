import java.util.*;
public class MergeArray
{
    public static void main(String args[])
    {
        int arr1[]=new int[] {12,24,36,48,60};
        int arr2[]=new int[] { 28,34,44,48,54,59,70};
        
        int len=arr1.length+arr2.length;
        int arr3[]=new int[len];
        int c=0,k=0;
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println("The value of I is"+i);
            for(int j=0;j<arr2.length;j++)
            {
                j=c;
                if(arr1[i]<arr2[j])
                {
                    System.out.println("J----"+j);
                    arr3[k]=arr1[i];
                    System.out.println("in if block "+arr3[k]);
                    k++;
                    break;
                }
                else if(arr1[i]>arr2[j])
                {
                    System.out.println("---j----"+j);
                    arr3[k]=arr2[j];
                    System.out.println("in Else block "+arr3[k]);
                    k++;
                    c++;
                }
                else if(arr1[i]==arr2[j])
                {
                    arr3[k]=arr1[i];
                    arr3[k+1]=arr1[i];
                k++;
                c++;                }
            }
        }
        for(int r:arr3)
        {
            System.out.println(r);
        }
    }
}
