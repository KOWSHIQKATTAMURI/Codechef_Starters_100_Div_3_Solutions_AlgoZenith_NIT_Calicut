import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //to check if odd index elements values are less than adjacent even index elements values
    static boolean verify_one(int[] arr, int n){
        for(int i = 1; i < n - 1; i++){
            if(i%2 == 1){
                if(arr[i - 1] >= arr[i] || arr[i] <= arr[i + 1]){
                    return false;
                }
            }else{
                if(arr[i - 1] <= arr[i] || arr[i] >= arr[i + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    //to check if even index elements values are less than adjacent odd index elements values
    static boolean verify_two(int[] arr, int n){
        for(int i = 1; i < n - 1; i++){
            if(i%2 == 1){
                if(arr[i - 1] <= arr[i] || arr[i] >= arr[i + 1]){
                    return false;
                }
            }else{
                if(arr[i - 1] >= arr[i] || arr[i] <= arr[i + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }

            //we are not worried about the position/index of the elements
            //only the element has significance but not its position as we are given the freedom to swap any element with an another element
            Arrays.sort(arr);

            //choice_one is the array in which odd index elements values are more than the adjacent even elements values.
            //choice_two is the array in which even index elements values are more than the adjacent odd elements values.
            int[] choice_one = new int[n], choice_two = new int[n];
            //idx_one is for choice_one array. 
            int idx_one = 0, idx_two = 1;
            for(int i = 0; i < n; i++){
                //once idx_one crosses or equals to value of n, then put it equal to 1 as we need to start filling the odd indices.
                if(idx_one >= n){
                    idx_one = 1;
                }
                choice_one[idx_one] = arr[i];
                idx_one += 2;
            }
            
            //idx_two is for choice_two array.
            for(int i = 0; i < n; i++){
                //once idx_two crosses or equals to value of n, then put it equal to 0 as we need to start filling the even indices.
                if(idx_two >= n){
                    idx_two = 0;
                }
                choice_two[idx_two] = arr[i];
                idx_two += 2;
            }
            
            if(verify_one(choice_one, n)){
                for(int i = 0; i < n; i++){
                    System.out.print(choice_one[i] + " ");
                }
                System.out.println();
            }else if(verify_two(choice_two, n)){
                for(int i = 0; i < n; i++){
                    System.out.print(choice_two[i] + " ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
        }
    }
}
