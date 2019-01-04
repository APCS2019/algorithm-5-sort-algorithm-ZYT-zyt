public class SortAlgorithm{
    public static void mergeSort(int[] a, int start, int end) {
        if (end - start == 0) {
            return;
        }
        int left = (int) ((start + end) / 2);
        int right = left + 1;
        mergeSort(a, start, left);
        mergeSort(a, right, end);
        merge(a, start, end);
    }

    public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void merge(int[] a, int start, int end) {
        if (end - start == 0)
            return;
        int[] b = new int[end - start + 1];
        int i = start;
        int left = ((int) (start + end) / 2);
        int right = left + 1;
        int j = right;
        int index = 0;
        while (i <= left || j <= end) {
            if (i > left) {
                b[index++] = a[j++];
            } else if (j > end) {
                b[index++] = a[i++];
            } else if (a[i] < a[j]) {
                b[index++] = a[i++];
            } else {
                b[index++] = a[j++];
            }
        }
        for (int e : b) {
            a[start++] = e;
        }
    }
}
