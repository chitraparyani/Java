
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.ProspectiveParent.ProspectiveParentDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;

import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   // private ProspectiveParentDirectory prospectiveParentDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        
        AdoptionAdmin("Adoption Admin Organization"), TrainingAdmin("Training Admin Organization"), 
        HomestudyAdmin("Homestudy Admin Organization"), RegisterChild("RegisterChild"), 
        RegisterParent("RegisterParent"),ManagementOffice("ManagementOffice"),
        ManageChildren("ManageChildren"),
        Adoption("Adoption"),FinancialCheck("FinancialCheck"),
        MedicalCheck("MedicalCheck"), CriminalCheck("CriminalCheck"),
        EducationalCheck("EducationalCheck"), TrainingManagementOffice("TrainingManagementOffice"),
        Schooling("Schooling"), Housing("Housing"), MedicalCheckUP("MedicalCheckUP");
        
        private String value;
     
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        //prospectiveParentDirectory = new ProspectiveParentDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        public WorkQueue getWorkQueue() {
        return workQueue;
    }
        
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

   /* public ProspectiveParentDirectory getProspectiveParentDirectory() {
        return prospectiveParentDirectory;
    }

    public void setProspectiveParentDirectory(ProspectiveParentDirectory prospectiveParentDirectory) {
        this.prospectiveParentDirectory = prospectiveParentDirectory;
    }*/

    @Override
    public String toString() {
        return name;
    }
        
}
