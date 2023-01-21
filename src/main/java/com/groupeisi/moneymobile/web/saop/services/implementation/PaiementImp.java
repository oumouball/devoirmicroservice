package com.groupeisi.moneymobile.web.saop.services.implementation;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.model.Paiement;
import com.groupeisi.moneymobile.repository.ClientRepository;
import com.groupeisi.moneymobile.repository.PaiementRepository;
import com.groupeisi.moneymobile.wsdl.GetClientRequest;
import com.groupeisi.moneymobile.wsdl.GetPaiementRequest;
import org.springframework.stereotype.Service;

@Service
public class PaiementImp {

    private PaiementRepository paiementRepository;

    public PaiementImp(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public static void createPaiement(Paiement paiement) {}

    //  @Override
    public GetPaiementRequest createPaiement(GetPaiementRequest getPaiementRequest) {
        Paiement paiement = new Paiement();
        paiement.setBeneficiaire(getPaiementRequest.getBeneficiaire());
        paiement.setMontant(getPaiementRequest.getMontant());
        // paiementRepository.save(paiement);
        getPaiementRequest.setIdP(paiement.getIdP());
        return getPaiementRequest;
    }
}
