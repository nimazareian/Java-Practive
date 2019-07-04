// * * * CLASS * * * //
public class Calculator{


    // * * * CONSTRUCTOR * * * //
    public Calculator(){
    }


    //Addition Method
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Subtraction Mathod
    public int subtract(int a, int b){
        int total = a - b;
        return total;
    }

    //multiplication Method
    public int multiplication(int a, int b){
        int product = a * b;
        return product;
    }

    //Division Method
    public int division(int a, int b){
        int divide = a / b;
        return divide;
    }

    //Modulo Remainder Method
    public int modulo(int a, int b){
        int remainder = a % b;
        return remainder;
    }


    // * * * MAIN METHOD * * * //
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        //Add 5 and 7
        System.out.println(myCalculator.add(5, 7));

        //Subtract 45 and 11
        System.out.println(myCalculator.subtract(45, 11));

        //multiplication of 17 and 19
        System.out.println(myCalculator.multiplication(17, 19));

        //Remainder of 321 devided by 7
        System.out.println(myCalculator.modulo(321, 7));
    }

}
