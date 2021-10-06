package Binary;

public class main {
    public static void main(String[] args) {
        String[] arr = { "priya", "siya", "uv", "urvi"};
        String x = "siya";
        int result = BinarySearch.binarySearch(arr, x)  ;

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
