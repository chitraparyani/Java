/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FosterCareEnterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Organization.ChildrenMedicalCheckUpOrganization;
import Business.Organization.CriminalCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.CriminalCheckRole.CriminalCheckWorkAreaJPanel;
import userInterface.MedicalCheckChild.MedicalCheckWorkAreaJPanelChild;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildMedicalRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalCheckWorkAreaJPanelChild(userProcessContainer, account, (ChildrenMedicalCheckUpOrganization) organization, (FosterCareEnterprise) enterprise, business);
    }
    
}
