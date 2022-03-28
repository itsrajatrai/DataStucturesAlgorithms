public class ReverseArray{
    public static void main(String[] args)
    {
        int [] arr={45,12,78,96,54};
        int [] rev=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[arr.length-1-i];
        }

        System.out.println("Reverse Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(rev[i]+" ");
        }
    }
}