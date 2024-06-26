/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bell;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author HPro1
 */
public class Customer {

    private String firstName = "";
    private String lastName = "";
    private String street = "";
    private String city = "";
    private String state = "";
    private String zipCode = "";
    private String email = "";
    private String phone = "";
    private String username;
    private String password;
     private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*custom methods
     *
     */
    public boolean openAccount(String type, BigDecimal amount) {
        accounts.add(new Account(type));
        return accounts.get(accounts.size() - 1).deposit(amount, "Opening Deposit");
    }

    public void closeAccount(Account account) {
        account.setIsOpen(false);
    }

    public boolean deposit(Account account, BigDecimal amount, String type) {
        return account.deposit(amount, type);
    }

    public boolean withdraw(Account account, BigDecimal amount, String type) {
        return account.withdraw(amount, type);
    }

    public boolean transfer(Account source, Account destination, BigDecimal amount, String type) {
        if (source.withdraw(amount, "Transfer to " + destination.getACCOUNT_NUMBER()))  {
            return destination.deposit(amount, "Transfer from " + source.getACCOUNT_NUMBER());

        }
        return false;
    } 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

 
    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", email=" + email + ", phone=" + phone + ", username=" + username + ", password=" + password + ", accounts=" + accounts + '}';
    }

}
