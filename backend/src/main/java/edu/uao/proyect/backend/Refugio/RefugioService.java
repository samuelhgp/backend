package edu.uao.proyect.backend.Refugio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RefugioService {
        @Autowired
    RefugioRepository refugioRepository;

    public List<Refugio> getAllRefugio(){
        return refugioRepository.findAll();
    }
    
    public Refugio saveRefugio(Refugio refugio){
        return refugioRepository.save(refugio);
    }
    
}
