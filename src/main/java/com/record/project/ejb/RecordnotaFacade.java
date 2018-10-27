/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.ejb;

import com.record.project.entities.Recordnota;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luis
 */
@Stateless
public class RecordnotaFacade extends AbstractFacade<Recordnota> {

    @PersistenceContext(unitName = "com.record.project_prjRecordNotas_war_1.0-versionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecordnotaFacade() {
        super(Recordnota.class);
    }
    
}
