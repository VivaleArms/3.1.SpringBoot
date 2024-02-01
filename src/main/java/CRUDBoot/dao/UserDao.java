package CRUDBoot.dao;


import CRUDBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(int id);
    void removeUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
}