package MyJava_udemy.Array_practice;

public class max_element {
    public static void main(String[] args) {
        int[] arr = {56,23,98,23,12,99,56};
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
    }
}
