
public class Ejercicio1{
    public void serie1(int n){
        int serie = 1;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(j<=4){
                if(j==4){
                    j = j-2;
                    serie = serie + j;
                    j = 1;
                    System.out.printf(" %d",serie);
                }else{
                    serie = serie + j;
                    System.out.printf(" %d",serie);
                    j++;
                }
            }
        }
    }
}
