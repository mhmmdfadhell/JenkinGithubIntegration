public class Nomor { 
     public static void main(String args[]) {
            for (int i=1; i <= 100; i++){
            int bil=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
            }

        } 
    }