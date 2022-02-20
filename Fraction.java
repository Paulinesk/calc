import java.util.Scanner;

public class Fraction {
    private static Scanner in = new Scanner(System.in);
    private int num;
    private int denom;

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        do {
            System.out.println("Введите числитель и знаменатель первой дроби.");
            System.out.print("Числитель: ");
            try {
                fraction1.setNumerator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            System.out.print("Знаменатель: ");
            try {
                fraction1.setDenominator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            if (fraction1.getDenominator() == 0) {
                System.out.println("Ошибка: Знаменатель не может быть равен 0");
            }
        } while (fraction1.getDenominator() == 0);

        System.out.print("Первая дробь: ");
        fraction1.display();
        System.out.println("\n");

        do {
            System.out.println("Введите числитель и знаменатель второй дроби.");
            System.out.print("Числитель: ");
            try {
                fraction2.setNumerator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            System.out.print("Знаменатель: ");
            try {
                fraction2.setDenominator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            if (fraction2.getDenominator() == 0) {
                System.out.println("Ошибка: Знаменатель не может быть равен 0");
            }
        } while (fraction2.getDenominator() == 0);

        System.out.print("Вторая дробь: ");
        fraction2.display();
        System.out.println("\n");

        //Сложение
        Addition addition = new Addition(fraction1, fraction2);
        addition.display();
        //Вычитание
        Subtraction subtraction = new Subtraction(fraction1, fraction2);
        subtraction.display();
        //Умножение
        Multiplication multiplication = new Multiplication(fraction1, fraction2);
        multiplication.display();
        //Деление
        Division division = new Division(fraction1, fraction2);
        division.display();
    }

    public int getDenominator() {
        return denom;
    }

    public void setDenominator(int denom) {
        this.denom = denom;
    }

    public int getNumerator() {
        return num;
    }

    public void setNumerator(int num) {
        this.num = num;
    }

    public void display() {
        if (num == 0 || denom == 1) {
            System.out.print(num);
        } else {
            if ((num < 0 && denom < 0) || (num > 0 && denom < 0)) {
                num *= -1;
                denom *= -1;
            }
            if (num == denom) {
                num = 1;
                denom = 1;
                System.out.print(this.num + "/" + this.denom);
                return;
            }
            System.out.print(this.num + "/" + this.denom);
        }
    }
}