// * * * CLASS * * * //
public class Calculator2{


    // * * * CONSTRUCTOR * * * //
    public Calculator2(){
    }

    // * * * MAIN METHOD * * * //
    public static void main(String[] args){
        Calculator2 myCalculator = new Calculator2();

          Double a = Double.parseDouble(args[0]); //args[0] -> first argument inputed in CMD
          Double b = Double.parseDouble(args[2]); //args[2] -> third argument inputed in CMD. Second argument (args[1]) is the operation.

          //Addition
          if (args[1].equals("+") || args[1].equals("plus")) {
            Double sum = a + b;
            System.out.println(sum);

          //Subtraction
          } else if (args[1].equals("-") || args[1].equals("minus")) {
            double minus = a - b;
            System.out.println(minus);

          //Multiplication
          } else if (args[1].equals("*") || args[1].equals("times")) {
            double multiply = a * b;
            System.out.println(multiply);

          //Division
          } else if (args[1].equals("/") || args[1].equals("divide")) {
            double division = a / b;
            System.out.println(division);

          //If incorrect symbol is used
          } else{
            System.out.println("Error: Only + - * / are accepted operations.");
          }
    }
}
