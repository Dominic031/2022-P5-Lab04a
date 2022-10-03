public class Lab04
{
    public static void main (String[] args)
    {
        System.out.println ("Lab04, student Version \n");

        double principal = 250000;
        double annualRate = 4.85;
        double numYears = 30;
        double monthRate = (annualRate/100) / 12;
        double numMonths = numYears * 12;

        double numerator = monthRate * Math.pow(1+ monthRate, numMonths);
        double denominator = Math.pow(1 + monthRate,numMonths) - 1;
        double monthlyPay = (numerator / denominator) * principal;
        double totalPayments = ( monthlyPay * numMonths);
        double totalInterest = (totalPayments - principal);


        System.out.println ("Principal: " + principal);
        System.out.println ("annualRate:" + annualRate );
        System.out.println ("numYears: "+ numYears);
        System.out.println ("mothPay: " + monthlyPay);
        System.out.println ("total payments: " + totalPayments);
        System.out.println ("Total interest: " + totalInterest );




    }





















}
