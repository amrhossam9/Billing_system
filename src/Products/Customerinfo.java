/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

/**
 *
 * @author medo4
 */
public class Customerinfo {
   private int cust_id;
   private String firstname;
   private String lastname;
    private String phone;
    private String address;
    private String membership;
    private String membershipdays;
public Customerinfo(int cust_id ,String firstname,String lastname,String phone,String address,String membership,String membershipdays)
{
    this.address=address;
    this.cust_id=cust_id;
    this.firstname=firstname;
    this.lastname=lastname;
    this.membership=membership;
    this.membershipdays=membershipdays;
    this.phone=phone;
}

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getMembershipdays() {
        return membershipdays;
    }

    public void setMembershipdays(String membershipdays) {
        this.membershipdays = membershipdays;
    }

}
