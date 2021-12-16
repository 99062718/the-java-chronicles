public class convertTypeTest {
    public static void main(String[] args){
        int intVar = 10;
        String stringVar = Integer.toString(intVar);
        double doubleVar = (double) intVar;
        intVar = Integer.parseInt(stringVar);
        System.out.println(stringVar);
        System.out.println(doubleVar);
        System.out.println(intVar);
    }
}
