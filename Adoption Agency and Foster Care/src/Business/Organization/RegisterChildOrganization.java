/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Child.ChildDirectory;
import Business.Role.RegisterChildRole;
import Business.Role.Role;
import Business.SingleParent.SingleParentDirectory;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class RegisterChildOrganization extends Organization {
    
    private ChildDirectory childDirectory;
    
    public RegisterChildOrganization() {
       super(Type.RegisterChild.getValue());
       childDirectory = new ChildDirectory();
    }

    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }

  
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RegisterChildRole());
        return roles;
    }
    
}
