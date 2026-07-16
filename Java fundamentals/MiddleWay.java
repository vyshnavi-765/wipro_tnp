public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] c = {a[1], b[1]};

        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }
}