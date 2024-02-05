public class calculator {
    float num1;
    float num2;
    calculator(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    float add() {
        return num1+num2;
    }
    float subtract() {
        return num1-num2;
    }
    float multiply() {
        return num1*num2;
    }
    float divide() {
        if (num2!= 0) {
            return num1/num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return num1;
        }
    }
    public static void main(String[] args) {
        calculator calculator = new calculator(10, 5);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}
