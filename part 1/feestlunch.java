public class feestlunch {
    public static int aantalCroissantjes = 17;
    public static double prijsCroissantje = 0.39;
    public static int aantalStokbroodjes = 2;
    public static double prijsStokbroodje = 2.78;
    public static int aantalBonnen = 3;
    public static double korting = 0.5;
    public static double kosten = aantalCroissantjes * prijsCroissantje + aantalStokbroodjes * prijsStokbroodje - aantalBonnen * korting;
    public static void main(String[] args){
        System.out.println(kosten);
    }
}
