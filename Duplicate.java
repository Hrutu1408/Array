public class Duplicate
{
    void findDuplicates(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                    if(arr[i]==arr[j])
                    {
                        System.out.println(arr[i]);
                    }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,1,5,2};
        Duplicate dd=new Duplicate();
        dd.findDuplicates(arr);      
    }
}