/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ProspectiveParent.ProspectiveParentDirectory;
import Business.Role.RegisterParentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class RegisterParentOrganization extends Organization {
    
     private ProspectiveParentDirectory prospectiveParentDirectory;
    public RegisterParentOrganization() {
       super(Type.RegisterParent.getValue());
       prospectiveParentDirectory = new ProspectiveParentDirectory();
    }

    public ProspectiveParentDirectory getProspectiveParentDirectory() {
        return prospectiveParentDirectory;
    }

    public void setProspectiveParentDirectory(ProspectiveParentDirectory prospectiveParentDirectory) {
        this.prospectiveParentDirectory = prospectiveParentDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RegisterParentRole());
        return roles;
    }
    
}
