/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegisterParentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.RegisterParentRole.RegisterParentWorkAreaJPanel;

/**
 *
 * @author sneha
 */
public class RegisterParentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RegisterParentWorkAreaJPanel(userProcessContainer, account, (RegisterParentOrganization) organization, (AdoptionEnterprise) enterprise, business);
    }
    
}
