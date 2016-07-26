/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

import java.sql.Date;

/**
 *
 * @author Krishna
 */
public class Registration {
    private String regNumber;
    private String name;
    private int batch;
    private String contact;
    private String regMode;
    private String receipt;
    private Date date;
    private int paricipant;
    private int amount;

    public Registration(String regNumber, String name, int batch, String contact, String regMode, String receipt, Date date, int paricipant, int amount) {
        this.regNumber = regNumber;
        this.name = name;
        this.batch = batch;
        this.contact = contact;
        this.regMode = regMode;
        this.receipt = receipt;
        this.date = date;
        this.paricipant = paricipant;
        this.amount = amount;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRegMode() {
        return regMode;
    }

    public void setRegMode(String regMode) {
        this.regMode = regMode;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getParicipant() {
        return paricipant;
    }

    public void setParicipant(int paricipant) {
        this.paricipant = paricipant;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
