public class FullTimeStaffHire extends StaffHire
{
    //instance variables
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    //making constructor having parameters vacancyNumber,designation,jobType,salary and workingHour
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        //using super keyword to call constructor from parent class
        super(vacancyNumber, designation, jobType);
        //this keyword is used to mention as instance variable
        this.salary= salary;
        this.workingHour = workingHour;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
    }

    //making getter method in order to get value
    public int getSalary(){
        return salary;
    }

    public int getWorkingHour(){
        return workingHour;
    }

    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public boolean getJoined(){
        return joined;
    }

    //making setter method in order to set value
    public void setSalary(int newSalary){
        if(getJoined() == false){
            salary = newSalary;
        }else{
            System.out.println("It is not possible to change the salary");
        }
    }

    public void setWorkingHour(int newWorkingHour){
        workingHour = newWorkingHour;
    }

    public void setStaffName(String staffName){
        this.staffName = staffName;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }

    public void setJoined(boolean joined){
        this.joined = joined;
    }

    //making method which print the result as instructed
    public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if(getJoined() == true){
            System.out.println(staffName + " is already appointed in " + joiningDate);
        }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        }
    }

    //making display method to display the result as instructed 
    public void display(){
        //using super keyword to call display method from parent class StaffHire
        super.display();
        if(getJoined() == true){
            System.out.println("Staff name: " + staffName + "\n" + "Salary: " + salary + "\n" + "Working hour: " + workingHour + "\n" + "Joining date: " + joiningDate + "\n" + "Qualification: " + qualification + "\n" + "Appointed By: " + appointedBy);
        }else{
            System.out.println("Soory! " + staffName + "you are not appointed.");
        }

    }

}