import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // System.out.println(getString("Hvad hedder du?"));

        System.out.println(getInt("angiv venligt din skostørrelse"));
        System.out.println(getInt("angiv venligt din højde"));

    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + ": ");
        return scanner.nextLine();

    }

    public static int getInt(String s){

        int res;

        while (true) {
            try {
                res = Integer.parseInt(getString(s));
                return res;
            } catch (Exception e){
                System.out.println("Husk ikke tal ord");
            }
        }
    }




}
