public class SortAlgorithm{
  public static void mergeSort(int[] a, int start, int end){
        if(end - start == 1){
            return
        }
        int mid = (int)((start + end)/2);
        mergeSort(a,start,mid - 1);
        mergeSort(a,mid,end);
        merge(a,start,end);
    }
    public static void mergeSort(int[] a){
        mergeSort(a,0,a.length-1);
    }
    public static void merge(int[] a, int start, int end){
        int[] b = new int[end - start + 1];
        int i = start;
        int j = mid;
        int index = 0;
        while(i < mid ||j <= end){
            if(i >= mid){
                b[index++] = a[j++];
            }
            else if(j > end){
                b[index++] = a[i++];
            }
            else if(a[i] < a[j]){
                b[index++] = a[i++];
            }
            else{
                b[index++] = a[j++];
            }
        }
        for(int i : b){
            a[start++] = i;
        }
    }

}
