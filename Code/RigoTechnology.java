//import widgets from the swing and awt package 
//import array list from utility package
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
/**
 * Define a class RigoTechnology which implements a interface ActionListener which listens the action of the button pressed
 */
public class RigoTechnology implements ActionListener
{
    /**
     * declaring a private variable for JFrame, JLabel, JTextField, JButton and JPanel
     */
    private JFrame frame;
    private JLabel lblAdd, lblPlatform, lblInterviewer,lblSalary, lblWorkingHrs, lblContractPeriod, lblAdvSalary, lblAppointedBy, lblTerminationDate, lblSDeveloper, lblSDevName, lblSDevNo, lblJoiningDate, lblRoomNo, lblJDeveloper, lblJDevName, lblJDevNo,lblSpecialization,lblEvaluationPeriod, lblAppointedDate;
    private JTextField txtFieldPlatform, txtFieldInterviewer, txtFieldSalary, txtWorkingHrs,txtContractPeriod, txtAdvSalary, txtSDevName, txtSDevNo, txtJoiningDate, txtRoomNo, txtJDevName, txtJDevNo, txtSpecialization, txtEvaluationPeriod, txtAppointedDate, txtAppointedBy, txtTerminationDate;
    private JButton btnAddSenior, btnAddJunior, btnAppointSDev, btnTerminateSDev, btnAppointJDev, btnDisplay, btnClear;
    private JPanel Panel,Panel1,Panel2;
    /**
     * ArrayList is created named List of the class developer
     */
    ArrayList<Developer> List=new <Developer>ArrayList();
    
    /**
     * This is a main method where object of RigoTechnology is created with constructor named RigoTechnology
     * and call is made to the non-static method create
     */
    public static void main(String[] args)
    {
        RigoTechnology obj= new RigoTechnology();
        obj.create();
    }
    
