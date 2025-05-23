public class Variables {
    public void StudentAge() {
        // Local variable
        int age = 0;
        age = age + 30;
        System.out.println("Student age is :" + age);
    }



    public static void main(String[] args) {
        //Local variable
        Variables temp = new Variables();
        temp.StudentAge();
    }
}
