public class toCompute {
    // Man i sure love vars taking 4 words to define
    public static int budget = 88;
    public static int aantalBanden = 2;
    public static double bandPrijs = 27.98;
    public static int bandArbeid = 15;
    public static double moneyLeft = budget - aantalBanden * (bandPrijs + bandArbeid);
    public static void main(String[] args){
        System.out.println(moneyLeft);
    }
}
