public class Calculator implements ICalculator {
	double result;
	double operand1;

	public Calculator(double operand1) {
		this.operand1 = operand1;
	}

	@Override
	public Calculator add(double operand2) {
		operand1 += operand2;
		return this;
	}

	@Override
	public Calculator subtract(double operand2) {
		operand1 -= operand2;
		return this;
	}

	@Override
	public Calculator multiply(double operand2) {
		operand1 *= operand2;
		return this;
	}

	@Override
	public Calculator divide(double operand2) {
		try {
			if (operand1 != 0 && operand2 != 0) {
				operand1 /= operand2;
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return this;
	}

	@Override
	public void printResult() {
		result = operand1;
		System.out.println("Result = " + result);
	}

}
