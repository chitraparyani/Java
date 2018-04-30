/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ChildMedicalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildrenMedicalCheckUpOrganization extends Organization {

    public ChildrenMedicalCheckUpOrganization() {
        super(Type.MedicalCheckUP.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChildMedicalRole());
        return roles;
    }
    
}
