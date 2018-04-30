/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManagementOfficeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class ManagementOrganization extends Organization {

    public ManagementOrganization() {
        super(Type.ManagementOffice.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManagementOfficeRole());
        return roles;
    }
    
}
