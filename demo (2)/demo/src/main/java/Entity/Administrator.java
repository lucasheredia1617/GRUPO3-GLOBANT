package Entity;

import java.util.List;

public class Administrator {

    private List<Supervisor> supervisorList;

    private int document;
    private String name;

    public Administrator(int document, String name) {
        this.document = document;
        this.name = name;
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

    public Supervisor registerSupervisor(Supervisor sup) {
        supervisorList.add(sup);
        return sup;
    }

    public void unsuscribeSupervisor(int document) {

    }

    public String editSupervisor(int document) {
        return "";
    }

    public String consultSupervisor() {
        return "";
    }



}
