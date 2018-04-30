/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinancialCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class FinancialCheckOrganization extends Organization {
    
        public FinancialCheckOrganization() {
        super(Organization.Type.FinancialCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinancialCheckRole());
        return roles;
    }
}
