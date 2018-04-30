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
 * @author CHITRA PARYANI
 */
public class FosterCareEnterprise extends Enterprise {

    public FosterCareEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FosterCare);
    }

    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        ArrayList<Type> types = new ArrayList<>();
        
        types.add(Type.Schooling);
        types.add(Type.Housing);
        types.add(Type.MedicalCheckUP);
        
        return types;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
    
}
