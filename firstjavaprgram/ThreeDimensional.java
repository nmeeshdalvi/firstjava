public class ThreeDimensional {
    public static void main(String[] args) {

        //Array created and initialized
        int[][][] arr = {{
            {1, 2},
            {4, 5}
        }, {
            {7, 8},
            {10, 11}
        }};

        //displaying x,y,z in ,multidimensional array
        //dimensional array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        //printing the values of the 3D array
        System.out.println("The values of the 3D array are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++){
                    System.out.println("arr[" +i+"]["+j+"]["+k+"] = "+arr[i][j][k]);
                }
            }
        }
    }
}
