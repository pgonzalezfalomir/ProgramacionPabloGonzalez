package tema7.EjercicioFunko;

import java.io.Serializable;

public class Funko implements Serializable {
    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private String fechaLanzamiento;

    private final String CODIGO_DEFAULT = "codigo1";
    private final String NOMBRE_DEFAULT = "Miles Morales";
    private final String MODELO_DEFAULT = "Marvel";
    private final double PRECIO_DEFAULT = 19.99;
    private final String FECHA_LANZAMIENTO_DEFAULT = "2020-1-1";

    public Funko() {
        this.codigo = CODIGO_DEFAULT;
        this.nombre = NOMBRE_DEFAULT;
        this.modelo = MODELO_DEFAULT;
        this.precio = PRECIO_DEFAULT;
        this.fechaLanzamiento = FECHA_LANZAMIENTO_DEFAULT;
    }

    public Funko(String codigo, String nombre, String modelo, double precio, String fechaLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko [COD=" + codigo.substring(0,8) + "..., Nombre=" + nombre + ", Modelo=" + modelo + ", Precio=" + precio + "€, Fecha=" + fechaLanzamiento + "]";
    }

    public String toCSV() {
        return codigo + "," + nombre + "," + modelo + "," + precio + "," + fechaLanzamiento;
    }
}
