public class ComputadorPortatil {

    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String SistemaOperativo;
    private String Procesador;

    public ComputadorPortatil() {
    }

    public ComputadorPortatil(String Serial, String Marca, float Tamano, float Precio, String SistemaOperativo, String Procesador) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Tamano = Tamano;
        this.Precio = Precio;
        this.SistemaOperativo = SistemaOperativo;
        this.Procesador = Procesador;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float Tamano) {
        this.Tamano = Tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
}