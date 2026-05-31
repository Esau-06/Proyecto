import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    LinkedList vector_ingenieros = new LinkedList();
    LinkedList vector_diseñadores = new LinkedList();
    LinkedList vector_portatil = new LinkedList();
    LinkedList vector_tableta = new LinkedList();

    public void RegistrarPrestamoIngenieria(Scanner sc) {

        EstudianteIngenieria estudiante = new EstudianteIngenieria();
        ComputadorPortatil portatil = new ComputadorPortatil();

        System.out.println("REGISTRAR PRESTAMO INGENIERIA");

        System.out.println("Ingrese la cedula");
        String Cedula = sc.nextLine();

        if (ExisteCedulaIngenieria(Cedula)) {
            System.out.println("El estudiante ya tiene un equipo asignado");
            return;
        }

        System.out.println("Ingrese el nombre");
        String Nombre = sc.nextLine();

        System.out.println("Ingrese el apellido");
        String Apellido = sc.nextLine();

        System.out.println("Ingrese el telefono");
        String Telefono = sc.nextLine();

        System.out.println("Ingrese el numero de semestre");
        int NumeroSemestre = sc.nextInt();

        System.out.println("Ingrese el promedio acumulado");
        float PromedioAcumulado = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingrese el serial del equipo");
        String SerialEquipo = sc.nextLine();

        if (ExisteSerialIngenieria(SerialEquipo)) {
            System.out.println("El serial ya esta asignado");
            return;
        }

        System.out.println("Ingrese la marca del computador");
        String Marca = sc.nextLine();

        System.out.println("Ingrese el tamano del computador");
        float Tamano = sc.nextFloat();

        System.out.println("Ingrese el precio del computador");
        float Precio = sc.nextFloat();

        System.out.println("Seleccione sistema operativo");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        int opcionSistema = sc.nextInt();

        String SistemaOperativo = "";

        switch (opcionSistema) {
            case 1:
                SistemaOperativo = "Windows 7";
                break;
            case 2:
                SistemaOperativo = "Windows 10";
                break;
            case 3:
                SistemaOperativo = "Windows 11";
                break;
            default:
                SistemaOperativo = "Windows 10";
                break;
        }

        System.out.println("Seleccione procesador");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel Core i5");
        int opcionProcesador = sc.nextInt();
        sc.nextLine();

        String Procesador = "";

        switch (opcionProcesador) {
            case 1:
                Procesador = "AMD Ryzen";
                break;
            case 2:
                Procesador = "Intel Core i5";
                break;
            default:
                Procesador = "Intel Core i5";
                break;
        }

        estudiante.setCedula(Cedula);
        estudiante.setNombre(Nombre);
        estudiante.setApellido(Apellido);
        estudiante.setTelefono(Telefono);
        estudiante.setNumeroSemestre(NumeroSemestre);
        estudiante.setPromedioAcumulado(PromedioAcumulado);
        estudiante.setSerialEquipo(SerialEquipo);

        portatil.setSerial(SerialEquipo);
        portatil.setMarca(Marca);
        portatil.setTamano(Tamano);
        portatil.setPrecio(Precio);
        portatil.setSistemaOperativo(SistemaOperativo);
        portatil.setProcesador(Procesador);

        vector_ingenieros.add(estudiante);
        vector_portatil.add(portatil);

        System.out.println("Prestamo registrado correctamente");
    }

    public void RegistrarPrestamoDiseño(Scanner sc) {

        EstudianteDiseño estudiante = new EstudianteDiseño();
        TabletaGrafica tableta = new TabletaGrafica();

        System.out.println("REGISTRAR PRESTAMO DISEÑO");

        System.out.println("Ingrese la cedula");
        String Cedula = sc.nextLine();

        if (ExisteCedulaDiseño(Cedula)) {
            System.out.println("El estudiante ya tiene un equipo asignado");
            return;
        }

        System.out.println("Ingrese el nombre");
        String Nombre = sc.nextLine();

        System.out.println("Ingrese el apellido");
        String Apellido = sc.nextLine();

        System.out.println("Ingrese el telefono");
        String Telefono = sc.nextLine();

        System.out.println("Seleccione modalidad de estudio");
        System.out.println("1. Virtual");
        System.out.println("2. Presencial");
        int opcionModalidad = sc.nextInt();

        String ModalidadEstudio = "";

        switch (opcionModalidad) {
            case 1:
                ModalidadEstudio = "Virtual";
                break;
            case 2:
                ModalidadEstudio = "Presencial";
                break;
            default:
                ModalidadEstudio = "Presencial";
                break;
        }

        System.out.println("Ingrese la cantidad de asignaturas");
        int CantidadAsignaturas = sc.nextInt();

        System.out.println("Ingrese el serial del equipo");
        int SerialEquipo = sc.nextInt();
        sc.nextLine();

        if (ExisteSerialDiseño(SerialEquipo)) {
            System.out.println("El serial ya esta asignado");
            return;
        }

        System.out.println("Ingrese la marca de la tableta");
        String Marca = sc.nextLine();

        System.out.println("Ingrese el tamano de la tableta");
        float Tamano = sc.nextFloat();

        System.out.println("Ingrese el precio de la tableta");
        float Precio = sc.nextFloat();

        System.out.println("Seleccione almacenamiento");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");
        int opcionAlmacenamiento = sc.nextInt();

        String Almacenamiento = "";

        switch (opcionAlmacenamiento) {
            case 1:
                Almacenamiento = "256 GB";
                break;
            case 2:
                Almacenamiento = "512 GB";
                break;
            case 3:
                Almacenamiento = "1 TB";
                break;
            default:
                Almacenamiento = "256 GB";
                break;
        }

        System.out.println("Ingrese el peso de la tableta");
        float Peso = sc.nextFloat();
        sc.nextLine();

        estudiante.setCedula(Cedula);
        estudiante.setNombre(Nombre);
        estudiante.setApellido(Apellido);
        estudiante.setTelefono(Telefono);
        estudiante.setModalidadEstudio(ModalidadEstudio);
        estudiante.setCantidadAsignaturas(CantidadAsignaturas);
        estudiante.setSerialEquipo(SerialEquipo);

        tableta.setSerial(SerialEquipo + "");
        tableta.setMarca(Marca);
        tableta.setTamano(Tamano);
        tableta.setPrecio(Precio);
        tableta.setAlmacenamiento(Almacenamiento);
        tableta.setPeso(Peso);

        vector_diseñadores.add(estudiante);
        vector_tableta.add(tableta);

        System.out.println("Prestamo registrado correctamente");
    }

    public void ModificarPrestamoIngenieria(Scanner sc) {

        System.out.println("MODIFICAR PRESTAMO INGENIERIA");
        System.out.println("Ingrese la cedula del estudiante");
        String Cedula = sc.nextLine();

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria estudiante = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (estudiante.getCedula().equals(Cedula)) {

                int opcion = 0;

                while (opcion != 6) {

                    System.out.println("Que desea modificar");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Telefono");
                    System.out.println("4. Numero de semestre");
                    System.out.println("5. Promedio acumulado");
                    System.out.println("6. Salir");
                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            estudiante.setNombre(sc.nextLine());
                            break;

                        case 2:
                            System.out.println("Ingrese el nuevo apellido");
                            estudiante.setApellido(sc.nextLine());
                            break;

                        case 3:
                            System.out.println("Ingrese el nuevo telefono");
                            estudiante.setTelefono(sc.nextLine());
                            break;

                        case 4:
                            System.out.println("Ingrese el nuevo numero de semestre");
                            estudiante.setNumeroSemestre(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 5:
                            System.out.println("Ingrese el nuevo promedio acumulado");
                            estudiante.setPromedioAcumulado(sc.nextFloat());
                            sc.nextLine();
                            break;

                        case 6:
                            System.out.println("Saliendo de modificar");
                            break;

                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                }

                System.out.println("Registro modificado correctamente");
                System.out.println("La cedula y el serial del equipo no se modifican");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void ModificarPrestamoDiseño(Scanner sc) {

        System.out.println("MODIFICAR PRESTAMO DISEÑO");
        System.out.println("Ingrese la cedula del estudiante");
        String Cedula = sc.nextLine();

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño estudiante = (EstudianteDiseño) vector_diseñadores.get(i);

            if (estudiante.getCedula().equals(Cedula)) {

                int opcion = 0;

                while (opcion != 6) {

                    System.out.println("Que desea modificar");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Telefono");
                    System.out.println("4. Modalidad de estudio");
                    System.out.println("5. Cantidad de asignaturas");
                    System.out.println("6. Salir");
                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            estudiante.setNombre(sc.nextLine());
                            break;

                        case 2:
                            System.out.println("Ingrese el nuevo apellido");
                            estudiante.setApellido(sc.nextLine());
                            break;

                        case 3:
                            System.out.println("Ingrese el nuevo telefono");
                            estudiante.setTelefono(sc.nextLine());
                            break;

                        case 4:
                            System.out.println("Seleccione nueva modalidad");
                            System.out.println("1. Virtual");
                            System.out.println("2. Presencial");
                            int opcionModalidad = sc.nextInt();
                            sc.nextLine();

                            if (opcionModalidad == 1) {
                                estudiante.setModalidadEstudio("Virtual");
                            } else {
                                estudiante.setModalidadEstudio("Presencial");
                            }
                            break;

                        case 5:
                            System.out.println("Ingrese nueva cantidad de asignaturas");
                            estudiante.setCantidadAsignaturas(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 6:
                            System.out.println("Saliendo de modificar");
                            break;

                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                }

                System.out.println("Registro modificado correctamente");
                System.out.println("La cedula y el serial del equipo no se modifican");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void DevolverEquipoIngenieria(Scanner sc) {

        System.out.println("DEVOLUCION EQUIPO INGENIERIA");
        System.out.println("Ingrese la cedula del estudiante");
        String Cedula = sc.nextLine();

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria estudiante = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (estudiante.getCedula().equals(Cedula)) {

                String Serial = estudiante.getSerialEquipo();

                vector_ingenieros.remove(i);

                for (int j = 0; j < vector_portatil.size(); j++) {

                    ComputadorPortatil portatil = (ComputadorPortatil) vector_portatil.get(j);

                    if (portatil.getSerial().equals(Serial)) {
                        vector_portatil.remove(j);
                        j = vector_portatil.size();
                    }
                }

                System.out.println("Devolucion registrada correctamente");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void DevolverEquipoDiseño(Scanner sc) {

        System.out.println("DEVOLUCION EQUIPO DISEÑO");
        System.out.println("Ingrese la cedula del estudiante");
        String Cedula = sc.nextLine();

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño estudiante = (EstudianteDiseño) vector_diseñadores.get(i);

            if (estudiante.getCedula().equals(Cedula)) {

                int Serial = estudiante.getSerialEquipo();

                vector_diseñadores.remove(i);

                for (int j = 0; j < vector_tableta.size(); j++) {

                    TabletaGrafica tableta = (TabletaGrafica) vector_tableta.get(j);

                    if (tableta.getSerial().equals(Serial + "")) {
                        vector_tableta.remove(j);
                        j = vector_tableta.size();
                    }
                }

                System.out.println("Devolucion registrada correctamente");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void BuscarEquipoIngenieria(Scanner sc) {
        System.out.println("Buscar equipo ingenieria");
    }

    public void BuscarEquipoDiseño(Scanner sc) {
        System.out.println("Buscar equipo diseño");
    }

    public void ImprimirInventarioTotal() {
        System.out.println("Imprimir inventario total");
    }

    public boolean ExisteCedulaIngenieria(String Cedula) {

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria estudiante = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (estudiante.getCedula().equals(Cedula)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteCedulaDiseño(String Cedula) {

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño estudiante = (EstudianteDiseño) vector_diseñadores.get(i);

            if (estudiante.getCedula().equals(Cedula)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteSerialIngenieria(String Serial) {

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria estudiante = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (estudiante.getSerialEquipo().equals(Serial)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteSerialDiseño(int Serial) {

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño estudiante = (EstudianteDiseño) vector_diseñadores.get(i);

            if (estudiante.getSerialEquipo() == Serial) {
                return true;
            }
        }

        return false;
    }
}