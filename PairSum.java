import jdk.internal.net.http.common.Pair;

public class PairSum
{
    void gtPair(int[] arr,int sum)
    {
        int a=0;
        int b=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    a=arr[i];
                    b=arr[j];
                    System.out.println("A "+a+" B "+b);
                }
            }
        }    
    }
    public static void main(String[] args){
        int[] arr={1,3,4,5,7,2};
        PairSum ss=new PairSum();
        ss.gtPair(arr, 6);
    }
}
