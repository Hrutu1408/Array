public class LargestSum
{
    int maxSubarraySum(int arr[], int n)
    {
        int current;
        int global;
        current=global=arr[0];
        for(int i=1;i<n-1;i++)
        {
            current=Math.max(arr[i],current+arr[i]);
            if(current >= global)
            {
                global=current;
            }
        }
        return global;
    }
    public static void main(String[] args) {
        LargestSum sum=new LargestSum();
        int []arr={-1,-2,-3,-4};
        int n=4;
        System.out.println(sum.maxSubarraySum(arr, n)); 
    }
}