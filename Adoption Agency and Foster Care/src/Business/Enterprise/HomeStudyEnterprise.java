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
public class HomeStudyEnterprise extends Enterprise{
    
    public HomeStudyEnterprise(String name) {
        super(name, EnterpriseType.HomeStudy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type>types = new ArrayList<>();
         
         types.add(Type.CriminalCheck);
         types.add(Type.EducationalCheck);
         types.add(Type.MedicalCheck);
         types.add(Type.FinancialCheck);
         return types;
       }
    
}
