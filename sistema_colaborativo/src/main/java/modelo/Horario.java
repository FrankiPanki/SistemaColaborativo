package modelo;
// Generated 2/10/2018 03:11:32 PM by Hibernate Tools 4.3.1

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.sql.Time;
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
 * Horario generated by hbm2java
 */
@Entity
@Table(name = "Horario")
public class Horario  implements Serializable {

    @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "idHorario")
     private int idHorario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfesor")        
     private Profesor idProfesor;
    @Column(name = "dia")     
     private String dia;
    @Column(name = "horaInicio")     
     private Time horaInicio;
    @Column(name = "horaFin")     
     private Time horaFin;
    @Column(name = "disponible")     
     private Boolean disponible;
    @OneToMany(mappedBy = "idHorario")
     private List<Asesorar> asesorar = new ArrayList<>();

    public Horario() {
    }

	
    public Horario(int idHorario, Profesor idProfesor, String dia, Time horaInicio, Time horaFin, Boolean disponible) {
        this.idHorario = idHorario;
        this.idProfesor = idProfesor;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = disponible;
    }
    public Horario(int idHorario, Profesor idProfesor, String dia, Time horaInicio, Time horaFin, Boolean disponible, List<Asesorar> asesorar) {
       this.idHorario = idHorario;
       this.idProfesor = idProfesor;
       this.dia = dia;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.disponible = disponible;
       this.asesorar = asesorar;
    }
   
    public int getIdHorario() {
        return this.idHorario;
    }
    
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    public Profesor getProfesor() {
        return this.idProfesor;
    }
    
    public void setProfesor(Profesor idProfesor) {
        this.idProfesor = idProfesor;
    }
    public String getDia() {
        return this.dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    public Time getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Time getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    public Boolean getDisponible() {
        return this.disponible;
    }
    
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    public List<Asesorar> getAsesorar() {
        return this.asesorar;
    }
    
    public void setAsesorar(List<Asesorar> asesorar) {
        this.asesorar = asesorar;
    }




}

