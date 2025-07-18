package entities;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    //Constructor
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    //Getters y Setters.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    //El toString devuelve todos los campos de Vuelo.
    @Override
    public String toString() {
        return "Vuelo {" +
                "Identificador: " + id +
                ", Código: " + nombreVuelo +
                ", Compañía: " + empresa +
                ", Origen: " + lugarSalida +
                ", Destino: " + lugarLlegada +
                ", Salida: " + fechaInicio +
                ", Llegada: " + fechaFinal +
                '}';
    }
}
