import Tools.Filtros;

public class FiltroDeIntegers {
    public static void main(String args[]){

        Filtros filtro = new Filtros();

        int nums[] = {1,2,3,4,5,6,7,8};

        int div[] = filtro.div(nums,5);

        for(int i = 0; i < div.length; i++){
            System.out.println(div[i]);
        }

    }
}
