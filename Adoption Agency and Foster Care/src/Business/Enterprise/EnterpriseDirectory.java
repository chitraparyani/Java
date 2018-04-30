/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Adoption){
            enterprise = new AdoptionEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.HomeStudy){
            enterprise = new HomeStudyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Training){
            enterprise = new TrainingEnterprise(name);
            enterpriseList.add(enterprise);
        }       
         if (type == Enterprise.EnterpriseType.FosterCare) {
            enterprise = new FosterCareEnterprise(name);
            enterpriseList.add(enterprise);
        }                
        return enterprise;
    }
    
    public boolean duplicateEnterprise(String name){
        
        boolean flag = false;
        for(Enterprise e : enterpriseList){
            
            if(name.equals(e.getEnterpriseType().getValue())){
               flag = true;  
            }
        }
        return flag;
    }
    
}
