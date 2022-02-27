package searching;

public class TestSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int searchValue = 4;
        Searching LinearSearch = new linearSearch();
        if(LinearSearch.search(arr, searchValue))
            System.out.println("found");
        else{
            System.out.println("not found");
        }
    }
}
