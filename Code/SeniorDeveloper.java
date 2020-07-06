//SeniorDeveloper class inherits Developer class
public class SeniorDeveloper extends Developer
{
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private double contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    /**
     * constructor SeniorDeveloper is created with five parameters 
     * (platform as a string, interviewerName as a string, workingHours as a double, salary as integer and contractPeriod as a double)
     */
    
    public SeniorDeveloper(String platform,String interviewerName,double workingHours, int salary,double contractPeriod)
    {
        super(platform,interviewerName,workingHours); //a call is made to the parent class(Developer) to the constructor "Developer" with three parameters
        this.salary= salary;
        this.contractPeriod= contractPeriod;
        joiningDate="";         //joiningDate is assigned as a empty string
        staffRoomNumber="";     //staffRoomNumber is assigned as a empty string
        advanceSalary= 0.0;     //advanceSalary is assigned to 0.0
        appointed= false;       //appointed is initialized to false
        terminated= false;      //terminated is initialized to false
    }
    
    /**
     * Since all the attributes are assigned as private. 
     * These variables cannot be directly accessed.
     * So,the outside code have to appeal to the accessor method.
     */
    
    //retrieving the value of a variable "salary"
    public int getSalary()
    {
        return salary;
    }
    
    //retrieving the value of a variable "contractPeriod"
    public double getContractPeriod()
    {
        return contractPeriod;
    }
    
    //retrieving the value of a variable "joiningDate"
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    //retrieving the value of a variable "staffRoomNumber"
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    
    //retrieving the value of a variable "advanceSalary"
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    
    //retrieving the value of a variable "appointed"
    public boolean getAppointed()
    {
        return appointed;
    }
    
    //retrieving the value of a variable "terminated"
    public boolean getTerminated()
    {
        return terminated;
    }
    
    //updating the value of a variable "salary"
    public void setSalary(int salary)
    {
        this.salary= salary;    //Initialized the value salary received as argument to the instance variable salary
    }
    
    //updating the value of a variable "contractPeriod"
    public void setContractPeriod(double contractPeriod)
    {
        this.contractPeriod= contractPeriod;    //Initialized the value contractPeriod received as argument to the instance variable contractPeriod
    }
    
    /**
     * a new method hireDeveloper is created with four parameters
     * (developerName as string,joiningDate as a string, advanceSalary as a double, staffRoomNumber as a string)
     */
    public void hireDeveloper(String developerName,String joiningDate, double advanceSalary, String staffRoomNumber)
    {
        if(appointed==true)  //developer is already appointed
        {
            System.out.println("You are already hired.");       //a message that diplays that developer is already hired.
            System.out.println("Developer Name="+developerName+"\nRoom Number="+staffRoomNumber);//prints developer name and room number.
        }
        else        //developer is not appointed
        {
            super.setDeveloperName(developerName);   //a call is made to parent class constructor to set developerName with a parameter developerName
            this.joiningDate= joiningDate;         
            this.staffRoomNumber= staffRoomNumber;
            this.advanceSalary= advanceSalary;
            appointed=true;     //appointed is changed to true
            terminated=false;    //terminated is changed to false
        }
    }    
    
    /**
     * a method contractTermination is created
     */
    public void contractTermination()
    {
        if(terminated==true)        //the developer's contract is already terminated
        {
            System.out.println("Your contract is terminated.");   //a suitable message is diplayed to show the developer contract is termianted as output.              
        }
        else        //the developer's contract is not terminated
        {
            super.setDeveloperName("");   //a call is made to parent class to update the value of variable "developerName" as a empty string
            joiningDate="";     //joiningDate is assigned as a empty string
            advanceSalary=0.0;   //advanceSalary is set to 0.0
            appointed=false;      //appointed is initialized to false
            terminated=true;       //terminated is initialized to true
        }            
    }
    
    /**
     *a method print is created to display the platform, interviewerName and salary 
     */
    public void print()
    {
        System.out.println("Platform="+getPlatform());
        System.out.println("Interviewer Name="+getInterviewerName());
        System.out.println("Developer Salary="+salary);            
    }
    
    /**
     * a method display is created to display termination status, joining date, advance salary and developer's name
     */
    public void display()
    {
        super.display();       //a call is made to super class display method in the developer class
        if(appointed==true)     //developer is already appointed
        {
            System.out.println("Termination Status="+terminated);
            System.out.println("Joining Date="+joiningDate);
            System.out.println("Advance Salary="+advanceSalary);                         
        }
    }
}