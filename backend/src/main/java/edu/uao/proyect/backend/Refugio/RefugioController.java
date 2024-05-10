package edu.uao.proyect.backend.Refugio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta/refugio")
public class RefugioController {
    @Autowired
    RefugioService refugioService;

    @GetMapping
    public List<Refugio> getAllRefugio(){
        return refugioService.getAllRefugio();
    }

    @PostMapping("/guardar")
    public Refugio saveRefugio(@RequestBody Refugio refugio){
        return refugioService.saveRefugio(refugio);
    }
    

}
    