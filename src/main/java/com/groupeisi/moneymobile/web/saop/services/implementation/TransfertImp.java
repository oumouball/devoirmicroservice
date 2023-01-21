package com.groupeisi.moneymobile.web.saop.services.implementation;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.model.Transfert;
import com.groupeisi.moneymobile.repository.ClientRepository;
import com.groupeisi.moneymobile.repository.TransfertRepository;
import com.groupeisi.moneymobile.web.saop.services.ITransfert;
import com.groupeisi.moneymobile.wsdl.GetClientRequest;
import com.groupeisi.moneymobile.wsdl.GetTransfertRequest;
import org.springframework.stereotype.Service;

@Service
public class TransfertImp implements ITransfert {

    private TransfertRepository transfertRepository;

    public TransfertImp(TransfertRepository transfertRepository) {
        this.transfertRepository = transfertRepository;
    }

    public GetTransfertRequest createTransfert(GetTransfertRequest getTransfertRequest) {
        Transfert transfert = new Transfert();
        transfert.setSender(getTransfertRequest.getSender());
        transfert.setRecever(getTransfertRequest.getRecever());
        transfert.setMontant(getTransfertRequest.getMontant());
        // TransfertRepository.save(transfert);
        getTransfertRequest.setIdT(transfert.getIdT());
        return getTransfertRequest;
    }
}
