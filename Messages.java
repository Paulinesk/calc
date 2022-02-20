public class Messages {

    public static void displayAnswer(String operation, String operator,
                                     Fraction fraction1, Fraction fraction2, Fraction answer, Fraction answer1) {
        System.out.print(operation + ": ");
        fraction1.display();
        System.out.print(" " + operator + " ");
        fraction2.display();
        System.out.print(" = ");
        answer.display();
        System.out.print("\t");
        System.out.print("С 1 аргументом: ");
        answer1.display();
        System.out.println("\n");
    }
}

