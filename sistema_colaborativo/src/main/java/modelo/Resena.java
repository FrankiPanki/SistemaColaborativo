package modelo;
// Generated 2/10/2018 03:11:32 PM by Hibernate Tools 4.3.1
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * Resena generated by hbm2java
 */
@Entity
@Table(name = "Resena")
public class Resena  implements Serializable {

    @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "idResena")
     private Integer idResena;   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
     private Usuario username;
    @Column(name = "comentario")     
     private String comentario;
    @Column(name = "calificacion")     
     private int calificacion;

    public Resena() {
    }

	
    public Resena(Usuario username, int calificacion) {
        this.username = username;
        this.calificacion = calificacion;
    }
    public Resena(Usuario username, String comentario, int calificacion) {
       this.username = username;
       this.comentario = comentario;
       this.calificacion = calificacion;
    }
   
    public Integer getIdResena() {
        return this.idResena;
    }
    
    public void setIdResena(Integer idResena) {
        this.idResena = idResena;
    }
    public Usuario getUsuraio() {
        return this.username;
    }
    
    public void setUsuraio(Usuario username) {
        this.username = username;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }




}

