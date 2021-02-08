/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icardgeneratorsystem;

/**
 *
 * @author HP
 */
class User {
    private String rollNo;
    private String firstName,midName,lastName,sem,year,address,dob;
    public User(String rollNo,String firstName,String midName,String lastName,
            String sem,String year,String address,String dob)
    {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.sem = sem;
        this.year = year;
        this.address = address;
        this.dob = dob;
    }
    public String getrollno(){
        return rollNo;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getmidName(){
        return midName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getsem(){
        return sem;
    }
    public String getyear(){
        return year;
    }
    public String getaddress(){
        return address;
    }
    public String getdob(){
        return dob;
    }
}
