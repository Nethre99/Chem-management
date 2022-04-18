/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.List;
import model.Customer;

/**
 *
 * @author 94779
 */
public interface CustomerRepository {
    String addCostomer(Customer customer);
    
    String updateCustomer(Customer customer);
    
    Boolean removeCustomer(String id);
    
    List<Customer> getCustomer();
}
