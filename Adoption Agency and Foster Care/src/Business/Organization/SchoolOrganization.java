/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolOrganizationRole;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class SchoolOrganization extends Organization {

    public SchoolOrganization() {
        super(Type.Schooling.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new SchoolOrganizationRole());
       return roles;
    }
    
}
