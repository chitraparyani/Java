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
import Business.Organization.FinancialCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.FinancialCheckRole.FinancialCheckWorkAreaJPanel;

/**
 *
 * @author kinnari
 */
public class FinancialCheckRole extends Role{
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinancialCheckWorkAreaJPanel(userProcessContainer, account, (FinancialCheckOrganization) organization, (HomeStudyEnterprise) enterprise, business);
    }
    
    
}
