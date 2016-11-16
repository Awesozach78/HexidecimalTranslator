import java.util.Scanner;

public class Binary {

    Scanner scanner;
    int num;

    void getVal() {

        System.out.println("Binary to Hexadecimal");
        scanner = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = Integer.parseInt(scanner.nextLine(), 2);
    }

    void convert() {

        String Hexadecimal = Integer.toHexString(num);

        System.out.println("Hexadecimal Value is : " + Hexadecimal);
    }
}

class MainClass {

    public static void main(String args[]) {

        Binary obj = new Binary();

        obj.getVal();
        obj.convert();
    }
}


