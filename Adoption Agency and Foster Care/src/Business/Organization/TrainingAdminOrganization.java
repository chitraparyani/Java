/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdoptionAdminRole;
import Business.Role.Role;
import Business.Role.TrainingAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class TrainingAdminOrganization extends Organization {
    
      public TrainingAdminOrganization() {
        super(Type.TrainingAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrainingAdminRole());
        return roles;
    }
}
