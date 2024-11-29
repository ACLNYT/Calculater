import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter Your First Number");
      double num1 = scanner.nextDouble();
      System.out.println("Select Your Operator (+, -, *, /, %)");
      System.out.println("Operators: \n +: Addition \n -: Subtraction \n *: Multiplication \n /: Division \n %: Modulus (remainder)");
      String operator = scanner.next();
      System.out.println("Enter Your Second Number");
      double num2 = scanner.nextDouble();

      if (operator.equals("+")) {
        System.out.println(num1 + num2);
      } else if (operator.equals("-")) {
        System.out.println(num1 - num2);
      } else if (operator.equals("*")) {
        System.out.println(num1 * num2);
      } else if (operator.equals("%")) {
        System.out.println(num1 % num2);
      } else if (operator.equals("/")) {
        if (num2 == 0) {
          System.out.println("Cannot Divide By Zero");
        } else {
          System.out.println(num1 / num2);
        }
      }

      System.out.print("Do you want to perform another calculation? (y/n): ");
      String continueChoice = scanner.next();

      if (continueChoice.equalsIgnoreCase("n")) {
        break;
      }
    }
    System.out.println("Exiting the calculator.");
  }
}
