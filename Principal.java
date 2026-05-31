import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        LinkedList vector_ingenieros = new LinkedList();
        LinkedList vector_disenadores = new LinkedList();
        LinkedList vector_portatil = new LinkedList();
        LinkedList vector_tableta = new LinkedList();

        Queue cola_solicitudes = new LinkedList();
        Stack pila_devoluciones = new Stack();

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("==============================================");
            System.out.println("GESTION PRESTAMO EQUIPOS ELECTRONICOS");
            System.out.println("SAN JUAN DE DIOS");
            System.out.println("==============================================");
            System.out.println("1. Estudiantes de Ingenieria");
            System.out.println("2. Estudiantes de Diseno");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir del programa");
            System.out.println("Digite una opcion:");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    int opcionIngenieria = -1;

                    while (opcionIngenieria != 4) {

                        System.out.println("==============================================");
                        System.out.println("MENU ESTUDIANTES DE INGENIERIA");
                        System.out.println("==============================================");
                        System.out.println("0. Registrar prestamo");
                        System.out.println("1. Modificar prestamo");
                        System.out.println("2. Devolucion de equipo");
                        System.out.println("3. Buscar equipo");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Digite una opcion:");

                        opcionIngenieria = sc.nextInt();
                        sc.nextLine();

                        switch (opcionIngenieria) {

                            case 0:
                                vector_ingenieros = m.RegistrarPrestamoIngenieria(vector_ingenieros, vector_portatil, cola_solicitudes, sc);
                                break;

                            case 1:
                                vector_ingenieros = m.ModificarPrestamoIngenieria(vector_ingenieros, sc);
                                break;

                            case 2:
                                vector_ingenieros = m.DevolverEquipoIngenieria(vector_ingenieros, vector_portatil, pila_devoluciones, sc);
                                break;

                            case 3:
                                m.BuscarEquipoIngenieria(vector_ingenieros, sc);
                                break;

                            case 4:
                                System.out.println("Volviendo al menu principal");
                                break;

                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                    break;

                case 2:

                    int opcionDiseno = -1;

                    while (opcionDiseno != 4) {

                        System.out.println("==============================================");
                        System.out.println("MENU ESTUDIANTES DE DISENO");
                        System.out.println("==============================================");
                        System.out.println("0. Registrar prestamo");
                        System.out.println("1. Modificar prestamo");
                        System.out.println("2. Devolucion de equipo");
                        System.out.println("3. Buscar equipo");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Digite una opcion:");

                        opcionDiseno = sc.nextInt();
                        sc.nextLine();

                        switch (opcionDiseno) {

                            case 0:
                                vector_disenadores = m.RegistrarPrestamoDiseno(vector_disenadores, vector_tableta, cola_solicitudes, sc);
                                break;

                            case 1:
                                vector_disenadores = m.ModificarPrestamoDiseno(vector_disenadores, sc);
                                break;

                            case 2:
                                vector_disenadores = m.DevolverEquipoDiseno(vector_disenadores, vector_tableta, pila_devoluciones, sc);
                                break;

                            case 3:
                                m.BuscarEquipoDiseno(vector_disenadores, sc);
                                break;

                            case 4:
                                System.out.println("Volviendo al menu principal");
                                break;

                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                    break;

                case 3:
                    m.ImprimirInventarioTotal(vector_ingenieros, vector_disenadores, vector_portatil, vector_tableta);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}

