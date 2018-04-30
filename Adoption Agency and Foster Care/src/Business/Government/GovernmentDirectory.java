/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class GovernmentDirectory {
    
    private ArrayList<Government> governmentList;
    
    public GovernmentDirectory() {
        governmentList = new ArrayList<Government>();
    }

    public ArrayList<Government> getGovernmentList() {
        return governmentList;
    }

    public void setGovernmentList(ArrayList<Government> governmentList) {
        this.governmentList = governmentList;
    }
    
    public Government addGovernement() {
        Government g = new Government();
        governmentList.add(g);
        return g;
    }
    
}
