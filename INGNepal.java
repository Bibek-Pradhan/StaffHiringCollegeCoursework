import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;  

import java.util.ArrayList;

public class INGNepal{
    private JFrame f;
    private JMenuBar menuBar;
    private JMenu about,help;
    private JMenuItem developer,aboutApp;
    private JPanel welcomePanel,partTimePanel,fullTimePanel;
    private  JLabel welcomeTxt,partTime,fullTime,byeTxt,forPartTime,forFullTime,vacancyNumber,salary,designation,wagesPer,jobType,staffName,joiningDate,appointedBy,qualification,workingHour,shifts,vacancyNum;
    private JTextField vacancyNumber1,designation1,wagesPer1,jobType1,staffName1,joiningDate1,salary1,appointedBy1,qualification1,workingHour1,shifts1,vacancyNum1;
    private JButton btnPartTime,btnFullTime,save,appoint,display,clear,exit,terminate,back;

    ArrayList<StaffHire> list = new ArrayList<StaffHire>();

    public INGNepal(){
        initilizeFrame();
        initilizeBody();
    }
    // making frame i.e"My Application"
    public void initilizeFrame(){
        f = new JFrame("My Application");
        f.setLayout(null);
        f.setSize(600,450);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    // making panel which appear first while running programme
    public void initilizeBody(){
        welcomePanel = new JPanel();
        welcomePanel.setSize(600,450);
        welcomePanel.setBackground(Color.orange);
        welcomePanel.setLayout(null);
        f.add(welcomePanel);

        menuBar = new JMenuBar();
        menuBar.setBounds(0,0,600,20);
        welcomePanel.add(menuBar);

        about = new JMenu("About");
        menuBar.add(about);

        help = new JMenu("Help");        
        menuBar.add(help);

        developer = new JMenuItem("Developer");
        developer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    aboutDeveloper();
                }
            });
        about.add(developer);

        aboutApp = new JMenuItem("About App");
        aboutApp.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    aboutHelp();
                }
            });
        help.add(aboutApp);

        welcomeTxt = new JLabel("Welcome to You !!");
        welcomeTxt.setFont(new Font("Arial", Font.BOLD, 15));
        welcomeTxt.setForeground(Color.blue);
        welcomeTxt.setBounds(220,25,150,40);
        welcomePanel.add(welcomeTxt);

        partTime = new JLabel("Please, click PartTimeStaff button to visit Part Time Staff Hire.");
        partTime.setBounds(110,80,350,40);
        welcomePanel.add(partTime);

        btnPartTime = new JButton("PartTimeStaff");
        btnPartTime.setBackground(Color.gray);
        btnPartTime.setForeground(Color.white);
        btnPartTime.setBounds(230,140,120,35);
        btnPartTime.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    forPartTimeStaff();
                    welcomePanel.setVisible(false);
                }
            });
        welcomePanel.add(btnPartTime);

        fullTime = new JLabel("Please, click FullTimeStaff button to visit Full Time Staff Hire.");
        fullTime.setBounds(110,200,350,40);
        welcomePanel.add(fullTime);

        btnFullTime = new JButton("FullTimeStaff");
        btnFullTime.setBackground(Color.gray);
        btnFullTime.setForeground(Color.white);
        btnFullTime.setBounds(230,260,120,35);
        btnFullTime.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    forFullTimeStaff();
                    welcomePanel.setVisible(false);
                }
            });
        welcomePanel.add(btnFullTime);

        exit = new JButton("Exit");
        exit.setBackground(Color.gray);
        exit.setForeground(Color.white);
        exit.setBounds(240,330,100,35);
        exit.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){
                    exIT();
                }  
            });         
        welcomePanel.add(exit);

        byeTxt = new JLabel("Thank You! For visiting.");
        byeTxt.setBounds(220,370,200,40);
        welcomePanel.add(byeTxt);

        welcomePanel.setVisible(true);
    }
    
    //making panel for Part Time Staff Hire
    public void forPartTimeStaff(){
        partTimePanel = new JPanel();
        partTimePanel.setSize(600,450);
        partTimePanel.setBackground(Color.orange);
        partTimePanel.setLayout(null);
        f.add(partTimePanel);

        forPartTime = new JLabel("For Part Time Staff Hire ");
        forPartTime.setFont(new Font("Arial", Font.BOLD, 13));
        forPartTime.setBounds(230,8,150,30);
        partTimePanel.add(forPartTime);

        vacancyNumber = new JLabel("Vacancy Number:");
        vacancyNumber.setFont(new Font("Arial", Font.BOLD, 13));
        vacancyNumber.setBounds(30,43,120,40);
        partTimePanel.add(vacancyNumber);

        vacancyNumber1 = new JTextField();
        vacancyNumber1.setBounds(145,48,130,22);
        partTimePanel.add(vacancyNumber1);

        designation = new JLabel("Designation:");
        designation.setFont(new Font("Arial", Font.BOLD, 13));
        designation.setBounds(320,43,100,40);
        partTimePanel.add(designation);

        designation1 = new JTextField();
        designation1.setBounds(415,48,130,22);
        partTimePanel.add(designation1);

        wagesPer = new JLabel("WagesPerHour:");
        wagesPer.setFont(new Font("Arial", Font.BOLD, 13));
        wagesPer.setBounds(30,80,100,40);
        partTimePanel.add(wagesPer);

        wagesPer1 = new JTextField();
        wagesPer1.setBounds(145,85,130,22);
        partTimePanel.add(wagesPer1);

        workingHour = new JLabel("Working Hour:");
        workingHour.setFont(new Font("Arial", Font.BOLD, 13));
        workingHour.setBounds(320,80,100,40);
        partTimePanel.add(workingHour);

        workingHour1 = new JTextField();
        workingHour1.setBounds(415,85,130,22);
        partTimePanel.add(workingHour1);

        jobType = new JLabel("Job Type:");
        jobType.setFont(new Font("Arial", Font.BOLD, 13));
        jobType.setBounds(30,117,100,40);
        partTimePanel.add(jobType);

        jobType1 = new JTextField();
        jobType1.setBounds(145,122,130,22);        
        partTimePanel.add(jobType1);

        shifts = new JLabel("Shifts:");
        shifts.setFont(new Font("Arial", Font.BOLD, 13));
        shifts.setBounds(320,117,100,40);
        partTimePanel.add(shifts);

        shifts1 = new JTextField();
        shifts1.setBounds(415,122,130,22);
        partTimePanel.add(shifts1);

        save = new JButton("Add");
        save.setBounds(445,153,100,35);
        save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffAdd();
                }
            });
        partTimePanel.add(save);

        staffName = new JLabel("Staff Name:");
        staffName.setFont(new Font("Arial", Font.BOLD, 13));
        staffName.setBounds(30,190,100,40);
        partTimePanel.add(staffName);

        staffName1 = new JTextField();
        staffName1.setBounds(145,195,130,22);
        partTimePanel.add(staffName1);

        appointedBy = new JLabel("Appointed By:");
        appointedBy.setFont(new Font("Arial", Font.BOLD, 13));
        appointedBy.setBounds(320,190,100,40);
        partTimePanel.add(appointedBy);

        appointedBy1 = new JTextField();
        appointedBy1.setBounds(415,195,130,22);
        partTimePanel.add(appointedBy1);

        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Arial", Font.BOLD, 13));
        qualification.setBounds(30,227,100,40);
        partTimePanel.add(qualification);

        qualification1 = new JTextField();
        qualification1.setBounds(145,232,130,22);
        partTimePanel.add(qualification1);

        joiningDate = new JLabel("Joining Date:");
        joiningDate.setFont(new Font("Arial", Font.BOLD, 13));
        joiningDate.setBounds(320,227,100,40);
        partTimePanel.add(joiningDate);

        joiningDate1 = new JTextField();
        joiningDate1.setBounds(415,232,130,22);
        partTimePanel.add(joiningDate1);

        vacancyNum = new JLabel("Vacancy Number:");
        vacancyNum.setFont(new Font("Arial", Font.BOLD, 13));
        vacancyNum.setBounds(30,264,120,40);
        partTimePanel.add(vacancyNum);

        vacancyNum1 = new JTextField();
        vacancyNum1.setBounds(145,269,130,22);
        partTimePanel.add(vacancyNum1);

        appoint = new JButton("Appoint");
        appoint.setBounds(445,310,100,35);
        appoint.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffAppoint();
                }
            });
        partTimePanel.add(appoint);

        terminate = new JButton("Terminate");
        terminate.setBounds(30,310,100,35);
        terminate.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffTerminate();
                }
            });
        partTimePanel.add(terminate);

        clear = new JButton("Clear");
        clear.setBounds(445,365,100,35);
        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeClear();
                }
            });
        partTimePanel.add(clear);

        back = new JButton("Back");
        back.setBounds(235,310,100,35);
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    welcomePanel.setVisible(true);
                    partTimePanel.setVisible(false);

                }
            });
        partTimePanel.add(back);

        exit = new JButton("Exit");
        exit.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){
                    exIT();
                }  
            }); 
        exit.setBounds(235,365,100,35);
        partTimePanel.add(exit);

        display = new JButton("Display");
        display.setBounds(30,365,100,35);
        display.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffDisplay();
                }
            });
        partTimePanel.add(display);

        partTimePanel.setVisible(true);
    }
    
    //making panel for Part Time Staff Hire
    public void forFullTimeStaff(){
        fullTimePanel = new JPanel();
        fullTimePanel.setSize(600,450);
        fullTimePanel.setBackground(Color.orange);
        fullTimePanel.setLayout(null);
        f.add(fullTimePanel);

        forFullTime = new JLabel("For Full Time Staff Hire ");
        forFullTime.setFont(new Font("Arial", Font.BOLD, 13));
        forFullTime.setBounds(230,8,150,30);
        fullTimePanel.add(forFullTime);

        vacancyNumber = new JLabel("Vacancy Number:");
        vacancyNumber.setFont(new Font("Arial", Font.BOLD, 13));
        vacancyNumber.setBounds(30,43,120,40);
        fullTimePanel.add(vacancyNumber);

        vacancyNumber1 = new JTextField();
        vacancyNumber1.setBounds(145,48,130,22);
        fullTimePanel.add(vacancyNumber1);

        designation = new JLabel("Designation:");
        designation.setFont(new Font("Arial", Font.BOLD, 13));
        designation.setBounds(320,43,100,40);
        fullTimePanel.add(designation);

        designation1 = new JTextField();
        designation1.setBounds(415,48,130,22);
        fullTimePanel.add(designation1);

        salary = new JLabel("Salary:");
        salary.setFont(new Font("Arial", Font.BOLD, 13));
        salary.setBounds(30,80,100,40);
        fullTimePanel.add(salary);

        salary1 = new JTextField();
        salary1.setBounds(145,85,130,22);
        fullTimePanel.add(salary1);

        workingHour = new JLabel("Working Hour:");
        workingHour.setFont(new Font("Arial", Font.BOLD, 13));
        workingHour.setBounds(320,80,100,40);
        fullTimePanel.add(workingHour);

        workingHour1 = new JTextField();
        workingHour1.setBounds(415,85,130,22);
        fullTimePanel.add(workingHour1);

        jobType = new JLabel("Job Type:");
        jobType.setFont(new Font("Arial", Font.BOLD, 13));
        jobType.setBounds(30,117,100,40);
        fullTimePanel.add(jobType);

        jobType1 = new JTextField();
        jobType1.setBounds(145,122,130,22);
        fullTimePanel.add(jobType1);

        save = new JButton("Add");
        save.setBounds(445,122,100,35);
        save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffAdd();
                }
            });
        fullTimePanel.add(save);

        staffName = new JLabel("Staff Name:");
        staffName.setFont(new Font("Arial", Font.BOLD, 13));
        staffName.setBounds(30,190,100,40);
        fullTimePanel.add(staffName);

        staffName1 = new JTextField();
        staffName1.setBounds(145,195,130,22);
        fullTimePanel.add(staffName1);

        appointedBy = new JLabel("Appointed By:");
        appointedBy.setFont(new Font("Arial", Font.BOLD, 13));
        appointedBy.setBounds(320,190,100,40);
        fullTimePanel.add(appointedBy);

        appointedBy1 = new JTextField();
        appointedBy1.setBounds(415,195,130,22);
        fullTimePanel.add(appointedBy1);

        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Arial", Font.BOLD, 13));
        qualification.setBounds(30,227,100,40);
        fullTimePanel.add(qualification);

        qualification1 = new JTextField();
        qualification1.setBounds(145,232,130,22);
        fullTimePanel.add(qualification1);

        joiningDate = new JLabel("Joining Date:");
        joiningDate.setFont(new Font("Arial", Font.BOLD, 13));
        joiningDate.setBounds(320,227,100,40);
        fullTimePanel.add(joiningDate);

        joiningDate1 = new JTextField();
        joiningDate1.setBounds(415,232,130,22);
        fullTimePanel.add(joiningDate1);

        vacancyNum = new JLabel("Vacancy Number:");
        vacancyNum.setFont(new Font("Arial", Font.BOLD, 13));
        vacancyNum.setBounds(30,264,120,40);
        fullTimePanel.add(vacancyNum);

        vacancyNum1 = new JTextField();
        vacancyNum1.setBounds(145,269,130,22);
        fullTimePanel.add(vacancyNum1);

        appoint = new JButton("Appoint");
        appoint.setBounds(445,269,100,35);
        appoint.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffAppoint();
                }
            });
        fullTimePanel.add(appoint);

        display = new JButton("Display");
        display.setBounds(30,310,100,35);
        display.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffDisplay();
                }
            });
        fullTimePanel.add(display);

        clear = new JButton("Clear");
        clear.setBounds(445,323,100,35);
        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeClear();
                }
            });
        fullTimePanel.add(clear);

        back = new JButton("Back");
        back.setBounds(245,310,100,35);
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    welcomePanel.setVisible(true);
                    fullTimePanel.setVisible(false);
                }
            });
        fullTimePanel.add(back);

        exit = new JButton("Exit");
        exit.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){
                    exIT();
                }  
            }); 
        exit.setBounds(245,360,100,35);
        fullTimePanel.add(exit);

        fullTimePanel.setVisible(true);
    }
    
    //making method which display about developer
    public void aboutDeveloper(){
        JOptionPane.showMessageDialog(f,"The developer of this course-work,"+"\n"+"Name: Bibek Pradhan"+"\n"+"University Id: 19031617 "+"\n" + "Section: L1C5","Message",1);
    }
    
    //making method which help to know about funcationality of button of welcomePanel
    public void aboutHelp(){
        JOptionPane.showMessageDialog(f,"There are three button in the panel."+"\n"+"Click, PartTimeStaff button to visit PartTimeStaffHire panel."+"\n"+"Click, FullTimeStaff button to visit FullTimeStaffHire Panel."+"\n"+"And click Exit button to close the programme.","Message",1);
    }
    
    //making method which add staff while clicking Add button of partTimePanel
    public void partTimeStaffAdd(){
        String vacNum = vacancyNumber1.getText();
        String desi = designation1.getText();
        String wagPer = wagesPer1.getText();
        String wrkHr = workingHour1.getText();
        String jobTy = jobType1.getText();
        String shif = shifts1.getText();

        if(vacNum.equals("") || desi.equals("") || wagPer.equals("") || wrkHr.equals("") || jobTy.equals("") || shif.equals("")){
            JOptionPane.showMessageDialog(f,"Please, fill all the required field.","Info",1);
        }else{
            try{
                int vac = Integer.parseInt(vacNum);
                int wagePer = Integer.parseInt(wagPer);
                int wrHrs = Integer.parseInt(wrkHr);
                //if vacancay number is repeated then show message dialog
                if(vacancyNumberRepeat(vac)){
                    JOptionPane.showMessageDialog(f,"Vacancy Number " + vac + " is already added.","Error",0);
                }else{
                    //if vacancy number is not repeated then add them in pt
                    PartTimeStaffHire pt = new PartTimeStaffHire(vac, desi, jobTy, wrHrs, wagePer, shif);
                    list.add(pt);
                    JOptionPane.showMessageDialog(f,"Vacancy Num " + vacNum + " is added sucessfully!","Message",1);

                    partTimeClear();
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f,"Please, enter valid data.","Error",0);
            }
        }
    }
    
    //making method which appoint staff while clicking Appoint button of partTimePanel
    public void partTimeStaffAppoint(){
        String staffNam = staffName1.getText();
        String qualify = qualification1.getText();
        String joinDate = joiningDate1.getText();
        String appointBy = appointedBy1.getText();
        String vacNum = vacancyNum1.getText();

        if(staffNam.equals("") || qualify.equals("") || joinDate.equals("") || appointBy.equals("") || vacNum.equals("")){
            JOptionPane.showMessageDialog(f,"Please, fill all the required field.","Info",1);
        }else{
            boolean found = false;
            try{
                int vac = Integer.parseInt(vacNum);

                for(StaffHire sh: list){
                    if(sh instanceof PartTimeStaffHire){
                        PartTimeStaffHire pt = (PartTimeStaffHire) sh;
                        //if vacancy number is found appoint it successfull
                        if(pt.getVacancyNumber() == vac){
                            found = true;
                            pt.hirePartTimeStaff(staffNam, joinDate, qualify, appointBy);
                            JOptionPane.showMessageDialog(f, "Part-time staff appointed successfully.","Info",1);
                            partTimeClear();
                            break;

                        }
                    }

               }
                //if vacancy number is not found show message dialog 
                if(!found){
                    JOptionPane.showMessageDialog(f, "Vacancy Number not found.","Error",0);
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f, "Please, enter valid Vacancy Number.","Error",0);
                found = false;
            } 
        }
    }
    
    //making method which terminate staff while clicking Terminate button of partTimePanel
    public void partTimeStaffTerminate(){
        boolean found = false;
        String vacNum = vacancyNum1.getText();
        try{
            int vac = Integer.parseInt(vacNum);

            for(StaffHire sh: list){
                if(sh instanceof PartTimeStaffHire){
                    PartTimeStaffHire pt = (PartTimeStaffHire) sh;
                    //if vacancy number is found then terminate it sucessfully
                    if(pt.getVacancyNumber() == vac){
                        found = true;
                        pt.terminateTheStaff();
                        list.remove(sh);
                        JOptionPane.showMessageDialog(f, "Part-time staff terminated successfully. ","Info",1);
                        partTimeClear();
                        break;  
                    }
                }
            }
            //if vacancy number is not found show meassge dialog
            if(!found){
                JOptionPane.showMessageDialog(f, "Vacancy Number not found. ","Error",0);
            }

        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(f, "Please,insert valid data. ","Error",0);
        }
    }
    
    //making method which display about Part Time Staff while clicking Display button of partTimePanel
    public void partTimeStaffDisplay(){
        boolean forDisplay = false;
        String vacNum = vacancyNum1.getText();
        try{
            int vac = Integer.parseInt(vacNum);
            for(StaffHire s : list){
                if(s instanceof PartTimeStaffHire){
                    PartTimeStaffHire pt = (PartTimeStaffHire) s;
                    //if vacancy number is found display the details
                    if(pt.getVacancyNumber()==vac){
                        pt.display();
                        JOptionPane.showMessageDialog(f, "Display successfully. ","Info",1);
                        vacancyNum1.setText("");
                        forDisplay = true;
                    }
                }
            }
            //if vacancy number is not found show message dialog
            if(!forDisplay){
                JOptionPane.showMessageDialog(f, "Vacancy Number not found !.","Error",0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(f, "Please input valid Vacancy Number. ","Error",0);
        }
    }
    
    //making method which check the repetation of vacancy number
    public boolean vacancyNumberRepeat(int vac){
        boolean added = true;
        if(list.size()>0){
            for(StaffHire sh:list){
                if(sh.getVacancyNumber() == vac){
                    added = true;
                    break;
                }else{
                    added=false;
                }
            }            

        }
        else{
            added = false;
        }
        return added;
    }
    
    //making method which add staff while clicking Add button of fullTimePanel
    public void fullTimeStaffAdd(){
        String vacNum = vacancyNumber1.getText();
        String desi = designation1.getText();
        String salr = salary1.getText();
        String wrkHr = workingHour1.getText();
        String jobTy = jobType1.getText();

        if(vacNum.equals("") || desi.equals("") || salr.equals("") || wrkHr.equals("") || jobTy.equals("")){
            JOptionPane.showMessageDialog(f,"Please, fill all the required field.","Info",1);
        }else{
            try{
                int vac = Integer.parseInt(vacNum);
                int saly = Integer.parseInt(salr);
                int wrHrs = Integer.parseInt(wrkHr);
                
                //if vacancy number is repeat show message dialog
                if(vacancyNumberRepeat(vac)){
                    JOptionPane.showMessageDialog(f,"Vacancy Number " + vac + " is already added.","Error",0);
                }else{
                    //if vacancy number is not repeat add them in ft
                    FullTimeStaffHire ft = new FullTimeStaffHire(vac, desi, jobTy, saly, wrHrs);
                    list.add(ft);
                    JOptionPane.showMessageDialog(f,"Vacancy Num " + vacNum + " is added sucessfully!","Message",1);

                    fullTimeClear();
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f,"Please, enter valid data.","Error",0);
            }
        }
    }
    
    //making method which appoint staff while clicking Appoint button of fullTimePanel
    public void fullTimeStaffAppoint(){
        String staffNam = staffName1.getText();
        String qualify = qualification1.getText();
        String joinDate = joiningDate1.getText();
        String appointBy = appointedBy1.getText();
        String vacNum = vacancyNum1.getText();

        if(staffNam.equals("") || qualify.equals("") || joinDate.equals("") || appointBy.equals("") || vacNum.equals("")){
            JOptionPane.showMessageDialog(f,"Please, fill all the required field.","Info",1);
        }else{
            boolean found = false;
            try{
                int vac = Integer.parseInt(vacNum);

                for(StaffHire sh: list){
                    if(sh instanceof FullTimeStaffHire){
                        FullTimeStaffHire ft = (FullTimeStaffHire) sh;
                        //if vacancy number is found appoint it
                        if(ft.getVacancyNumber() == vac){
                            found = true;
                            ft.hireFullTimeStaff( staffNam, joinDate, qualify, appointBy);
                            JOptionPane.showMessageDialog(f, "Full-time staff appointed successfully. ","Info",1);
                            fullTimeClear();
                            break;

                        }
                    }
                }
                //if vacancy number is not found show message dialog
                if(!found){
                    JOptionPane.showMessageDialog(f, "Vacancy Number not found.","Error",0);
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f, "Please, enter valid Vacancy Number.","Error",0);
                found = false;
            } 
        }
    }
    
    //making method which display Full Time Staff while clicking Display button of fullTimePanel
    public void fullTimeStaffDisplay(){
        boolean forDisplay = false;
        String vacNum = vacancyNum1.getText();
        try{
            int vac = Integer.parseInt(vacNum);
            for(StaffHire sh : list){
                if(sh instanceof FullTimeStaffHire){
                    FullTimeStaffHire ft = (FullTimeStaffHire) sh;
                    //if vacancy number is found display all the details
                    if(ft.getVacancyNumber()==vac){
                        ft.display();
                        JOptionPane.showMessageDialog(f, "Display successfully. ","Info",1);
                        vacancyNum1.setText("");
                        forDisplay = true;
                    }
                }
            }
            //if vacancy number is not found show message dialog
            if(!forDisplay){
                JOptionPane.showMessageDialog(f, "Vacancy Number not found !","Error",0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(f, "Please input valid Vacancy Number. ","Error",0);
        }
    }
    
    //making method which clear all the data of textField of partTimePanel
    public void partTimeClear(){
        shifts1.setText("");
        wagesPer1.setText("");
        workingHour1.setText("");
        vacancyNumber1.setText("");
        designation1.setText("");
        jobType1.setText("");
        staffName1.setText("");
        joiningDate1.setText("");
        appointedBy1.setText("");
        qualification1.setText("");
        vacancyNum1.setText("");
    }
    
    //making method which clear all the data of textField of fullTimePanel
    public void fullTimeClear(){
        vacancyNumber1.setText("");
        salary1.setText("");
        jobType1.setText("");
        designation1.setText("");
        workingHour1.setText("");
        staffName1.setText("");
        appointedBy1.setText("");
        qualification1.setText("");
        joiningDate1.setText("");
        vacancyNum1.setText("");
    }
    
    //method to exit the program
    public void exIT(){
        int confirm = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(f, "Are you sure want to exit ?","Warning",confirm);
        
        //if user click yes button close the program
        if(result==0){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new INGNepal().f.setVisible(true);
    }
}
