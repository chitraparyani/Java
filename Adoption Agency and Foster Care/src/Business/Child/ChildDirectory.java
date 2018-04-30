/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import Business.Government.GovernmentDirectory;
import Business.Hospital.HospitalDirectory;
import Business.SingleParent.SingleParentDirectory;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildDirectory {

    private ArrayList<Child> childList;

    public ChildDirectory() {
        childList = new ArrayList<Child>();

    }

    public ArrayList<Child> getChildList() {
        return childList;
    }

    public void setChildList(ArrayList<Child> childList) {
        this.childList = childList;
    }

    //Add children
    public Child addChild() {
        Child child = new Child();
        childList.add(child);
        return child;
    }

}
