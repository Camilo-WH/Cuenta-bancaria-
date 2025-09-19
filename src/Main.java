import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Menu
        menu();

    }



    public static void menu(){
        cuentaBancaria b1= new cuentaBancaria();
        b1.setNumeroCuenta(00000000);
        b1.setCcCliente(00000000);
        b1.setSaldoActual(0);


        Scanner teclado = new Scanner(System.in);

        int a,monto,sacar;
        boolean b = true;
        do {
            System.out.println("Digite una opcion");
            System.out.println(" 1. Ingresar numero de cuenta ");
            System.out.println(" 2. Ingresar numero de Cedula ");
            System.out.println(" 3. Ingresar dinero");
            System.out.println(" 4. Revisar saldo");
            System.out.println(" 5. Retirar ");
            System.out.println(" 6. Retirar 20%");
            System.out.println("7. SALIR");
            a=teclado.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Digite su numero de cuenta");
                    b1.setNumeroCuenta(teclado.nextInt());
                case 2:
                    System.out.println("Digite su numero de Cedula");
                    b1.setCcCliente(teclado.nextInt());

                case 3:

                    System.out.println("Digite el valor del dinero que desea ingresar a su cuenta bancaria ");
                    monto = teclado.nextInt();
                    System.out.println("usted ingreso: " + monto);
                    b1.b1(monto);
                    break;
                case 4:
                    b1.revisar();
                    System.out.println("Su saldo actualmente es: "+ b1.revisar());
                    break;
                case 5:
                    System.out.println("Digite el valor del dinero que desea retirar ");
                    sacar = teclado.nextInt();
                    System.out.println("Usted acaba de retirar: " + sacar);

                    b1.retiro(sacar);
                    break;
                case 6:
                    b1.retiro2();
                    System.out.println("Usted acaba de retirar: " +b1.getSaldoActual()*20/100);
                    break;
                case 7:
                    b=false;
                    break;
                default:
                    System.out.println("Opcion invalida ");
                    break;


            }
        }while(b);

    }
    }
