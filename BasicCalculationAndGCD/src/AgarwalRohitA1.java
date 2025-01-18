/*
 * Source referred and/or used to complete the assignment
 *
 * Source1: https://www.geeksforgeeks.org/
 * Source2: https://stackoverflow.com/
 * Source3: https://www.w3schools.com/java/
 * Source4: https://www.tutorialspoint.com/java_generics/index.htm
 * Source5: IntelliJ IDE's feature: https://www.jetbrains.com/help/idea/full-line-code-completion.html
 * Source6: IntelliJ IDE's feature: https://www.jetbrains.com/help/idea/class-diagram.html
 *
 */
public class AgarwalRohitA1 {

    private Integer number1;
    private Integer number2;

    // Constructors for the Class: AgarwalRohitA1
    // setting 'number1' and 'number2' as null to denote initiate state of numbers
    public AgarwalRohitA1() {
        number1 = null;
        number2 = null;
    }

    // getters and setter methods for number1 and number2
    public Integer getNumber1(){
        return number1;
    }
    public Integer getNumber2(){
        return number2;
    }
    public void setNumber1(Integer num1){
        number1 = num1;
    }
    public void setNumber2(Integer num2){
        number2 = num2;
    }


    public static void main(String[] args){

        // creating 'ragaA1' object to allocate memory for first and second integer common to all operations that follow
        AgarwalRohitA1 ragaA1 = new AgarwalRohitA1();

        // check if there are exactly two argument passed to the program or not
        if (Utility.validateArgumentCount(args)){
                // execute this block - if there are exactly 2 arguments

                // check if the first at command line argument is an integer or not.
                if(Utility.checkIfArgsANumber(args[0]) == null){
                    // if the first argument at command line is not an Integer then, print usage instruction, program completion message and exit
                    Utility.printUsageInstructions();
                    Utility.printProgramCompletion();
                    return;
                }else{
                    // if the first argument at commandline is an Integer, set 'AgarwalRohitA1.number1' variable
                    ragaA1.setNumber1(Utility.convertArgsToNumber(args[0]));
                }

                // check if the second command line argument is an integer or not.
                if(Utility.checkIfArgsANumber(args[1]) == null){
                    // if the second argument at commandline is not an Integer then, print usage instruction, program completion message and exit
                    Utility.printUsageInstructions();
                    Utility.printProgramCompletion();
                    return;
                }else{
                    //  if the second argument at commandline is an Integer, set 'AgarwalRohitA1.number2' variable
                    ragaA1.setNumber2(Utility.convertArgsToNumber(args[1]));
                }

                // check if the values are set accurately before performing calculations
                if(ragaA1.getNumber1() != null && ragaA1.getNumber2() != null){

                    // creating objects of individual operation if and only if the input values are sanitized and assigned to 'ragaA1' attributes
                    Addition addition = new Addition();
                    Subtraction subtraction = new Subtraction();
                    Multiplication multiplication = new Multiplication();
                    Division division = new Division();
                    Modulus modulus = new Modulus();
                    GCD gcd = new GCD();

                    // add the first and the second commandline arguments and assign the result within the 'addition' object
                    addition.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // subtract the second from the first commandline argument and assign the result within the 'subtraction' object
                    subtraction.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // multiply the first and the second commandline argument and assign the result within the 'multiplication' object
                    multiplication.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // divide the first by the second commandline argument and assign the result within the 'division' object
                    division.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // calculate the remainder when the first commandline argument is divided by the second commandline argument and assign the result within the 'modulus' object
                    modulus.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // calculate the Greatest Common Divisor of the first and the second commandline arguments and assign the result within the 'gcd' object
                    gcd.calculate(ragaA1.getNumber1(), ragaA1.getNumber2());

                    // following 6 statements will print the message in appropriate format and values based on respective operation
                    addition.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());
                    subtraction.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());
                    multiplication.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());
                    division.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());
                    modulus.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());

                    if (gcd.getResult() == null){
                        gcd.printInvalidGCD();
                    }else{
                        gcd.printResult(ragaA1.getNumber1(), ragaA1.getNumber2());
                    }


                }else {
                    // if the values are not set accurately before performing calculations, print usage, program completion and exit
                    Utility.printUsageInstructions();
                }
        }else{
            // execute this block - if there are less or more than 2 arguments
            Utility.printUsageInstructions();

        }

        // print program completed message
        Utility.printProgramCompletion();
    }
}
