
package cl.app.count.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Gastos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String tipo;
    
    
    private String detalle;
    
    private int  cantidad;
        
    private Date fecha;
    
    

    public Gastos() {
    }

    public Gastos(long id, String tipgasting, String detalle, int cantidad, Date fecha) {
        this.id = id;
        this.tipo = tipgasting;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.fecha = fecha;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipgasting() {
        return tipo;
    }

    public void setTipgasting(String tipgasting) {
        this.tipo = tipgasting;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

   
    
    
    
    
    
}
