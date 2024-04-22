package feb13;

public class PetVO {
    private String id;
    private String name;
    private String petType;
    private String nameOfDisease;
    private String enrolledDate;
    private String dateOfCare;
    private String doctor;

    public PetVO(String id, String name, String nameOfDisease, String enrolledDate, String dateOfCare, String petType, String vet) {
        this.id = id;
        this.name = name;
        this.nameOfDisease = nameOfDisease;
        this.enrolledDate = enrolledDate;
        this.dateOfCare = dateOfCare;
        this.petType = petType;
        this.doctor = vet;
    }

    public PetVO(String updateId, String updateDisease, String updateDate) {
        this.id = updateId;
        this.nameOfDisease = updateDisease;
        this.dateOfCare = updateDate;
    }

    public String getId(){return id;}
    public String getName(){return name;}
    public String getPetType(){return petType;}
    public String getNameOfDisease(){return nameOfDisease;}
    public String getEnrolledDate(){return enrolledDate;}
    public String getDateOfCare(){return dateOfCare;}
    public String getDoctor(){return doctor;}

    public void setId(String id){this.id=id;}
    public void setName(String name){this.name = name;}
    public void setPetType(String petType){this.petType=petType;}
    public void setNameOfDisease(String nameOfDisease){this.nameOfDisease=nameOfDisease;}
    public void setEnrolledDate(String enrolledDate){this.enrolledDate=enrolledDate;}
    public void setDateOfCare(String dateOfCare){this.dateOfCare=dateOfCare;}
    public void setDoctor(String doctor){this.doctor=doctor;}
}
