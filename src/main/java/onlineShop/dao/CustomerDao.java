package onlineShop.dao;

import onlineShop.model.Customer;
//YZP: this interface is a database
public interface CustomerDao {
    
    void addCustomer(Customer customer);

    Customer getCustomerByUserName(String userName);
}
