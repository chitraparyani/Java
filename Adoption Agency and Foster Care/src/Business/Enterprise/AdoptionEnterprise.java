/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class AdoptionEnterprise extends Enterprise{
    
    
    public AdoptionEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Adoption);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
     @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type>types = new ArrayList<>();
         types.add(Type.Adoption);
         types.add(Type.RegisterParent);
         types.add(Type.RegisterChild);
         types.add(Type.ManagementOffice);
         types.add(Type.ManageChildren);
         return types;
       }
    
}
