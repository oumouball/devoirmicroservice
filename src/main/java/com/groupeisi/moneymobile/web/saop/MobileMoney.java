package com.groupeisi.moneymobile.web.saop;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.model.Solde;
import com.groupeisi.moneymobile.model.Transfert;
import com.groupeisi.moneymobile.web.saop.services.implementation.ClientImp;
import com.groupeisi.moneymobile.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MobileMoney {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "getInfoRequest")
    public @ResponsePayload GetInfoResponse getInfoRequest(@RequestPayload GetInputRequest request) {
        GetInfoResponse response = new GetInfoResponse();
        response.setOutup("Bonjour M2IAGE" + request.getInput());
        return response;
    }

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "getClientRequest")
    public @ResponsePayload GetClientResponse getClientRequest(@RequestPayload GetClientRequest request) {
        GetClientResponse reponse = new GetClientResponse();
        logger.info(" Le client " + request);
        Client client = new Client();
        ClientImp.createClient(client);
        reponse.setGetClientResponse(client.getClient(request));
        return reponse;
    }

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "GetTransfertRequest")
    public @ResponsePayload GetTransfertResponse getTransfert(@RequestPayload GetTransfertRequest request) {
        GetTransfertResponse reponse = new GetTransfertResponse();
        logger.info(" Valeur transferer" + request);
        Transfert transfert = new Transfert();
        reponse.setGetTransfertResponse(transfert.getTransfert(request));
        return reponse;
    }

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "SoldetRequest")
    public @ResponsePayload GetSoldeResponse soldeRequest(@RequestPayload SoldeRequest request) {
        GetSoldeResponse reponse = new GetSoldeResponse();
        logger.info(" votre solde " + request);
        Solde solde = new Solde();
        //    reponse.setGetSoldeResponse(solde.getSolde(request));
        return reponse;
    }
}
