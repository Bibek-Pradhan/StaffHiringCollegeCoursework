public class PartTimeStaffHire extends StaffHire
{
    //instance variables
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    //creating constructor which takes parameter as local variables
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour,int wagesPerHour, String shifts){
        //super keyword is used to call constructor from parent class
        super(vacancyNumber, designation, jobType);
        //this keyword is used to determine as instance variable
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }

    //making getter method to get value
    public int getWorkingHour(){
        return workingHour;
    }

    public int getWagesPerHour(){
        return wagesPerHour;
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

    public String getShifts(){
        return shifts;
    }

    public boolean getJoined(){
        return joined;
    }

    public boolean getTerminated(){
        return terminated;
    }

    //making setter method to set value
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }

    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
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

    public void setShifts(String newShifts){
        if(getJoined() == false){
            shifts = newShifts;
        }
    }

    public void setJoined(boolean joined){
        this.joined = joined;
    }

    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }

    //making method name as hirePartTimeStaff which display result as instructed
    public void hirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if(getJoined() == true){
            System.out.println(staffName + " is already apoointed in " + joiningDate); 
        }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }
    }

    //making method name as terminateTheStaff which display result as instructed
    public void terminateTheStaff(){
        if(getTerminated() == true){
            System.out.println("Staff is already terminated.");
        }else{
            staffName = "";
            joiningDate = "";
            qualification = "";
            appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }

    //making method name as display the result as instructed 
    public void display(){
        //super keyword is used to call method from parent class StaffHire
        super.display();
        int incomePerDay = workingHour*wagesPerHour;
        if(getJoined() == true){
            System.out.println("Staff name: " + staffName +"\n" + "Shifts: " + shifts + "\n" + "Wages per hour: " + wagesPerHour + "\n" + "Working hour: "+ workingHour + "\n" + "Join date: " + joiningDate + "\n" + "Qualification: " + qualification + "\n" + "Appointed By: " + appointedBy + "\n" + "Income per day: " + incomePerDay);  
        }
    }
}