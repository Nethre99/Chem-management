/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import model.Admin;

/**
 *
 * @author 94779
 */
public interface AdminRepository {
    String addNewAdmin(Admin admin);
    String removeAdmin(String id);
    String updateAdmin(Admin admin);
}