    /**
     * This method gives the attractive GUI of class RigoTechnology to create an beautiful application form
     */
    public void create()
    {
        frame= new JFrame("Appointed System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= frame.getContentPane();
        frame.setLayout(null);
        
        contentPane.setLayout(null);       
        Panel= new JPanel();
        Panel.setBounds(10,10,750,250);
        Panel.setVisible(true);
        Panel.setLayout(null);
        Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Add platform for Senior/Junior Developer"));
        contentPane.add(Panel);
                                                    
        lblPlatform= new JLabel("Platform:");
        Panel.add(lblPlatform);
        lblPlatform.setBounds(30,40,80,25);
        
        txtFieldPlatform= new JTextField();
        Panel.add(txtFieldPlatform);
        txtFieldPlatform.setBounds(200,40,530,25);        
        
        lblInterviewer= new JLabel("Interviewer's Name:");
        Panel.add(lblInterviewer);
        lblInterviewer.setBounds(30,70,150,40);     
        
        txtFieldInterviewer= new JTextField();
        Panel.add( txtFieldInterviewer);
        txtFieldInterviewer.setBounds(200,80,530,25);        
                 
        lblWorkingHrs= new JLabel("Working Hours:");
        Panel.add(lblWorkingHrs);
        lblWorkingHrs.setBounds(30,110,150,40);
                
        txtWorkingHrs= new JTextField();
        Panel.add(txtWorkingHrs);        
        txtWorkingHrs.setBounds(200,120,180,25);
        
        lblContractPeriod= new JLabel("Contract Period:");
        Panel.add(lblContractPeriod);
        lblContractPeriod.setBounds(430,110,150,40);
        
        txtContractPeriod= new JTextField();
        Panel.add(txtContractPeriod);
        txtContractPeriod.setBounds(550,120,180,25);
        
        lblSalary= new JLabel("Salary:");
        Panel.add(lblSalary);
        lblSalary.setBounds(30,150,150,40);
        
        txtFieldSalary= new JTextField();
        Panel.add(txtFieldSalary);
        txtFieldSalary.setBounds(200,160,180,25);
        
        lblAppointedBy= new JLabel("Appointed By:");
        Panel.add(lblAppointedBy);
        lblAppointedBy.setBounds(30,190,150,40);
        
        txtAppointedBy= new JTextField();
        Panel.add(txtAppointedBy);
        txtAppointedBy.setBounds(200,200,180,25);
        
        lblAdvSalary= new JLabel("Advance Salary:");
        Panel.add(lblAdvSalary);
        lblAdvSalary.setBounds(430,160,150,20);
        
        txtAdvSalary= new JTextField();
        Panel.add(txtAdvSalary);
        txtAdvSalary.setBounds(550,160,180,25);
                        
        btnAddSenior= new JButton("Add Senior");
        Panel.add(btnAddSenior);
        btnAddSenior.setBounds(420,200,150,30);
        btnAddSenior.addActionListener(this);
        
        btnAddJunior= new JButton("Add Junior");
        Panel.add(btnAddJunior); 
        btnAddJunior.setBounds(580,200,150,30);
        btnAddJunior.addActionListener(this);
                
        Panel1= new JPanel();
        Panel1.setBounds(10,280,750,200);
        Panel1.setVisible(true);
        Panel1.setLayout(null);
        Panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Appoint/Terminate Senior Developer"));
        contentPane.add(Panel1);
                
        lblSDevName= new JLabel("Name:");
        Panel1.add(lblSDevName);
        lblSDevName.setBounds(30,30,80,20);
        
        txtSDevName= new JTextField();
        Panel1.add(txtSDevName);
        txtSDevName.setBounds(200,30,530,25);
        
        lblJoiningDate= new JLabel("Joining Date:");
        Panel1.add(lblJoiningDate);
        lblJoiningDate.setBounds(30,70,150,20);
        
        txtJoiningDate= new JTextField();
        Panel1.add(txtJoiningDate);
        txtJoiningDate.setBounds(200,70,530,25);
        
        lblSDevNo= new JLabel("Developer's Number:");
        Panel1.add(lblSDevNo);
        lblSDevNo.setBounds(30,110,150,20);
        
        txtSDevNo= new JTextField();
        Panel1.add(txtSDevNo);
        txtSDevNo.setBounds(200,110,180,25);
        
        lblRoomNo= new JLabel("Room Number:");
        Panel1.add(lblRoomNo);
        lblRoomNo.setBounds(430,110,150,20);
        
        txtRoomNo= new JTextField();
        Panel1.add(txtRoomNo);
        txtRoomNo.setBounds(550,110,180,25);
        
        btnAppointSDev= new JButton("Appoint Senior");
        Panel1.add(btnAppointSDev);
        btnAppointSDev.setBounds(320,150,200,30);
        btnAppointSDev.addActionListener(this);
        
        btnTerminateSDev= new JButton("Terminate");
        Panel1.add(btnTerminateSDev); 
        btnTerminateSDev.setBounds(530,150,200,30);
        btnTerminateSDev.addActionListener(this);
        
        Panel2= new JPanel();
        Panel2.setBounds(10,500,750,250);
        Panel2.setVisible(true);
        Panel2.setLayout(null);
        Panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Appoint Junior Developer"));
        contentPane.add(Panel2);        
        
        lblJDevName= new JLabel("Name:");
        Panel2.add(lblJDevName);
        lblJDevName.setBounds(30,30,400,20);
        
        txtJDevName= new JTextField();
        Panel2.add(txtJDevName);
        txtJDevName.setBounds(200,30,530,25); 
        
        lblSpecialization= new JLabel("Specialization:");
        Panel2.add(lblSpecialization);
        lblSpecialization.setBounds(30,70,400,20);
        
        txtSpecialization= new JTextField();
        Panel2.add(txtSpecialization);
        txtSpecialization.setBounds(200,70,530,25);        
         
        lblJDevNo= new JLabel("Developer's Number:");
        Panel2.add(lblJDevNo);
        lblJDevNo.setBounds(30,110,400,20);
        
        txtJDevNo= new JTextField();
        Panel2.add(txtJDevNo);
        txtJDevNo.setBounds(200,110,180,25);
        
        lblEvaluationPeriod= new JLabel("Evaluation Period:");
        Panel2.add(lblEvaluationPeriod);
        lblEvaluationPeriod.setBounds(430,110,150,20);
        
        txtEvaluationPeriod= new JTextField();
        Panel2.add(txtEvaluationPeriod);
        txtEvaluationPeriod.setBounds(550,110,180,25);
        
        lblAppointedDate= new JLabel("Appointed Date:");
        Panel2.add(lblAppointedDate);
        lblAppointedDate.setBounds(30,150,400,20);
        
        txtAppointedDate= new JTextField();
        Panel2.add(txtAppointedDate);
        txtAppointedDate.setBounds(200,150,180,25);
        
        lblTerminationDate= new JLabel("Termination Date:");
        Panel2.add(lblTerminationDate);
        lblTerminationDate.setBounds(430,150,150,20);
        
        txtTerminationDate= new JTextField();
        Panel2.add(txtTerminationDate);
        txtTerminationDate.setBounds(550,150,180,25);       
               
        btnAppointJDev= new JButton("Appoint");
        Panel2.add(btnAppointJDev); 
        btnAppointJDev.setBounds(530,190,200,30);
        btnAppointJDev.addActionListener(this);
        
        btnDisplay= new JButton("Display");
        contentPane.add(btnDisplay);
        btnDisplay.setBounds(330,770,200,30);
        btnDisplay.addActionListener(this);
        
        btnClear= new JButton("Clear");
        contentPane.add(btnClear); 
        btnClear.setBounds(540,770,200,30);
        btnClear.addActionListener(this);
        
        frame.setBounds(10,10,790,870);
        frame.setVisible(true); 
    }
    
    /**
     * This is a non-static method which is created to add the platform for the senior developer 
     */
    public void addSeniorDeveloper()
    {
        try
        {
            String platform=txtFieldPlatform.getText();     //get the value of the txtFieldPlatform
                                
            String interviewerName=txtFieldInterviewer.getText();   //get the value of the txtFieldInterviewerName
                            
            int salary=Integer.parseInt(txtFieldSalary.getText());      //convert the int salary to the integer value of the txtSalary 
            
            int workingHours=Integer.parseInt(txtWorkingHrs.getText());     //convert the double workingHours to the integer value of the txtWorkingHrs
                
            int contractPeriod=Integer.parseInt(txtContractPeriod.getText());       //convert the int contractPeriod to the integer value of the txtContractPeriod
                               
            int advanceSalary=Integer.parseInt(txtAdvSalary.getText());             //convert the int advanceSalary to the integer value of the txtAdvanceSalary
            
            /**
             * If txtFieldPlatfrom is not an empty string, txtFieldInterviewer is not an empty string, txtFieldSalary is not an empty string, 
             * txtAppointedBy is not an empty string, txtWorkingHrs is not an empty string, txtContractPeriod is not an empty string and txtAdvSalary is not an empty string
             */
            if(!txtFieldPlatform.getText().equals("") && !txtFieldInterviewer.getText().equals("") && !txtFieldSalary.getText().equals("") && !txtAppointedBy.getText().equals("") && !txtWorkingHrs.getText().equals("") && !txtContractPeriod.getText().equals("") && !txtAdvSalary.getText().equals(""))
            {
                //object of SeniorDeveloper is created made with constructor Senior developer with parameter platform, interviewerName, workingHours, salary, contractPeriod
                SeniorDeveloper obj=new SeniorDeveloper(platform, interviewerName, workingHours, salary, contractPeriod);
                List.add(obj);    //object is added to the list
                JOptionPane.showMessageDialog(frame,"Senior Developer Added Successfully","DEVELOPER",JOptionPane.INFORMATION_MESSAGE);     //Error message 
            }   
            else
            {
                 JOptionPane.showMessageDialog(frame,"Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE);           //error message for the else condition       
            }
        }        
        //catching number format exception 
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(frame, "Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        //catching null pointer exception 
        catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(frame, n.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a non-static method which is created to add the platform for the junior developer 
     */
    
    public void addJuniorDeveloper()
    {
        try
        {
            String platform=txtFieldPlatform.getText();     //get the value of the txtFieldPlatform
                                
            String interviewerName=txtFieldInterviewer.getText();       //get the value of the txtFieldInterviewerName
                                        
            int salary=Integer.parseInt(txtFieldSalary.getText());         //convert the int salary to the integer value of the txtSalary
                
            int workingHours=Integer.parseInt(txtWorkingHrs.getText());     //convert the double workingHours to the integer value of the txtWorkingHrs
            
            String appointedBy=txtAppointedBy.getText();         //get the value of the txtAppointedBy
                
            String terminationDate=txtTerminationDate.getText();         //get the value of the txtTerminationDate
            /**
            *If txtFieldPlatfrom is not an empty string, txtFieldInterviewer is not an empty string, txtFieldSalary is not an empty string, 
            *txtAppointedBy is not an empty string, txtWorkingHrs is not an empty string, txtContractPeriod is not an empty string and txtAdvSalary is not an empty string
            **/
            if(!txtFieldPlatform.getText().equals("") && !txtFieldInterviewer.getText().equals("") && !txtFieldSalary.getText().equals("") && !txtWorkingHrs.getText().equals("") && !txtAdvSalary.getText().equals("") && !txtAppointedBy.getText().equals(""))
            {
                //object of JuniorDeveloper is created made with constructor Senior developer with parameter platform, interviewerName, workingHours, salary, appointedBy, terminationDate
                JuniorDeveloper obj1=new JuniorDeveloper(platform, interviewerName, workingHours, salary, appointedBy, terminationDate);
                List.add(obj1);    //object is added to the list
                JOptionPane.showMessageDialog(null,"Junior Developer Added Successfully");      //error message
            }
            else
            {
                JOptionPane.showMessageDialog(frame,"Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE);      //error message for else condition
            }
        }  
        //catching number format exception 
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(frame, "Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        //catching NullPointerException
        catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(frame, n.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }       
    
    /**
     * This is a non-static method which is created to appoint the senior developer which gets the values of Name, joiningDate, advanceSalary, staffRoomNumber and appointedBy and 
     * converts the String to an int advance salary using Integer.parseInt(). If txtSDevNo is an empty string, txtSDevName is an empty string, txtJoiningDate is an empty string and txtRoomNo 
     * is an empty string, then this method shows dialog box for error. 
     * Else, if developer number is greater than 0 and less than size of the array list then, 
     * this method creates an object of the senior developer with a constructor senior developer with 
     * a parameter Name, joiningDate, advanceSalary and staffRoomNumber. 
     * Similarly, this method shows dialog box for error and performs try and catch for the Number Format and Null Pointer exceptions.  
     */
  
    public void appointSeniorDeveloper()
    {
            try
            {
                String devNo= txtSDevNo.getText();
                    
                String Name=txtSDevName.getText();
                    
                int advanceSalary=Integer.parseInt(txtAdvSalary.getText());
                    
                String joiningDate=txtJoiningDate.getText();
                    
                String staffRoomNumber=txtRoomNo.getText();
                    
                String appointedBy=txtAppointedBy.getText();
                if(txtSDevNo.getText().equals("") && txtSDevName.getText().equals("") && txtJoiningDate.getText().equals("") && txtRoomNo.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame,"Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE); 
                }
                else
                {   
                    int SDevNo=Integer.parseInt(devNo);
                    if(SDevNo>=0 && SDevNo<List.size())
                    {
                        SeniorDeveloper obj=(SeniorDeveloper)List.get(SDevNo);
                        if(obj.getAppointed() == false)
                        {
                            obj.hireDeveloper(Name,joiningDate, advanceSalary, staffRoomNumber);
                            JOptionPane.showMessageDialog(frame,"Senior Developer has been Appointed");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"Sorry ! " + obj.getDeveloperName() + " has been already appointed in staff room number " + obj.getStaffRoomNumber());
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Enter Valid Developer's Number");
                    }
                }              
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame,"Don't leave any text field empty" ,"Error",JOptionPane.ERROR_MESSAGE);
            }            
            catch(NullPointerException n)
            {
                JOptionPane.showMessageDialog(frame, n.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(ClassCastException e)
            {
                JOptionPane.showMessageDialog(frame, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);               
            }
        
    }
    
    /**
     * This is a non-static method which is create to terminate the contract of the developer which converts the int developer number to string 
     * and use if condition and shows the error message.
     * Else converts the string developer number to int
     * In next step, if developer number is greater than 0 and less than size of the array list then casting is done to the object of the senior developer and 
     * this method creates an object of the senior developer to get the values in list.
     * The object is made to call the method contractTermination of class senior developer.

     */
    public void terminateSeniorDeveloper()
    {
        String devNo= txtSDevNo.getText();
        if (devNo.equals(""))
        {
            JOptionPane.showMessageDialog(frame, "Please Enter Developer Number Before Performing This Action.\nThank You","Error!!!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            int SDevNo=Integer.parseInt(devNo);
            if(SDevNo>=0 && SDevNo<List.size())
            {
                if(List.get(SDevNo) instanceof SeniorDeveloper)
                {
                    SeniorDeveloper obj=(SeniorDeveloper)List.get(SDevNo);
                    if(obj.getAppointed())
                    {
                        obj.contractTermination();
                        JOptionPane.showMessageDialog(frame,"Contract has been terminated!!");        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Developer Has Not Been Appointed Yet.","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }
    
    /**
     * This is a non-static method which is created to appoint the junior developer which gets the values of developerName, appointedDate, terminationDate and specialization. 
     * If txtJDevNo is not an empty string, txtJDevName is not an empty string, txtAppointedDate is not an empty string, txtTerminationDate is not an empty string 
     * and txtSpecialization is not an empty strng, then this method shows dialog box for error. 
     * Else, if developer number is greater than 0 and less than size of the array list then, 
     * this method creates an object of the junior developer with a constructor junior developer with a parameter developerName, appointedDate, terminationDate and specialization. 
     * Similarly, this method shows dialog box for error and performs try and catch for the Number Format and Null Pointer exceptions.  
     */
    public void appointJuniorDeveloper()
    {
        try
        {
            String devNo= txtJDevNo.getText();
            
            String developerName=txtJDevName.getText();
                
            String appointedDate=txtAppointedDate.getText();
                
            String terminationDate=txtTerminationDate.getText();
                
            String specialization=txtSpecialization.getText();
            if(txtJDevNo.getText().equals("") && txtJDevName.getText().equals("") && txtAppointedDate.getText().equals("") && txtTerminationDate.getText().equals("") && txtSpecialization.getText().equals("") && txtEvaluationPeriod.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int JDevNo=Integer.parseInt(devNo);                
                if(JDevNo>=0 && JDevNo<List.size())
                {
                    JuniorDeveloper obj=(JuniorDeveloper)List.get(JDevNo);
                    if(obj.getJoined() == false)
                    {
                        obj.appointDeveloper(developerName, appointedDate, terminationDate, specialization);
                        JOptionPane.showMessageDialog(frame,"Junior Developer has been Appointed");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Sorry ! This developer has been already appointed \n at  "+ obj.getAppointedDate());
                    }
                }
                else
                    {
                        JOptionPane.showMessageDialog(frame,"Enter Valid Developer's Number");
                    }
            }
                
            }            
    
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(frame, "Don't leave any text field empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(frame, n.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassCastException e)
        {
            JOptionPane.showMessageDialog(frame, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);               
        }
    }
    
    /**
     * This method is created to display the information of the arraylist. For loop is used to display the list for infinity times .
     */
    public void display()
    {
            for(Developer list:List)
            {
                list.display();
            }
    }
    
    /**
     * This method is used to clear all the text field of the GUI. 
     */
    public void clear()
    {
            txtFieldPlatform.setText("");
            txtFieldInterviewer.setText("");
            txtFieldSalary.setText("");
            txtWorkingHrs.setText("");
            txtContractPeriod.setText("");
            txtSDevName.setText("");
            txtSDevNo.setText("");
            txtJoiningDate.setText("");
            txtRoomNo.setText("");
            txtAdvSalary.setText("");
            txtJDevName.setText("");
            txtJDevNo.setText("");
            txtSpecialization.setText("");
            txtEvaluationPeriod.setText("");
            txtAppointedBy.setText("");
            txtAppointedDate.setText("");
            txtTerminationDate.setText("");
    }   
    
    /**
     * actionPerformed method is used to send the message to action listeners that are registered on the relevant component. 
     * This is the extract method of the interface ActionListener.
     * If obj.getSource() is equals to btnAddSenior then it calls a method addSeniorDeveloper.
     * Else If obj.getSource() is equals to btnAddJunior then it calls a method addJuniorDeveloper.
     * Else If obj.getSource() is equals to btnAppointSDev then it calls a method appointSeniorDeveloper.
     * Else If obj.getSource() is equals to btnTerminateSDev then it calls a method terminateSeniorDeveloper
     * Else If obj.getSource() is equals to btnAppointJDev then it calls a method appointJuniorDeveloper
     * Else If obj.getSource() is equals to btnDisplay then it calls a method display
     * Else call the method clear.

     */
    public void actionPerformed(ActionEvent obj)
    {
        if(obj.getSource().equals (btnAddSenior))
        {
           addSeniorDeveloper();
        }
        else if(obj.getSource().equals (btnAddJunior))
        {
            addJuniorDeveloper();
        }
        else if(obj.getSource().equals (btnAppointSDev))
        {
            appointSeniorDeveloper();
        }
        
        else if(obj.getSource().equals (btnTerminateSDev))
        {
            terminateSeniorDeveloper();
        }
        
        else if(obj.getSource().equals (btnAppointJDev))
        {
            appointJuniorDeveloper();
        }
        
        else if(obj.getSource().equals (btnDisplay))
        {
            display();
        }
        else
        {
            clear();
        }
    }
}