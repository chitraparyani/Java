/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EducationalCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class EducationalCheckOrganization extends Organization {
    
    
    public EducationalCheckOrganization() {
        super(Organization.Type.EducationalCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EducationalCheckRole());
        return roles;
    }
    
    
}
