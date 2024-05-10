package edu.uao.proyect.backend.Refugio;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Refugio {
    @Id
    @GeneratedValue
    private Integer Id_refugio;
    @Basic
    private Integer Id_dueño_refugio;
    private String Direccion;
    private Integer Pob_maxima;

}
