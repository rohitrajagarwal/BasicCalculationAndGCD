public final class Addition extends Calculate{

    // implementing setResult method from Abstract class Calculate to set the integer value to class attribute 'result'
    @Override
    void setResult(Object res) {
        result = (Integer) res;
    }

    // implementing getResult() method from Abstract class Calculate to return the integer value to class attribute 'result'
    @Override
    public Integer getResult() {
        return (Integer) result;
    }

    // implementing Calculate.calculate() method to perform addition operation
    @Override
    public void calculate(Integer num1, Integer num2) {
        this.setResult(num1 + num2);
    }

    // implementing Calculate.printResult() method to print the output in appropriate format based on addition operation
    @Override
    public void printResult(Object num1, Object num2) {
        System.out.println("Addition : "+ num1.toString()+ " + "+ num2.toString() + " = " + getResult().toString());
    }

}
