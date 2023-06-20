/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cashier;

/**
 *
 * @author medo4
 */
public class Customerinfo {
   private int cust_id;
   private String firstname;
   private String lastname;
   private String name;
    private String phone;
    private String address;
    private String membership;

public Customerinfo(int cust_id ,String name,String phone,String address,String membership)
{
    this.address=address;
    this.cust_id=cust_id;
    //this.firstname=firstname;
    //this.lastname=lastname;
    this.name = name;
    this.membership=membership;
    
    this.phone=phone;
}

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

   
}
