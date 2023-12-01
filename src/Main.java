// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numArray = 5;
        divisione(array,10);
    }
    public static void divisione(int[]array, int numArray){
        try{
            int result = array[numArray] / 0;
        }catch (ArithmeticException e){
            System.out.println((e));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}