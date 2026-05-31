public class TabletaGrafica {

    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String Almacenamiento;
    private float Peso;

    public TabletaGrafica() {
    }

    public TabletaGrafica(String Serial, String Marca, float Tamano, float Precio, String Almacenamiento, float Peso) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Tamano = Tamano;
        this.Precio = Precio;
        this.Almacenamiento = Almacenamiento;
        this.Peso = Peso;
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

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
}