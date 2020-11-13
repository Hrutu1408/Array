public class MinOps
{
    void ops(int[] arr)
    {
        int ans=0;
        for (int i : arr) {
            System.out.print(i+" ");
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            if(arr[start]==arr[end])
            {
                start++;
                end--;
            }
            else if(arr[start]<arr[end])
            {
                start++;
                arr[start]+=arr[start-1];
                ans++;
            } 
            else
            {
                    end--;
                    arr[end]+=arr[end+1];
                    ans++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        int[] arr={1,4,5,9,1};
        new MinOps().ops(arr);
    }
}
