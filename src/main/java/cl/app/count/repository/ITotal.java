/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.count.repository;

import cl.app.count.model.Gastos;
import cl.app.count.model.Total;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gonza
 */
public interface ITotal extends CrudRepository<Total, Long> {
    
    
    Total findById(long id);
}
