package com.groupeisi.moneymobile.model;

import com.groupeisi.moneymobile.wsdl.GetTransfertRequest;
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
public class Transfert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sender;

    private int recever;
    private int montant;

    public int getTransfert(GetTransfertRequest request) {
        return 0;
    }

    public int getIdT() {
        return 0;
    }
}
