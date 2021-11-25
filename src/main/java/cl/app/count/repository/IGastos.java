
package cl.app.count.repository;

import cl.app.count.model.Gastos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface IGastos extends CrudRepository<Gastos,Long> {
    
    
    @Query(nativeQuery = true, value = "SELECT * FROM gastos where tipo = 'Gasto' order by cantidad desc limit 5")
   Iterable<Gastos> top5();
    
    @Query(nativeQuery = true, value = "SELECT count(cantidad)FROM gastos where tipo = 'Gasto';")
    Integer montotalgaspor();              
    
    
    
    @Query(nativeQuery = true, value = "SELECT count(cantidad)FROM gastos where tipo = 'Ingreso';")
    Integer montotalingpors();
    
    
    
    @Query(nativeQuery = true, value = "SELECT sum(cantidad)FROM gastos where tipo = 'Gasto';")
    Integer montotalgas();
    
    
    
    @Query(nativeQuery = true, value = "SELECT sum(cantidad)FROM gastos where tipo = 'Ingreso';")
    Integer montotalgan();
    
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'January');")
    Integer montotalene();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'February');")
    Integer montotalfeb();
    
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'March');")
    Integer montotalmar();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'April');")
    Integer montotalabr();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'May');")
    Integer montotalmay();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'June');")
    Integer montotaljun();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'July');")
    Integer montotaljul();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'August');")
    Integer montotalago();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'September');")
    Integer montotalsep();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'October');")
    Integer montotaloct();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'November');")
    Integer montotalnov();
    
    @Query(nativeQuery = true, value = "SELECT monto FROM total WHERE ID = (SELECT MAX(ID) FROM total WHERE mes = 'December');")
    Integer montotaldic();
    
    Gastos findById(long id);
    
    
    
}
