package com.record.project.entities;

import com.record.project.entities.Recordnota;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T01:24:19")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, String> descripcion;
    public static volatile SingularAttribute<Periodo, Integer> idperiodo;
    public static volatile SingularAttribute<Periodo, String> nombre;
    public static volatile ListAttribute<Periodo, Recordnota> recordnotaList;

}