public class Division extends Calculate{

    // implementing setResult method from Abstract class Calculate to set the integer value to class attribute 'result'
    @Override
    void setResult(Object res) {
        result = (Double) res;
    }

    // implementing getResult() method from Abstract class Calculate to return the integer value to class attribute 'result'
    @Override
    public Double getResult() {
        return (Double)result;
    }

    // implementing Calculate.calculate() method to perform division operation
    @Override
    public void calculate(Integer num1, Integer num2) {
        if(!isOperationDivideByZero(num1, num2)) {
            this.setResult(num1.doubleValue() / num2);
        }
    }

    // implementing Calculate.printResult() method to print the output in appropriate format based on division operation
    @Override
    public void printResult(Object num1, Object num2) {
        //check if the attribute Calculate.result has a decimal value or not.

        if (isResultDecimal()){
            // if Calculate.result does not have a decimal, print the result as an integer value.
            System.out.println("Division : "+ num1.toString()+ " / "+ num2.toString() + " = " + getResult().intValue());
        }else{
            // if Calculate.result has a decimal value, then print the result with decimal portion
            if( isOperationDivideByZero((Integer) num1, (Integer) num2)){
                System.out.println("Division : "+ num1.toString()+ " / "+ num2.toString() + " is invalid ");
            }else {
                System.out.println("Division : " + num1.toString() + " / " + num2.toString() + " = " + getResult().toString());
            }
        }
    }

    private boolean isOperationDivideByZero(Integer n1, Integer n2){
        if (n2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // this method checks if the attribute Calculate.result has a decimal value or not.
    boolean isResultDecimal(){
        /*
         * returns 'true' if there is no decimal value in Calculate.result attribute
         * returns 'false' if there is decimal value in Calculate.result attribute.
         * */
        if (getResult() != null){
            return getResult() % 1 == 0;
        }else{
            return false;
        }

    }
}
