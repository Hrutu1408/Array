public class ArrayReverse
{
    void reverse(int[] arr,int start ,int end)
    {
        while(start<end)
        {
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--; 
        }
        for (int i : arr)
        {
            System.out.print(i);
        }
    }
public static void main(String[] args)
{
    int[] arr={7,1,8,9,5};
    int start=0
    int end=arr.length-1;
    ArrayReverse obj=new ArrayReverse();
    obj.reverse(arr,start,end);   
}
}
