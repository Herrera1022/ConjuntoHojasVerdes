/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author estudiantelis
 */
public class Persona {
    private String nombre;
    private String tipoDocumento;
    private String propiedad;
    private String multa;
    private String descripción;
    private String cedula;

    public Persona(String nombre, String tipoDocumento, String propiedad, String multa, String descripción, String cedula) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.propiedad = propiedad;
        this.multa = multa;
        this.descripción = descripción;
        this.cedula = cedula;
    }

    public Persona() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }
    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    
}
