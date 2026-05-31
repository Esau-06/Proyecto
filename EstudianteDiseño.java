public class EstudianteDiseño {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String ModalidadEstudio;
    private int CantidadAsignaturas;
    private int SerialEquipo;

    public EstudianteDiseño() {
    }

    public EstudianteDiseño(String Cedula, String Nombre, String Apellido, String Telefono, String ModalidadEstudio, int CantidadAsignaturas, int SerialEquipo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.ModalidadEstudio = ModalidadEstudio;
        this.CantidadAsignaturas = CantidadAsignaturas;
        this.SerialEquipo = SerialEquipo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getModalidadEstudio() {
        return ModalidadEstudio;
    }

    public void setModalidadEstudio(String ModalidadEstudio) {
        this.ModalidadEstudio = ModalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return CantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int CantidadAsignaturas) {
        this.CantidadAsignaturas = CantidadAsignaturas;
    }

    public int getSerialEquipo() {
        return SerialEquipo;
    }

    public void setSerialEquipo(int SerialEquipo) {
        this.SerialEquipo = SerialEquipo;
    }
}