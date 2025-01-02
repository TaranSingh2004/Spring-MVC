package springMVC.service;

import springMVC.Dao.UserDao;
import springMVC.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
