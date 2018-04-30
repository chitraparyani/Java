/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SingleParent;

/**
 *
 * @author CHITRA PARYANI
 */
public class SingleParent {

    private String fatherName;
    private String motherName;
    private String fatherAge;
    private String motherAge;
    private String reason;
    private String emailId;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherAge() {
        return fatherAge;
    }

    public void setFatherAge(String fatherAge) {
        this.fatherAge = fatherAge;
    }

    public String getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(String motherAge) {
        this.motherAge = motherAge;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return this.motherName;
    }

}
