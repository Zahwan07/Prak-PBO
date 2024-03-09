public class Equality {
    public static void main(String[] args) {
        int x = 5;
        float f0 = 5.0f;
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int arr3[] = arr1;
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = new String("hello");

        System.out.println();
        System.out.println("Operator Kesetaraan:");
        System.out.println("=============== ");
        System.out.println("Sama Dengan: 5 == 5.0 \t\t " + (x == f0));
        System.out.println("Tidak Sama Dengan: 5 != 5.0 \t " + (x != f0));
        System.out.println("Sama Dengan: arr1 == arr2 \t " + (arr1 == arr2) + " [objek array berbeda]");
        System.out.println("Sama Dengan: arr1 == arr3 \t " + (arr1 == arr3) + " [referensi ke objek array yang sama]");
        System.out.println("Tidak Sama Dengan: arr1 != arr2 \t " + (arr1 != arr2));
        System.out.println("Tidak Sama Dengan: arr1 != arr3 \t " + (arr1 != arr3));
        System.out.println("Sama Dengan: s1 == s2 \t\t " + (s1 == s2) + " [literal yang sama]");
        System.out.println("Sama Dengan: s1 == s3 \t\t " + (s1 == s3) + " [referensi objek yang sama]");
        System.out.println("Sama Dengan: s1 == s4 \t\t " + (s1 == s4) + " [s4 adalah objek baru]");
    }
}
