import java.util.Arrays;

public class Arrayelmove {

    public static void main(String[] args) {

        int[] first = new int[]{45, 78, 36, 65};
        int[] result = new int[first.length];

        System.out.println("The Array Elements");
        System.out.println();

        for (int i = 0; i < result.length; i++) {
            System.out.print(" [" + first[i] + "]");


        }
//        OutPut Formatting
        System.out.println();
        System.out.println();
        System.out.println("The Result After Moved Element");
        System.out.println();

//        Movement Commands
        System.arraycopy(first, 0, result, 1, first.length - 1);
        result[0] = first[first.length - 1];
        System.out.println(Arrays.toString(result));


    }


}
