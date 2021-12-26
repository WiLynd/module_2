package ss14_sort.bai_tap;

public class InsersionSort {
    static int[] list = {5,3,7,9,2,8,4,6,10,1};
    public static void insersionSort(int[]list){
        for(int i=0;i<list.length;i++){
            int x= list[i];
            int index = i;
            while (index>0 && x<list[index-1]){
                list[index]= list[index-1];
                index--;
            }
            list[index] = x;

        }
    }

    public static void main(String[] args) {
        insersionSort(list);
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]+" ");
        }
    }
}