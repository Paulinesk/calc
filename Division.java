public class Division {
    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction answer;
    private Fraction answer1;
    private int num = 1;
    private int denom = 1;

    public Division(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        this.answer1 = new Fraction();
        this.num = this.num + num;
        this.denom = this.denom + denom;
        // 2 аргумента
        answer.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        answer.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
        // 1 аргумент
        answer1.setNumerator(this.num * fraction2.getDenominator());
        answer1.setDenominator(this.denom * fraction2.getNumerator());
    }

    public void display() {
        if (fraction2.getNumerator() == 0) {
            System.out.println("Нельзя делить на 0.");
            return;
        } else {
            Messages.displayAnswer("Результат деления", "/", fraction1, fraction2, answer, answer1);
        }
    }
}
