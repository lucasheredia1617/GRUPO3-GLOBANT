package Entity;

public class Supervisor {

    private int document;
    private String name;
    private String surname;
    private String phoneNumber;

    public Supervisor(int document, String name, String surname, String phoneNumber) {
        this.document = document;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean checkCondition(){
        return true;
    }

    public Boolean checkFillLevel(){
        return true;
    }

    public Boolean checkNeedToReclassify(){
        return true;
    }

    public String addPersonalComments(){
        return "";
    }

}
