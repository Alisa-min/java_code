package Test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7 , 9, 9, 8, 6, 5, 4, 3, 2, 1};
        int num = num(arr);
        System.out.print(num);
    }
    public static int num(int[] arr) {
        int tmp=0;
        for (int i=0; i < arr.length; i++) {
            tmp^=arr[i];//两个数相同，按位异或则为0；
        }
        return tmp;
    }
}
