public class Modulus extends Calculate{

    // implementing setResult method from Abstract class Calculate to set the integer value to class attribute 'result'
    @Override
    void setResult(Object res) {
        this.result = (Integer) res;
    }

    // implementing getResult() method from Abstract class Calculate to return the integer value to class attribute 'result'
    @Override
    public Integer getResult() {
        return (Integer)result;
    }

    // implementing Calculate.calculate() method to perform modulus operation
    @Override
    public void calculate(Integer num1, Integer num2) {
        if(!isOperationDivideByZero( num2)) {
            this.setResult(num1%num2);
        }
    }

    private boolean isOperationDivideByZero( Integer n2){
        return n2 == 0;
    }


    // implementing Calculate.printResult() method to print the output in appropriate format based on modulus operation
    public void printResult(Object num1, Object num2) {
        if( isOperationDivideByZero((Integer) num2)){
            System.out.println("Modulus : "+ num1.toString()+ " / "+ num2.toString() + " is invalid ");
        }else {
            System.out.println("Modulus : " + num1.toString() + " / " + num2.toString() + " = " + getResult().toString());
        }
    }
}
