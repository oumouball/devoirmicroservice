package com.groupeisi.moneymobile.web.saop.services.implementation;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.model.Solde;
import com.groupeisi.moneymobile.repository.ClientRepository;
import com.groupeisi.moneymobile.repository.SoldeRepository;
import com.groupeisi.moneymobile.web.saop.services.ISolde;
import com.groupeisi.moneymobile.wsdl.GetClientRequest;
import com.groupeisi.moneymobile.wsdl.SoldeRequest;
import org.springframework.stereotype.Service;

@Service
public class SoldeImp implements ISolde {

    private SoldeRepository soldeRepository;

    public SoldeImp(SoldeRepository soldeRepository) {
        this.soldeRepository = soldeRepository;
    }

    public static void createSolde(Solde solde) {}

    //  @Override
    public SoldeRequest createSolde(SoldeRequest soldeRequest) {
        Solde solde = new Solde();
        solde.setSolde(soldeRequest.getSolde());
        soldeRepository.save(solde);
        //soldeRequest.setIdS(idS.getId());
        return soldeRequest;
    }
}
