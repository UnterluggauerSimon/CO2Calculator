import java.util.Arrays;

public class InvoiceBuilderApp
{
    public static void main(String[] args)
    {
//        double article1 = 0;
//        double article2 = 0;
//        double article3 = 0;
//        double article4 = 0;
//        double article5 = 0;
//
//        double sum = article1 + article2 + article3 + article4 + article5;
//
//        System.out.println("Gesamtkosten: " + sum);

        double[] articles = new double[5];
        double sum = 0;

        articles[0] = 2.4; //Kaffee
        articles[1] = 2.0; //Kipferl
        articles[2] = 2.9; //Joghurt

        for (int i = 0; i < articles.length; i++)
        {
            sum += articles[i];
        }

        System.out.println("Gesamtkosten: " + sum);
    }
}
