public class StaffHire
{
    //instance varibles
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //making constructor having parameters vacancyNumber,designation and jobType
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
    //making getter method 
    public int getVacancyNumber(){
        return vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }

    public String getJobType(){
        return jobType;
    }
    //making setter method 
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setJobType(String jobType){
        this.jobType = jobType;
    }
    //making method named display which display the vacancyNumber, designation and jobType
    public void display(){
        System.out.println("The vacancy number: " + vacancyNumber);
        System.out.println("The designation: " + designation);
        System.out.println("The job type: " + jobType);
    }
}