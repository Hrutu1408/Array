public class OneSide
{
    public void shiftt(int[] arr)
    {
       int start=0;
       int end =5;
       while(start<end)
       {
         if(arr[end]<0)
         {
            if(arr[start]>0)
            {
                int tmp=arr[start];
                arr[start]=arr[end];
                arr[end]=tmp;
                start++;
                end--;
            }
            else
            {
                start++;
            }
         }
         else
         {
             end--;
         }
      }
      for (int i : arr) {
          System.out.print(i);
      }
    }

public static void main(String[] args)
{
    int[] arr={2,-1,-3,4,5,-8};
    OneSide obj=new OneSide();
    obj.shiftt(arr);
}
}


