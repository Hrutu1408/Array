public class Jump
{
    int noofjumps(int[] arr)
    {
        int start=0;
        int cnt=0;
        int end=arr.length-1;
        while(start<end)
        {
            cnt++;
            start+=arr[start];
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        int[] arr={1 ,4, 3, 2, 6, 7};
        System.out.println(new Jump().noofjumps(arr));
    }
}
