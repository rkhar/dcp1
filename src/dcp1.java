import java.util.Arrays;
import java.util.Scanner;

public class dcp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of an array: ");
                int len = sc.nextInt();
            System.out.println("Enter the elements of an array with the length " + len + " : ");
                int[] arr = new int[len];
                for(int i = 0; i < len; i++)
                    arr[i] = sc.nextInt();
            System.out.println("Enter the searching number: ");
                int target = sc.nextInt();

        System.out.println(Arrays.toString(dcp1(arr, target)));
    }

    public static int[] dcp1(int[] anyArray, int target){
        int a = 0, b = 0;

        Arrays.sort(anyArray);

        int sum = 0;
        for(int i = 0, j = anyArray.length-1; i < j;){
            sum = anyArray[i] + anyArray[j];
            if(sum == target) return new int[]{anyArray[i], anyArray[j]};
            else if(sum < target) i++;
            else if(sum > target) j--;
        }
        return new int[]{};
    }
}
