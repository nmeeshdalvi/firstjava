

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5,6, 7, 8, 9};

        int cloneArray[] =  Array.clone();

        //deep copy is created folling print statement will print false
        System.out.println(Array == cloneArray);

        for (int i=0; i < cloneArray.length; i++){
            System.out.println(cloneArray[i]+" ");
        }
    }
}