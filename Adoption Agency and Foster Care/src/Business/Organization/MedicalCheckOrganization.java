/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class MedicalCheckOrganization extends Organization {
    
    
    public MedicalCheckOrganization() {
        super(Organization.Type.MedicalCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalCheckRole());
        return roles;
    }
    
}
