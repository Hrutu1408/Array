public class Triplet
{
     int[] find(int[] arr,int sum)
     {
         int a=0;
         int b=0;
         int c=0;
         int n=arr.length-1;
         for(int i=0;i<n/3;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 for(int k=j+1;j<n;j++)
                 {
                     if(sum=)
                 }
             }
         }
         return  new int[]{a,b,c};      
     }
    public static void main(String[] args)
    {
        int[] arr={1,2,5,7,3};
        int sum=11;
        Triplet tt=new Triplet();
        for (int i : tt.find(arr, sum))
        {
            System.out.println(i);
        }
    }
}
