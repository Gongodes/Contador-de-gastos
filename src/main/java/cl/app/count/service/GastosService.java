
package cl.app.count.service;

import cl.app.count.model.Gastos;
import cl.app.count.model.Total;
import cl.app.count.repository.IGastos;
import cl.app.count.repository.ITotal;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GastosService {
    
   @Autowired 
   private IGastos rp;
   
   
   @Autowired 
   private ITotal tt;
   
   
   public void savegasto(Gastos gastos){
       
       
   
   rp.save(gastos);
   
   
   
          
   }
   
   
   public int montotalgas(){
   
       Integer total = rp.montotalgas();
       
       if (total == null) { return 0;
           
       }
        
     return total;
   
   
   
       
   }
   
   public int montotalgan(){
   
       Integer total = rp.montotalgan();
       
       if (total == null) { return 0;
           
       }
        
     return total;
   
   
   
       
   }
   
   
   public void montotalmes(){
   
       String fecha = new SimpleDateFormat("MMMM").format(new Date());
       Integer total = rp.montotalgas();
       
      Total totalgas = new Total();
      
       if (total == null) {
           
       total =0;
       }
      
      totalgas.setMes(fecha);
      totalgas.setMonto(total);  
      
      
      tt.save(totalgas);
   
       
   }
   
   
   
   
   
   
}
