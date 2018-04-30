/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TrainingManagementOfficeRole;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class TrainingManagementOrganization extends Organization{
    
     public TrainingManagementOrganization() {
        super(Organization.Type.TrainingManagementOffice.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrainingManagementOfficeRole());
        return roles;
    }
}
