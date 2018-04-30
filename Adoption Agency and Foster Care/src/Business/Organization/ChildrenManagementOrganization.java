/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManageChildrenRoles;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildrenManagementOrganization extends Organization {

    public ChildrenManagementOrganization() {
        super(Type.ManageChildren.getValue());
                }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new ManageChildrenRoles());
       return roles;
    }
 
    
}
