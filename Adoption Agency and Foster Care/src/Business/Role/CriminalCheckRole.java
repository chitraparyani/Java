/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Organization.CriminalCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.CriminalCheckRole.CriminalCheckWorkAreaJPanel;

/**
 *
 * @author kinnari
 */
public class CriminalCheckRole extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CriminalCheckWorkAreaJPanel(userProcessContainer, account, (CriminalCheckOrganization) organization, (HomeStudyEnterprise) enterprise, business);
    }
}
