public final class Utility {

    public static int convertArgsToNumber(String commandLineArg){
        return Integer.parseInt(commandLineArg);
    }
    public static String checkIfArgsANumber(String commandLineArg){
        try{
            Integer.parseInt(commandLineArg);
        }catch(NumberFormatException e){
            return null;
        }
        return commandLineArg;

    }


    public static void printUsageInstructions(){
        System.out.println("Usage: java AgarwalRohitA1 number1 number2");
    }
    public static void printProgramCompletion(){
        System.out.println("\nProgram Completed.");
    }
    public static boolean validateArgumentCount(String[] args){
        /*
            Function: validateArgumentCount(String[])
            Purpose:
                1. Check if there are two arguments or not
            Output:
                1. "false" if the count of arguments is not 2
                2. "true" if there are exactly 2 arguments passed to the Java program

         */
        if (args.length != 2){
            return false;
        }
        return true;
    }
}
