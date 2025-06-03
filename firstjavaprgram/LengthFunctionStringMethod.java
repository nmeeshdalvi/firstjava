public class LengthFunctionStringMethod {
    public static void main(String[] args) {
        
        //String declaration without using new operator
        String a = "Cooking";
        System.out.println("String b = " + a);

        //String declaration using new operator
        String b = new String("Iot");
        System.out.println("String b = " + b);
        
        //Using length() method to find the length of the string
        System.out.println("The length of the string for a: "+ a.length());
        System.out.println("The length of the string for b: "+ b.length());

        //Using toUpperCase() method to convert the string to uppercase
        System.out.println("String a in uppercase: " + a.toUpperCase());
        System.out.println("String b in uppercase: " + b.toUpperCase());
    }
}
