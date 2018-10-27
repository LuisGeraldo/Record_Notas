package com.record.project.entities;

import com.record.project.entities.Estudiante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T01:24:19")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> descripcion;
    public static volatile SingularAttribute<Carrera, String> codigo;
    public static volatile ListAttribute<Carrera, Estudiante> estudianteList;
    public static volatile SingularAttribute<Carrera, Integer> idcarrera;
    public static volatile SingularAttribute<Carrera, String> nombre;

}