public class Developer
{
    private String platform;
    private String interviewerName;
    private String developerName;
    private double workingHours;
    
    /**
     * Since all the attributes are assigned as private. 
     * These variables cannot be directly accessed.
     * So, accessor method is used for retrieving or updating value of a variables.
     */
    //retrieving value of a variable "platform"
    public String getPlatform()
    {
        return platform;
    }
    
    //retrieving value of a variable "interviewerName"
    public String getInterviewerName()
    {
        return interviewerName;
    }
    
    //retrieving value of a variable "developerName"
    public String getDeveloperName()
    {
        return developerName;
    }
    
    //updating the value of a variable "developerName"
    public void setDeveloperName(String developerName)
    {
        this.developerName= developerName; //Initialized the value developerName received as argument to the instance variable developerName!
    }
    
    //retrieving value of a variable "workingHours"
    public double getWorkingHours()
    {
        return workingHours;
    }
    
    /**
     *constructor "Developer" is created and 
     *three parameters "platform as a string, interviewerName as a string and workingHours as a double" are assigned. 
     */
    
    public Developer(String platform, String interviewerName, double workingHours)
    {
        this.platform= platform;
        this.interviewerName= interviewerName;
        this.workingHours= workingHours;
        developerName=""; //developerName is assigned as a empty string
    }
    
    /**
     * a display method is created to display platform, interviewerName, DeveloperName, WorkingHours
     */
    public void display()
    {
        System.out.println("Platform="+ platform);
        System.out.println("Interviewer Name="+interviewerName);
        if(!(developerName.equals("")))
        {
            System.out.println("Developer Name="+developerName);
        }
        System.out.println("Working Hours="+workingHours);        
    }
}