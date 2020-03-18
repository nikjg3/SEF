package app;
import java.util.Arrays;

public class App {

        static int[] a = {70,61,72,83,38};
        public static void main(String[] args){
            bubbleSort();
        }

        private static void bubbleSort(){
            for(int x = 0; x < a.length-1; x++){
                for(int i = 0; i < a.length-1; i++){
                    if (a[i] > a[i+1]){
                        int temp = 0;
                        temp = a[i];
                        a[i]=a[i+1];
                        a[i+1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }