package com.record.project.entities;

import com.record.project.entities.Recordnota;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:46:12")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> descripcion;
    public static volatile SingularAttribute<Materia, String> codigo;
    public static volatile SingularAttribute<Materia, Integer> idmateria;
    public static volatile SingularAttribute<Materia, String> nombre;
    public static volatile ListAttribute<Materia, Recordnota> recordnotaList;

}