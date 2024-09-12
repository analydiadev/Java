package model;

public class ClientModel extends PersonModel   {
    private String identificationClient;
    private String state;

    public ClientModel(String name, int age, String identificationClient, String state) {
        super(name, age);
        this.identificationClient = identificationClient;
        this.state = state;
    }

    public String getIdentificationClient() {
        return identificationClient;
    }

    public void setIdentificationClient(String identificationClient) {
        this.identificationClient = identificationClient;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void showInformation() {
        String information = String.format("Name: %s Age: %s Identification: %s State: %s",
                getName(),
                getAge(),
                getIdentificationClient(),
                getState()
        );
        System.out.println(information);
    }
}
