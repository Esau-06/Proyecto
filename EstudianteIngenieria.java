public class EstudianteIngenieria {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int NumeroSemestre;
    private float PromedioAcumulado;
    private String SerialEquipo;

    public EstudianteIngenieria() {
    }

    public EstudianteIngenieria(String Cedula, String Nombre, String Apellido, String Telefono, int NumeroSemestre, float PromedioAcumulado, String SerialEquipo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.NumeroSemestre = NumeroSemestre;
        this.PromedioAcumulado = PromedioAcumulado;
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

    public int getNumeroSemestre() {
        return NumeroSemestre;
    }

    public void setNumeroSemestre(int NumeroSemestre) {
        this.NumeroSemestre = NumeroSemestre;
    }

    public float getPromedioAcumulado() {
        return PromedioAcumulado;
    }

    public void setPromedioAcumulado(float PromedioAcumulado) {
        this.PromedioAcumulado = PromedioAcumulado;
    }

    public String getSerialEquipo() {
        return SerialEquipo;
    }

    public void setSerialEquipo(String SerialEquipo) {
        this.SerialEquipo = SerialEquipo;
    }
}