package Methods;

public class RecursivePattern {
    public static void recursivePattern(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        recursivePattern(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        recursivePattern(12);
    }
}
