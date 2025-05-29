public class LogicalOperators {
    public static void main(String[] args) {
        

    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
    boolean result;

    //Logical OR Operator
    result = (num1 < num2) || (num2 < num3);
    System.out.println("Logical OR result: " + result);

    //Logical AND Operator
    result = (num1 < num2) && (num2 < num3);
    System.out.println("Logical AND result: " + result);

    //Logical NOT Operator
    result = !(num1 < num2);
    System.out.println("Logical NOT result: " + result);
}
}
