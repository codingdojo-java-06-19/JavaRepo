public class Test {
	public static void main(String[] args) {
		Calculator mathematician = new Calculator();
		mathematician.setOperandOne(10.5);
		mathematician.setOperation("*");
		mathematician.setOperation("+");
		mathematician.setOperandTwo(5.2);
		mathematician.performOperation();
		mathematician.resetOperands();
	}
}