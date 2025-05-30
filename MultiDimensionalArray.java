public class MultiDimensionalArray {
    public static void main(String[] args) {
        int Array[][ ] = {{1,2,3,4,5},{6,7,8,9,10}};

        int cloneArray[][] = Array.clone();

        //shallow copy is created following print statement will print false
        System.out.println(Array[0] == cloneArray[0]);
        System.out.println(Array[1] == cloneArray[1]);

        System.out.println("Array elements:" + cloneArray[0][0] + " " + cloneArray[0][1] + " " + cloneArray[0][2] + " " + cloneArray[0][3] + " " + cloneArray[0][4]);
        System.out.println("Array elements:" + cloneArray[1][0] + " " + cloneArray[1][1] + " " + cloneArray[1][2] + " " + cloneArray[1][3] + " " + cloneArray[1][4]);
}
}
