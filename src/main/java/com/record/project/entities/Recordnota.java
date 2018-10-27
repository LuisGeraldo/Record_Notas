/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "recordnota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recordnota.findAll", query = "SELECT r FROM Recordnota r")
    , @NamedQuery(name = "Recordnota.findByIdrecordnota", query = "SELECT r FROM Recordnota r WHERE r.idrecordnota = :idrecordnota")
    , @NamedQuery(name = "Recordnota.findByCalificacion", query = "SELECT r FROM Recordnota r WHERE r.calificacion = :calificacion")})
public class Recordnota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrecordnota")
    private Integer idrecordnota;
    @Size(max = 2)
    @Column(name = "calificacion")
    private String calificacion;
    @JoinColumn(name = "idestudiante", referencedColumnName = "idestudiante")
    @ManyToOne
    private Estudiante idestudiante;
    @JoinColumn(name = "idmateria", referencedColumnName = "idmateria")
    @ManyToOne
    private Materia idmateria;
    @JoinColumn(name = "idperiodo", referencedColumnName = "idperiodo")
    @ManyToOne
    private Periodo idperiodo;

    public Recordnota() {
    }

    public Recordnota(Integer idrecordnota) {
        this.idrecordnota = idrecordnota;
    }

    public Integer getIdrecordnota() {
        return idrecordnota;
    }

    public void setIdrecordnota(Integer idrecordnota) {
        this.idrecordnota = idrecordnota;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Estudiante idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Materia getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Materia idmateria) {
        this.idmateria = idmateria;
    }

    public Periodo getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(Periodo idperiodo) {
        this.idperiodo = idperiodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecordnota != null ? idrecordnota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recordnota)) {
            return false;
        }
        Recordnota other = (Recordnota) object;
        if ((this.idrecordnota == null && other.idrecordnota != null) || (this.idrecordnota != null && !this.idrecordnota.equals(other.idrecordnota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + idrecordnota;
    }
    
}
