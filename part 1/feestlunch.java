import java.util.Scanner;
@SuppressWarnings("resource")

public class feestlunch {
    final public static double prijsCroissantje = 0.39, prijsStokbroodje = 2.78, korting = 0.5;
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hoeveel croissantjes wilt u?");
        int aantalCroissantjes = userInput.nextInt();

        System.out.println("Hoeveel stokbroodjes wilt u?");
        int aantalStokbroodjes = userInput.nextInt();

        System.out.println("Hoeveel kortingsbonnen heeft u?");
        int aantalBonnen = userInput.nextInt();

        double kosten = aantalCroissantjes * prijsCroissantje + aantalStokbroodjes * prijsStokbroodje - aantalBonnen * korting;
        System.out.printf(
            "De feestlunch kost je bij de bakker %.2f euro voor de %d croissantjes en de %d stokbroden als de %d kortingsbonnen nog geldig zijn!", 
            kosten, aantalCroissantjes, aantalStokbroodjes, aantalBonnen
            );
    }
}
