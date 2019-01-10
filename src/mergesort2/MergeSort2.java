package mergesort2;
public class MergeSort2 {
    public static void main(String[] a) {
        System.out.println("Muhammad Ilham Yahya");
        System.out.println("114117");
        System.out.println("***SORTING***");
        System.out.println();
        System.out.println("Merge Sorting");
        System.out.println();
        
        int n[]={686,840,78,508,495,456,812,475,840,225,
            719,14,918,157,744,514,72,632,653,837,119,996};
        System.out.println("Sebelum diurutkan = ");
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
        
        initializemergeSort(n, 0, n.length - 1);
        System.out.println();
        System.out.println("Setelah di Urutkan = ");
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+ " " );
        }
    }

public static void initializemergeSort(int n[], int l, int h){
    int low = l;int high = h;
    if (low>=high){
        return;
}
    int middle=(low+high)/2;
    initializemergeSort(n, low, middle);
    initializemergeSort(n, middle + 1, high);
    int end_low=middle;
    int start_high=middle+1;
    while ((1 <= end_low) && (start_high <= high)){
        if (n[low] > n[start_high]){
            low++;
        }else {
            int Temp = n[start_high];
            for (int k = start_high - 1; k >= low; k--){
                n[k+1]=n[k];
            }
            n[low]=Temp;
            low++;
            end_low++;
            start_high++;
        }
    }
}
}
