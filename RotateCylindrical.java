public class RotateCylindrical
{
    void Rotatee(int[] arr)
    {
        int n=arr.length-1;
        int tmp = arr[n];
        int i=n-1;
        while(i>=0)
        {
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=tmp;
        for (int x : arr){
            System.out.print(" "+x);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        RotateCylindrical rot=new RotateCylindrical();
        rot.Rotatee(arr);   
    }
}
