public class GCD extends Calculate {

    // implementing setResult method from Abstract class Calculate to set the integer value to class attribute 'result'
    @Override
    void setResult(Object res) {
        result = (Integer) res;
    }

    // implementing getResult() method from Abstract class Calculate to return the integer value to class attribute 'result'
    @Override
    public Integer getResult() {
        return (Integer)result;
    }

    // implementing Calculate.calculate() method to calculate GCD operation
    @Override
    public void calculate(Integer num1, Integer num2) {

        this.setResult(calculateGCD(num1, num2));
    }

    // method calculates GCD of two numbers a and b which are passed during calculation
    private Integer calculateGCD(int a, int b) {
        if (a == 0 && b == 0){
            this.setResult(null);
            return null;
        }
        if (b == 0) {
            return a;
        }
        return calculateGCD(b,a % b);
    }
    // implementing Calculate.printResult() method to print the output in appropriate format based on GCD calculation
    @Override
    public void printResult(Object num1, Object num2) {
        System.out.println("The GCD of "+ num1.toString()+ " and "+ num2.toString() + " is " + getResult().toString());
    }

    public void printInvalidGCD(){
        System.out.println("The GCD calculation is not valid");
    }
}
