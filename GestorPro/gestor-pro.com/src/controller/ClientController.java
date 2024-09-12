package controller;

import model.ClientModel;

public class ClientController {
    private ClientModel client;

    public ClientController(ClientModel client) {
        this.client = client;
    }
    public void updateClient(String name,int age) {
        client.setName(name);
        client.setAge(age);
    }
}
