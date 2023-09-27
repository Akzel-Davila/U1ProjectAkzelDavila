import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Total Bill

        System.out.println("Welcome to the tip Calculator!");
        System.out.print("How much was the total bill?: ");
        double originalBill = Double.parseDouble(s.nextLine());
        //Percentage is inputted and calculations are done

        System.out.print("What percent would you like to tip? ");
        double tipPercent = Double.parseDouble(s.nextLine());
        double tipDecimal = tipPercent/100;
        double totalBillTip = (tipDecimal * originalBill) + originalBill;

        //Party Amount is asked for and calculations regarding amount per person and total bill are done
        System.out.print("How many people are in your party? ");
        int partyAmount = Integer.parseInt(s.nextLine());
        double personTotal = originalBill/partyAmount;
        double totalTip = (tipDecimal * originalBill);
        double personTip = totalTip/partyAmount;
        personTotal= personTotal + personTip;

        //Print statements are done
        System.out.print("The total tip amount is $" );
        System.out.format("%.2f", totalTip);
        System.out.println();
        System.out.print("The total bill including tip is $");
        System.out.format("%.2f", totalBillTip);
        System.out.println();
        System.out.print("The tip per person is $");
        System.out.format("%.2f", personTip);
        System.out.println();
        System.out.print("The total per person is ");
        System.out.format("%.2f", personTotal);
        System.out.println();



    }
}