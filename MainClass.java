import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        int value1 = 0;
        int value2 = 0;
        String operation = null;
        /*
        String romeValue1 = null;
        String romeValue2 = null;
        String romeOperator = null;

        int I = 1;
        int II = 2;
        int III = 3;
        int IV = 4;
        int V = 5;
        int VI = 6;
        int VII = 7;
        int VIII = 8;
        int IX = 9;
        int X = 10;

         */

        System.out.println("Введите 2  целых числа: ");
        Scanner scanner = new Scanner(System.in);
        if (value1 < 0 || value2 > 10) {
            System.out.println("error");
        }
        if (value1 > 0 || value1 < 10) {
            value1 = scanner.nextInt();
            operation = scanner.next();
            value2 = scanner.nextInt();
        }

        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        }

        if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }

        if (operation.equals("*")) {
            System.out.println(value1 * value2);
        }

        if (operation.equals("/")) {
            System.out.println(value1 / value2);
        }

     /*   System.out.println("&#x412;&#x432;&#x435;&#x434;&#x438;&#x442;&#x435; 2  &#x446;&#x435;&#x43b;&#x44b;&#x445; &#x447;&#x438;&#x441;&#x43b;&#x430;: ");
        new Scanner(System.in);
        if (romeValue1.equals(Integer.valueOf(I)) || romeValue1.equals(Integer.valueOf(X))) {
            romeValue1 = scanner.nextLine();
            romeOperator = scanner.next();
            romeValue2 = scanner.nextLine();
        }

        if (romeValue1.equals("I") && romeValue2.equals("I")) {
            return 1;
        } else if (romeValue1.equals("II") && romeValue2.equals("II")) {
            return 2;
        } else if (romeValue1.equals("III") && romeValue2.equals("III")) {
            return 3;
        } else if (romeValue1.equals("IV") && romeValue2.equals("IV")) {
            return 4;
        } else if (romeValue1.equals("V") && romeValue2.equals("V")) {
            return 5;
        } else if (romeValue1.equals("VI") && romeValue2.equals("VI")) {
            return 6;
        } else if (romeValue1.equals("VII") && romeValue2.equals("VII")) {
            return 7;
        } else if (romeValue1.equals("VIII") && romeValue2.equals("VIII")) {
            return 8;
        } else if (romeValue1.equals("IX") && romeValue2.equals("IX")) {
            return 9;
        } else if (romeValue1.equals("X") && romeValue2.equals("X")) {
            return 10;
        } else
            System.out.println("error!");


        return value1;

      */

    }
}
