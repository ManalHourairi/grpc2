package ma.projet.grpc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String solde;
    private String dateCreation;
    private String type;




}