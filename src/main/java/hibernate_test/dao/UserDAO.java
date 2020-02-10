package hibernate_test.dao;

import hibernate_test.models.UserEntity;

public interface UserDAO {
    public UserEntity findById(int id);
    public void save(UserEntity user);
    public void update(UserEntity user);
    public void delete(UserEntity user);
}
