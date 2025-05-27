public class MultiDimensional {
    public static void main(String[] args) {
        //Multidimensiona array decaration
        int[][] arr;

        //intializing the size of row and column respectively
        arr = new int [1][3];

        //initializing he values
        arr[0][0] = 76;  
        arr[0][1] = 35;
        arr[0][2] = 19;

        //displaying the values using index
        System.out.println("The values of the multidimensional array are:");
        System.out.println("arr[0][0] = "+ arr[0][0]);
        System.out.println("arr[0][1] = "+ arr[0][1]);
        System.out.println("arr[0][2] = "+ arr[0][2]);


        
    }
}
