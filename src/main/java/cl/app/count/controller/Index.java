package cl.app.count.controller;

import cl.app.count.model.Gastos;
import cl.app.count.repository.IGastos;
import cl.app.count.repository.ITotal;
import cl.app.count.service.GastosService;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Index {

    @Autowired
    private GastosService gs;
    
     @Autowired
    private ITotal tt;
    
    @Autowired
    private IGastos gst;

    @GetMapping("/")
    public String inicio(ModelMap m) {

        int total = gs.montotalgas();

        int totalgan = gs.montotalgan();
        int totat;
        
        
        int totaltot = totalgan-total;
        
        Integer ene = gst.montotalene();
        Integer feb = gst.montotalfeb();
        Integer mar = gst.montotalmar();
        Integer abr = gst.montotalabr();
        Integer may = gst.montotalmay();
        Integer jun = gst.montotaljun();
        Integer jul = gst.montotaljul();
        Integer ago = gst.montotalago();
        Integer sep = gst.montotalsep();
        Integer oct = gst.montotaloct();
        Integer nov = gst.montotalnov();
        Integer dic = gst.montotaldic();
        
        if (ene==null) { ene =0;
            
        }
        
        
        if (feb==null) { feb =0;
            
        }
        if (mar==null) { mar =0;
            
        }
        if (abr==null) { abr =0;
            
        }
        if (may==null) { may =0;
            
        }
        if (jun==null) { jun =0;
            
        }
        if (jul==null) { jul =0;
            
        }
        if (ago==null) { ago =0;
            
        }
        if (sep==null) { sep =0;
            
        }
        
         if (oct==null) { oct =0;
            
        }
         
          if (nov==null) { nov =0;
            
        }
          
           if (dic==null) { dic =0;
            
        }
        
        
        int totalano = ene+feb+mar+abr+may+jun+jul+ago+sep+oct+nov+dic;
        
        
         int porgan = gst.montotalingpors();
        int porper = gst.montotalgaspor() ;
        
        
        Iterable<Gastos> top = gst.top5();
        
        Iterable<Gastos> all = gst.findAll();
        
         m.addAttribute("totaltot", totaltot);
        
        m.addAttribute("all", all);
     
         m.addAttribute("top", top);
        
        m.addAttribute("ene", ene);
        
        m.addAttribute("feb", feb);
        
        m.addAttribute("mar", mar);
        
        m.addAttribute("abr", abr);
        
        m.addAttribute("may", may);
        
        m.addAttribute("jun", jun);
        
        m.addAttribute("jul", jul);
        
        m.addAttribute("ago", ago);
        
        m.addAttribute("sep", sep);
        
        m.addAttribute("oct", oct);
        
        m.addAttribute("nov", nov);
        
        m.addAttribute("dic", dic);
        
        m.addAttribute("totalano", totalano);
        
         m.addAttribute("porgan", porgan);
         
         m.addAttribute("porper", porper);
        
        
        

        m.addAttribute("totalgas", total);

        m.addAttribute("totalgan", totalgan);
        
       
        

       
        return "index";

    }

    @PostMapping("/ingreso")
    public String ingreso(ModelMap m, Gastos gastos, RedirectAttributes r) {

        gs.savegasto(gastos);

        int total = gs.montotalgas();

        int totalgan = gs.montotalgan();

        gs.montotalmes();

        r.addFlashAttribute("totalgas", total);
        r.addFlashAttribute("totalgan", totalgan);
        return "redirect:/";

    }
    
    
    
     @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable("id") long id, Model m) {
    gst.delete(gst.findById(id));
    tt.delete(tt.findById(id));
    return "redirect:/";
    }
    
    
    
    @GetMapping("/borrartodo")
    public String borrartodo() {
    gst.deleteAll();
    tt.deleteAll();
    return "redirect:/";
    }
    
        
}
