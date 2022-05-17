package Main;

public class ProgramStart {

    public static void main(String[] args)
    {
        String[] a = {"banana", "watermelon", "pear", "plum", "apple"};
        Sorting.show(a);
        Sorting.sort(a);
        assert Sorting.isSorted(a);
        Sorting.show(a);
    }

}
