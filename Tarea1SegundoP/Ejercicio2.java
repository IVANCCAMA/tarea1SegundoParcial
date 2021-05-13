
public class Ejercicio2{
    public void Tarea2(int n){
        int a1 = 1;
        int a2 = 1;
        int a3 = 1;
        int serie = 0;
        for(int i = 0; i<n; i++){
            if(i<3){
                System.out.printf(" %d",a1);
            }else{
                serie = a1 + a2;
                a1 = a2;
                a2 = a3;
                a3 = serie;
                System.out.printf(" %d",serie);
            }
        }
    }
}
