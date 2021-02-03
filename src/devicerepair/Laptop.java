package devicerepair;

import java.util.ArrayList;

public class Laptop extends Device {

    ArrayList<Component> componentList = new ArrayList<>();

    public Laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priorityRank) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priorityRank);

    }

    public ArrayList<Component> getComponentList() {
        return componentList;
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void deleteComponent(int index) {
        if (index >= 0 && index <= componentList.size()) {
            componentList.remove(index);
        }

    }
}

