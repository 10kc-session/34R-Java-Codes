package conditional.statements;

public class BonusCalculator {
	public double calculateBonus(int experience, int rating, double salary) {
		if (experience > 5 && rating > 9) {
			return 0.5 * salary;
		} else if ((experience >= 3 && experience <= 5) && (rating >= 7 && rating <= 9)) {
			return 0.3 * salary;
		} else if ((experience >= 1 && experience <= 3) && (rating >= 5 && rating < 7)) {
			return 0.1 * salary;
		} else {
			return 0.0;
		}
	}
	public static void main(String[] args) {
		BonusCalculator calculator = new BonusCalculator();
		double bonus = calculator.calculateBonus(2, 6, 100000);
		System.out.println("Bonus : " + bonus);
	}
}
