import Conicas2.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instancias de la clase circunferencia_grupo2
        circunferencia_grupo2 fig1=new circunferencia_grupo2(2.345f,5.45f);
        circunferencia_grupo2 fig2 = new circunferencia_grupo2(6.45f,8.96f);

        //Instancias de la clase Elipse
        Elipse fig3 = new Elipse(4.878, 96.723);
        Elipse fig4 = new Elipse(9.785, 15.657);

        //Instancias de la clase hiperbole
        hiperbole fig5 = new hiperbole(7.1278,5.5656);
        hiperbole fig6 = new hiperbole(12.4568, 16.4784);

        //Instancias de la clase Parabola_Equipo2
        Parabola_Equipo2 fig7 = new Parabola_Equipo2(23.48f,32.48f, 14.98f,16.45f,12.65f);
        Parabola_Equipo2 fig8 = new Parabola_Equipo2(12.47f, 23.14f, 25.45f, 56.12f, 32.14f);

        //MENU
        int opc;
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("---------------MENU CÓNICAS--------------");
            System.out.println("1. Circunferencia");
            System.out.println("2. Elipse");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion de la figura que desee calcular: "); opc=entrada.nextInt();

            switch (opc){
                case 1:
                    System.out.println("CIRCUNFERENCIA");
                    System.out.println("Los resultados de las operaciones con la fig1 son: ");
                    fig1.imprimir_Datos();
                    System.out.println("\n-----------------------------------------------------");
                    System.out.println("Los resultados de las operaciones con la fig2 son: ");
                    fig2.imprimir_Datos();
                    break;
                case 2:
                    System.out.println("ELIPSE");
                    System.out.println("Los resultados de las operaciones con la fig3 son: ");
                    fig3.imprimir_Datos();
                    System.out.println("\n-----------------------------------------------------");
                    System.out.println("Los resultados de las operaciones con la fig4 son: ");
                    fig4.imprimir_Datos();
                    break;
                case 3:
                    System.out.println("HIPERBOLE");
                    System.out.println("Los resultados de las operaciones con la fig5 son: ");
                    fig5.variables();
                    System.out.println("\n-----------------------------------------------------");
                    System.out.println("Los resultados de las operaciones con la fig6 son: ");
                    fig6.variables();
                    break;
                case 4:
                    System.out.println("PARABOLA");
                    System.out.println("Los resultados de las operaciones con la fig7 son: ");
                    fig7.Parabola_Equipo2_ImpVer();
                    System.out.println("\n-----------------------------------------------------");
                    System.out.println("Los resultados de las operaciones con la fig8 son: ");
                    fig8.Parabola_Equipo2_ImpVer();
                    break;1
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.print("OPCION INCORRECTA...");
            }
        }while (opc!=5);
    }
//
}