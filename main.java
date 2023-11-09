import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        double number1 , number2 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("choose your operator: + , _ , / , * ");
         String operator = sc.next();

        System.out.println("enter your first number");
        number1 = sc.nextDouble();
        System.out.println("enter your second number");
        number2 = sc.nextDouble();

        if (operator.equals( "+")) {
            double result = number1 + number2;
            System.out.println(result);
        }
            else if (operator.equals( "-")) {
            double result = number1 - number2;
            System.out.println(result);
        }
                 else if (operator.equals( "*")) {
            double result = number1 / number2;
            System.out.println(result);
        }
        else if (operator.equals( "/")) {
            double result = number1 * number2;
            System.out.println(result);
        }
        else {
            System.out.println("operator invalid");




        }


    }
}
