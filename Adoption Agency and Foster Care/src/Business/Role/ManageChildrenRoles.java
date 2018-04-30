/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.ChildrenManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.RegisterChildOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ChildrentManagementOffice.ChildrenManagementWorkAreaJPanel;
import userInterface.RegisterChildRole.ChildWorkAreaJPanel;
import userInterface.RegisterParentRole.RegisterParentWorkAreaJPanel;

/**
 *
 * @author CHITRA PARYANI
 */
public class ManageChildrenRoles extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ChildrenManagementWorkAreaJPanel(userProcessContainer, account, (ChildrenManagementOrganization) organization, (AdoptionEnterprise) enterprise, business);
    }
    
    
}
