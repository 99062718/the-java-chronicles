public class feestlunch {
    public static int aantalCroissantjes = 17, aantalStokbroodjes = 2, aantalBonnen = 3;
    final public static double prijsCroissantje = 0.39, prijsStokbroodje = 2.78, korting = 0.5;
    
    public static double kosten = aantalCroissantjes * prijsCroissantje + aantalStokbroodjes * prijsStokbroodje - aantalBonnen * korting;
    public static void main(String[] args){
        System.out.println(kosten);
    }
}
