import org.w3c.dom.css.Counter;

public class FindEven
{
    public static void main(String[] args)
    {
        int counter = 1;
        int input = 10;
        Boolean ForSchleife = true;

        if (ForSchleife == false)
        {
            while (counter <= input)
            {
                printEvenNumber(counter);
                counter++;
            }
        }
        else
        {
            for (int i = 1; i <= 10; i++)
            {
                printEvenNumber(i);
            }
        }
    }

    public static void printEvenNumber(int counter)
    {
        if (counter % 2 == 0)
        {
            System.out.println(counter);
        }
    }
}
