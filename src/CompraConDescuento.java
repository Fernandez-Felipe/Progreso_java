import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import Tools.porcentaje;

import static Tools.porcentaje.Porcentaje;

//ofertas segun el metodo de pago
public class CompraConDescuento {
    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        boolean proceso = true;


        ArrayList<Float> productos = new ArrayList<Float>();

        do {
            System.out.println("1.Agregar compra \n2.salir");
            int opciones = in.nextInt();

            switch (opciones) {
                case 1:
                    productos.add(in.nextFloat());
                    break;
                case 2:
                    proceso = false;
                    break;
                default:
                    System.out.println("Opcion no disponible.");
                    break;
            }

        } while (proceso == true);

        if (!productos.isEmpty()) {
            float expensive = productos.get(0);
            int cant = 0;

            for (int i = 1; i < productos.size()-1; i++) {
                if(productos.get(i) > expensive){
                    expensive = productos.get(i);
                    cant = i;
                }
            }
            float total = Total(productos);
            System.out.println("El total a pagar es de "+total+"$\n");

            System.out.print("Los metodos de pago son: \n1.En efectivo con un 15% de descuento en la compra mas cara." +
                    "\n2.Con tarjeta de debito al contado con un 10$ en la compra total." +
                    "\n3.Con debito en 6 cuotas." +
                    "\n4.Con tarjeta de credito al contado." +
                    "\n5.Con tajeta de credito en 3 cuotas con un interes mensual del 3,5%\n");

            proceso = true;
            while(proceso == true){
                int opciones = in.nextInt();
                switch (opciones){
                    case 1:
                        expensive -= Porcentaje(expensive , 15);
                        productos.set(cant, expensive);
                        total = Total(productos);
                        ticket(total,"El precio final es");
                        proceso = false;
                        break;
                    case 2:
                        total -= Porcentaje(total, 10);
                        ticket(total,"El precio final es");
                        proceso = false;
                        break;
                    case 3:
                        total /= 6;
                        ticket(total,"El precio de cada cuota es de");
                        proceso = false;
                        break;
                    case 4:
                        ticket(total,"El precio final es");
                        proceso = false;
                        break;
                    case 5:
                        total /= 3;
                        total += Porcentaje(total, (float) 3.5);
                        ticket(total,"El precio de cada cuota es de");
                        proceso = false;
                        break;
                    default:
                        System.out.println("Metodo de pago no disponible...\n");
                        proceso = false;
                        break;
                }
            }

        }else System.out.println("No se ha realizado ninguna compra.");
    }

    private static float Total(ArrayList<Float> precios){

        float precio = 0;

        for(int i = 0; i < precios.size(); i++){
            precio += precios.get(i);
        }

        return precio;
    }

    private static void ticket(float precio, String mensaje) throws IOException {

        Writer ticket = new FileWriter("ticket.txt");
        ticket.write(mensaje+" "+precio+"$");
        ticket.close();
    }
}
