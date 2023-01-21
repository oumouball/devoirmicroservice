package com.groupeisi.moneymobile.model;

import com.groupeisi.moneymobile.wsdl.GetClientRequest;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idCompte;
    private int solde;

    public int getClient(GetClientRequest request) {
        return 0;
    }
}
