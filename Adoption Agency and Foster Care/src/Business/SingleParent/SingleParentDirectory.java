/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SingleParent;

import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class SingleParentDirectory {
    
    private ArrayList<SingleParent> singleParentList;
    
    public SingleParentDirectory() {
        singleParentList = new ArrayList<SingleParent>();
    }

    public ArrayList<SingleParent> getSingleParentList() {
        return singleParentList;
    }

    public void setSingleParentList(ArrayList<SingleParent> singleParentList) {
        this.singleParentList = singleParentList;
    }
    
    public SingleParent addSingleParent(){
        SingleParent sp = new SingleParent();
        singleParentList.add(sp);
        return sp;
    }
}
