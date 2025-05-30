public class MultiDimensionalArrayString {
    public static void main(String[] args) {
        String Array[][] = {
            {"one", "two", "three", "four", "five"},
            {"six", "seven", "eight", "nine", "ten"}
        };

        String cloneArray[][] = Array.clone();

        // Shallow copy: following print statements will print true
        System.out.println(Array[0] == cloneArray[0]);  // true
        System.out.println(Array[1] == cloneArray[1]);  // true

        System.out.println("Array elements: " + cloneArray[0][0] + " " + cloneArray[0][1] + " " + cloneArray[0][2] + " " + cloneArray[0][3] + " " + cloneArray[0][4]);
        System.out.println("Array elements: " + cloneArray[1][0] + " " + cloneArray[1][1] + " " + cloneArray[1][2] + " " + cloneArray[1][3] + " " + cloneArray[1][4]);
    }
}
