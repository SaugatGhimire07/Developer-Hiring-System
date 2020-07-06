//JuniorDeveloper class inherits Developer class
public class JuniorDeveloper extends Developer
{
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    /**
     * constructor SeniorDeveloper is created with five parameters 
     * (platform as a string, interviewerName as a string, workingHours as a double, salary as integer, appointedBy as a string and terminationDate as a string)
     */    
    public JuniorDeveloper(String platform, String interviewerName,double workingHours, int salary, String appointedBy, String terminationDate)
    {
        super(platform,interviewerName,workingHours);//a call is made to the parent class(Developer) to the constructor "Developer" with three parameters
        this.salary= salary;
        this.appointedBy= appointedBy;
        this.terminationDate= terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined=false;
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
    //retrieving the value of a variable "appointedBy"
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    //retrieving the value of a variable "terminationDate" 
    public String getTerminationDate()
    {
        return terminationDate;
    }
    
    //retrieving the value of a variable "appointedDate"
    public String getAppointedDate()
    {
        return appointedDate;
    }
    
    //retrieving the value of a variable "evaluationPeriod"
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    
    //retrieving the value of a variable "specialization"
    public String getSpecialization()
    {
        return specialization;
    }
    
    //retrieving the value of a variable "joined"
    public boolean getJoined()
    {
        return joined;
    }
    
    //a method is created for updating the value of a variable "salary"
    public void setSalary(int salary)
    {
        if(joined==false)       //the developer has not joined yet
        {
            this.salary= salary;    //Initialized the value salary received as argument to the instance variable salary
        }
        else        //the developer has already joined
        {
            //a suitable message that displays it is not possible to change salary 
            System.out.println("You are already appointed. Therefore, it is not possible to change your salary.");
        }
    }
    
    /**
     * a method "appointDeveloper" is created with four parameters 
     * (developerName as a string, appointedDate as a string, terminationDate as a string, specialization as a string)
     */
    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
    {
        if(joined==false)       //the developer has not joined yet
        {
            super.setDeveloperName(developerName);//a call is made to parent class constructor to set developerName with a parameter developerName
            this.appointedDate= appointedDate;
            this.terminationDate= terminationDate;
            this.specialization= specialization;
            joined=true;        //joined is changed to true
        }
        else        //developer has already joined
        {
            System.out.println("You are already appointed.");   //a suitable message to display that the developer is already appointed 
            System.out.println("Appointed Date="+appointedDate);
        }
    }
    
    /**
     * a display method is created to display appointedDate, DeveloperName, evaluationPeriod,terminationDate,salary,specialization and appointedBy
     */
    public void display()
    {
        super.display();     //a call is made to super class display method in the developer class
        if(joined==true)    //developer has already joined
        {
            System.out.println("Appointed Date="+appointedDate);
            System.out.println("Developer Name="+getDeveloperName());
            System.out.println("Evaluation Period="+evaluationPeriod);
            System.out.println("Termination Date="+terminationDate);
            System.out.println("Developer Salary="+salary);
            System.out.println("Developer Specialization="+specialization);
            System.out.println("Developer Appointed By="+appointedBy);
        }
    }
    
}    