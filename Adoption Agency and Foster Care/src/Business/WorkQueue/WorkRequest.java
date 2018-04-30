/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Child.Child;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;

import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private  String status;
    private Date requestDate;
    private Date resolveDate;
    //private int noOfVaccines;
    private ProspectiveParent parent;
    private Child child;
    private boolean processedFlag =false;
   
    
   

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isProcessedFlag() {
        return processedFlag;
    }

    public void setProcessedFlag(boolean processedFlag) {
        this.processedFlag = processedFlag;
    }  

    

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public ProspectiveParent getParent() {
        return parent;
    }

    public void setParent(ProspectiveParent parent) {
        this.parent = parent;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
    
    
    @Override
    public String toString() {
        if(this.getParent()!= null){
        return this.getParent().getParent1();
        }
        else{
            return this.getChild().getChildName();//To change body of generated methods, choose Tools | Templates.
    }
    
    }   
}
