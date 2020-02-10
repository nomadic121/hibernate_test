package hibernate_test.services;

import hibernate_test.dao.UserDAO;
import hibernate_test.dao.UserDAOImpl;
import hibernate_test.models.UserEntity;

public class UserService {
    private UserDAO userDao = new UserDAOImpl();

    public UserEntity findUser(final int id) {
        return userDao.findById(id);
    }

    public void saveUser(final UserEntity user) {
        userDao.save(user);
    }

    public void updateUser(final UserEntity user) {
        userDao.update(user);
    }

    public void deleteUser(final UserEntity user) {
        userDao.delete(user);
    }
}
