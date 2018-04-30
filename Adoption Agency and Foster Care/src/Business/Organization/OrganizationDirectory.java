/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.HomeStudyEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.RegisterParent.getValue())){
            organization = new RegisterParentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RegisterChild.getValue())){
            organization = new RegisterChildOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManagementOffice.getValue())){
            organization = new ManagementOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.CriminalCheck.getValue())){
            organization = new CriminalCheckOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.EducationalCheck.getValue())){
            organization = new EducationalCheckOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.FinancialCheck.getValue())){
            organization = new FinancialCheckOrganization();
            organizationList.add(organization);
        }     
        else if(type.getValue().equals(Type.MedicalCheck.getValue())){
            organization = new MedicalCheckOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.ManageChildren.getValue())){
            organization = new ChildrenManagementOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Schooling.getValue())){
            organization = new SchoolOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Housing.getValue())){
            organization = new HousingOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.MedicalCheckUP.getValue())){
            organization = new ChildrenMedicalCheckUpOrganization();
            organizationList.add(organization);
        }             
            
        return organization;
    }
    
    public boolean duplicateOrg(String name){
        
        boolean flag = false;
        for(Organization org : organizationList){
            
            if(name.equals(org.getName())){
               flag = true;  
            }
        }
        return flag;
    }
}