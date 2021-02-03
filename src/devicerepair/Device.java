
package devicerepair;


public class Device {
    
    protected String identificationCode;
    protected String makeAndModel;
    protected String owner;
    protected String  problemDescription;
    protected String repairNotes;
    protected int priorityRank;

    //Constructor - constructs the objects
    public Device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priorityRank) {
        this.identificationCode = identificationCode;
        this.makeAndModel = makeAndModel;
        this.owner = owner;
        this.problemDescription = problemDescription;
        this.repairNotes = repairNotes;
        this.priorityRank = priorityRank;
    }
    
    public String toString(){
        
        return identificationCode + ", " + makeAndModel + ", " + owner + ", " + problemDescription + ", " + repairNotes + ", " + priorityRank + ", ";
    }

            


    // get and set methods
    public String getIdentificationCode() {
        return identificationCode;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public int getPriorityRank() {
        return priorityRank;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    public void setPriorityRank(int priorityRank) {
        this.priorityRank = priorityRank;
    }
    
    
    
}
