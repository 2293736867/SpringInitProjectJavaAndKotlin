package pers.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.dao.UserDao;
import pers.pojo.User;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisService {
    private final UserDao dao;

    public void test(){
        User user = dao.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
