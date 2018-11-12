package com.record.project.entities;

import com.record.project.entities.Estudiante;
import com.record.project.entities.Materia;
import com.record.project.entities.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:46:12")
@StaticMetamodel(Recordnota.class)
public class Recordnota_ { 

    public static volatile SingularAttribute<Recordnota, Periodo> idperiodo;
    public static volatile SingularAttribute<Recordnota, String> calificacion;
    public static volatile SingularAttribute<Recordnota, Integer> idrecordnota;
    public static volatile SingularAttribute<Recordnota, Estudiante> idestudiante;
    public static volatile SingularAttribute<Recordnota, Materia> idmateria;

}