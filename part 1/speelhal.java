public class speelhal {
    public static int amountPeople = 4, minInVIPVR = 45;
    final public static double entrancePrice = 7.45, VIPVRprice = 0.37;
    public static double totalPrice = amountPeople * entrancePrice + amountPeople * (minInVIPVR / 5 * VIPVRprice);
    public static void main(String[] args){
        System.out.printf(
            "Dit geweldige dagje-uit met %d mensen in de Speelhal met %d minuten VR kost je maar %.2f euro",
            amountPeople, minInVIPVR, totalPrice
            );
    }
}
