import java.util.*  ;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class Ch28_3 {
    static void printKMax(int[] arr, int n, int k)
    {
        int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
    static void printKMin(int arr[], int n, int k)
    {
        int j, min;
        for (int i = 0; i <= n - k; i++) {
            min = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] < min)
                    min = arr[i + j];
            }
            System.out.print(min + " ");
        }
    }
    public static void main(String[] args) {
        int[] arrayOfNumber = new int[10];
        double[] arrayOfNumber2 = new double[8];
        Random rand = new Random();
        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = rand.nextInt(99);
        }
        System.out.println("Modified arr[] : "+ Arrays.toString(arrayOfNumber));
        int jointSearchOfArray = 3;
        printKMax(arrayOfNumber, arrayOfNumber.length, jointSearchOfArray);
        printKMin(arrayOfNumber, arrayOfNumber.length, jointSearchOfArray);
        arrayOfNumber2= printKAvg(arrayOfNumber,jointSearchOfArray);
        final int[] intArray = new int[arrayOfNumber2.length];
        for (int i=0; i<intArray.length; ++i)
            intArray[i] = (int) arrayOfNumber2[i];
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf(" "+intArray[i]);
        }
    }
    public static double[] printKAvg(int[] nums, int k) {
        Comparator<Integer> comparator = (i, j) -> (nums[i] == nums[j]) ?
                (i - j) :
                Integer.compare(nums[i], nums[j]);

        var result = new double[nums.length - k + 1];
        var left = new TreeSet<>(comparator.reversed());
        var right = new TreeSet<>(comparator);

        for (var i = 0; i < k; i++)
            left.add(i);

        balance(left, right);
        result[0] = getMedian(k, nums, left, right);

        for (int i = k, j = 1; i < nums.length; i++, j++) {
            if (left.contains(i - k))
                left.remove(i - k);
            else
                right.remove(i - k);

            right.add(i);
            left.add(right.pollFirst());

            balance(left, right);
            result[j] = getMedian(k, nums, left, right);
        }

        return result;
    }

    private static void balance(TreeSet<Integer> left, TreeSet<Integer> right) {
        while (left.size() > right.size())
            right.add(left.pollFirst());
    }

    private static double getMedian(int k, int[] nums, TreeSet<Integer> left, TreeSet<Integer> right) {
        return k % 2 == 0 ?
                nums[left.first()] / 2.0 + nums[right.first()] / 2.0 :
                nums[right.first()];
    }

}
