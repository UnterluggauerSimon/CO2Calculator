public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int result1 = 0;
        int result2 = 0;
        String resulttxt1 = "";
        String resulttxt2= "";

        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;

        array2[0] = 7;
        array2[1] = 1;
        array2[2] = 3;

        for (int i = 0; i < array1.length;i++)
        {
            result1 = array1[i] + array2[i];
            if (resulttxt1.equals(""))
            {
                resulttxt1 = (result1);
            }
            resulttxt1 = resulttxt1 + "," + result1
            result2 = array1[i] * array2[i];
        }

        System.out.println("+" + result1);
        System.out.println("*" + result2);
    }
}
