package Concurrencia;

public class Ejercicio_1{

    static int cont = 0;

    public static void main(String args[]){

        int Numeros[] = {1,2,3,4,5,6,7,8};

        procesos_1 Pares = new procesos_1(Numeros, Numeros.length,2);
        procesos_1 impares = new procesos_1(Numeros, Numeros.length,3);

        System.out.println("Se analizaran "+Numeros.length+" numeros");

        Pares.run();
        System.out.println(cont);
        impares.run();
        System.out.println(cont);

    }
}
class procesos_1 extends Ejercicio_1 implements Runnable {


    int n, Num;
    int num[] = new int[n];

    public procesos_1(int num[], int n, int Num){
        this.num = num;
        this.n = n;
        this.Num = Num;
    }

    @Override
    public void run() {

        cont = 0;
        for(int i = 0; i < n; i++){
            if(num[i]%Num == 0){
                cont++;
            }
        }
    }
}
