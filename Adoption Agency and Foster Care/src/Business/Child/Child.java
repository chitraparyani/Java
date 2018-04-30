/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import Business.Government.GovernmentDirectory;
import Business.Hospital.HospitalDirectory;
import Business.SingleParent.SingleParentDirectory;

/**
 *
 * @author CHITRA PARYANI
 */
public class Child {

    private String childName;
    private int age;
    private double weight;
    private double height;
    private String registered;
    private SingleParentDirectory singleParentDirectory;
    private GovernmentDirectory governmentDirectory;
    private HospitalDirectory hospitalDirectory;

    public Child() {
        singleParentDirectory = new SingleParentDirectory();
        governmentDirectory = new GovernmentDirectory();
        hospitalDirectory = new HospitalDirectory();
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public SingleParentDirectory getSingleParentDirectory() {
        return singleParentDirectory;
    }

    public void setSingleParentDirectory(SingleParentDirectory singleParentDirectory) {
        this.singleParentDirectory = singleParentDirectory;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }
    
    

    @Override
    public String toString() {
        return this.childName;
    }

}
