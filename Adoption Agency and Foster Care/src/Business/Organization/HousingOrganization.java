/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HousingOrganizationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class HousingOrganization extends Organization {

    public HousingOrganization() {
        super(Type.Housing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new HousingOrganizationRole());
       return roles;
    }
    
}
