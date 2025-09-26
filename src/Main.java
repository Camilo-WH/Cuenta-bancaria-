import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Menu
        menuPrincipal();




    }
    public static void menuPrincipal(){

        int a,b,c,d,e;
        boolean x=true;
        Scanner teclado = new Scanner(System.in);
        List<cuentaBancaria> lista = new ArrayList();
        do {
            System.out.println("ELIJA UNA OPCION");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Mostrar cuenta");
            System.out.println("3. Eliminar cuenta");
            System.out.println("4. Cuenta bancaria");
            System.out.println("5. Salir");
            e=teclado.nextInt();


            switch (e) {
                case 1:
                System.out.println("Ingrese el numero de cuenta");
                a = teclado.nextInt();
                System.out.println("Ingrese su numero de cedula");
                b = teclado.nextInt();
                System.out.println("Ingrese el valor de dinero que desea ingresar");
                c = teclado.nextInt();
                lista.add(new cuentaBancaria(a, b, c));
                break;
                case 2:
                    for (cuentaBancaria p:lista){
                        System.out.println(p);
                    }
                break;
                case 3:
                        System.out.println("Ingrese el numero de cuenta que desea eliminar");
                        d = teclado.nextInt();
                    for (cuentaBancaria p : lista) {
                        System.out.println(p);
                        if (p.getNumeroCuenta() == d) {
                            lista.remove(p);
                        }
                    }
                break;

                case 4:
                    System.out.println("Ingrese el numero de cuenta que desea eliminar");
                    d = teclado.nextInt();
                    for (cuentaBancaria p : lista) {
                        System.out.println(p);
                        if (p.getNumeroCuenta() == d) {
                            submenu(p);
                        }
                    }
                    break;

                case 5:
                    x=false;
                    break;
                default:
                    System.out.println("Opcion invalida ");

            }

        }while (x);



    }




    public static void submenu(cuentaBancaria b1){


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
