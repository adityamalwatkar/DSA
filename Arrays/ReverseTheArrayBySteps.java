import java.util.ArrayList;
import java.util.List;

public class ReverseTheArrayBySteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int step = 2;

        List<Integer> resp = rotateArray(arr, step);

        for (int a : resp) {
            System.out.print(a + " ");
        }
    }

    public static List<Integer> rotateArray(int[] arr, int step) {
        List<Integer> resp = new ArrayList<>();

        for (int i = step; i < arr.length; i++) {
            resp.add(arr[i]);
        }

        for (int i = 0; i < step; i++) {
            resp.add(arr[i]);
        }

        return resp;
    }
}
