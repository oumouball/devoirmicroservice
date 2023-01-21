package com.groupeisi.moneymobile.web.saop.services.implementation;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.repository.ClientRepository;
import com.groupeisi.moneymobile.web.saop.services.IClient;
import com.groupeisi.moneymobile.wsdl.GetClientRequest;
import org.springframework.stereotype.Service;

@Service
public class ClientImp implements IClient {

    private ClientRepository clientRepository;

    public ClientImp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public static void createClient(Client client) {}

    //  @Override
    public GetClientRequest createClient(GetClientRequest getClientRequest) {
        Client client = new Client();
        client.setIdCompte(getClientRequest.getIdCompte());
        client.setSolde(getClientRequest.getSolde());
        clientRepository.save(client);
        getClientRequest.setId(client.getId());
        return getClientRequest;
    }
}
