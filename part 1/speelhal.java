import java.util.Scanner;

public class speelhal {
    final public static double entrancePrice = 7.45, VIPVRprice = 0.37;

    public static void main(String[] args){
        Scanner userAnswer = new Scanner(System.in);
        
        System.out.println("How many people are coming?");
        int amountPeople = userAnswer.nextInt();

        System.out.println("How many minutes will you each spend in the VIP Vr room?");
        int minInVIPVR = userAnswer.nextInt();

        userAnswer.close();

        double totalPrice = amountPeople * entrancePrice + amountPeople * (minInVIPVR / 5 * VIPVRprice);
        System.out.printf(
            "Dit geweldige dagje-uit met %d mensen in de Speelhal met %d minuten VR kost je maar %.2f euro",
            amountPeople, minInVIPVR, totalPrice
            );
    }
}
