import controller.ClientController;
import model.ClientModel;

public class Main {
    public static void main(String[] args) {

        ClientModel client = new ClientModel("Ana Lucia", 23, "890ALM23-06", "SC");
        client.showInformation();

        ClientController clientController = new ClientController(client);
        clientController.updateClient("Ana Lúcia", 23);
        System.out.println("Client Updated");
        client.showInformation();

    }
}