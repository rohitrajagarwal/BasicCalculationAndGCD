abstract public class Calculate {
    /*
        Class Calculate is declared as a generic class in order to implement based on individual operators
     */

    // result variable to store the result. Type is generic to change based on the operation
    protected Object result;

    // getters and setters for class variable 'result'
    abstract void setResult(Object res);
    abstract Object getResult();

    // calculate to implement the desired operations based on the string operator
    abstract public void calculate(Integer num1, Integer num2);

    // generates a printable message based on operations
    abstract public void printResult(Object num1, Object num2);

}

