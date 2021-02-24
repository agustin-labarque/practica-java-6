package project;

public class SortUtil {

    public static <T> void  ordenar(Precedable<T> arr[]){
        for(int i= arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[i].precedeA((T) arr[j])<0){
                    Precedable<T> tAux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tAux;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
