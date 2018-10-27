package com.record.project.entities;

import com.record.project.entities.Carrera;
import com.record.project.entities.Recordnota;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T01:24:19")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, String> cedula;
    public static volatile SingularAttribute<Estudiante, Integer> idestudiante;
    public static volatile SingularAttribute<Estudiante, String> primernombre;
    public static volatile SingularAttribute<Estudiante, String> direccion;
    public static volatile SingularAttribute<Estudiante, String> primerapellido;
    public static volatile SingularAttribute<Estudiante, Carrera> idcarrera;
    public static volatile SingularAttribute<Estudiante, String> segundoapellido;
    public static volatile SingularAttribute<Estudiante, String> matricula;
    public static volatile SingularAttribute<Estudiante, String> sexo;
    public static volatile SingularAttribute<Estudiante, String> telefono;
    public static volatile SingularAttribute<Estudiante, String> segundonombre;
    public static volatile SingularAttribute<Estudiante, String> email;
    public static volatile ListAttribute<Estudiante, Recordnota> recordnotaList;

}