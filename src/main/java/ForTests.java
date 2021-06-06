import java.util.Arrays;

public class ForTests {

    public static int[] afterFour (int[] arr) {
        int check = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 4) {
                check= i;
            }
        }
        if (check == 0) {
            throw new RuntimeException("Нет 4");
        }
        if (check == arr.length - 1) {
            return new int[0];
        } else {
            return Arrays.copyOfRange(arr, check + 1, arr.length);
        }
    }
    public static boolean checkOneFor(int[] arr){
        boolean check1 = false;
        boolean check4 = false;

        for (int s : arr) {
            if (s == 1) {
                check1 = true;
            }
            if ( s == 4) {
                check4 = true;
            }
            if ( s != 1 && s != 4) {
                return false;
            }

        }
        return check1 && check4;
    }

}
