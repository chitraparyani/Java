/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FosterCareEnterprise;
import Business.Enterprise.TrainingEnterprise;
import Business.Organization.Organization;
import Business.Organization.SchoolOrganization;
import Business.Organization.TrainingManagementOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.SchoolForChildren.SchoolManagementWorkAreaJPanel;
import userInterface.TrainingManagementOfficeRole.TrainingManagementWorkAreaJPanel;

/**
 *
 * @author CHITRA PARYANI
 */
public class SchoolOrganizationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SchoolManagementWorkAreaJPanel(userProcessContainer, account, (SchoolOrganization) organization, (FosterCareEnterprise) enterprise, business);
    }
    
}
