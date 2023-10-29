package com.clients.demo.services;

import com.clients.demo.dto.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    List<Client> clients = new ArrayList<>();



    public List<Client> getAllclients(){
        clients.add(new Client(1L , "Jabran" , "Morocco")) ;
        return clients ;
    }
}
