package Insertion;

public class main {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        String arr[] = {"andy","gym","workout","diet"};
        sort.insertion(arr);
        sort.display(arr);
    }
}
