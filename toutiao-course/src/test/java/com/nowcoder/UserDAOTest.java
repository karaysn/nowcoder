package com.nowcoder;

import com.nowcoder.dao.MessageDAO;
import com.nowcoder.dao.UserDAO;
import com.nowcoder.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToutiaoApplication.class)
public class UserDAOTest {

  @Autowired
  private UserDAO userDAO;

  @Autowired
  private MessageDAO messageDAO;

  @Test
  public void testAddUser() {
    User user = new User();
    user.setName("变形金刚");
    user.setPassword("adlflkdj");
    user.setSalt("salt");
    user.setHeadUrl("http://photo.weibo.com/3986147355/wbphotos/large/mid/4126039758468255/pid/ed97c81bgy1fh8m7tgh57j20k00ohmz5");
    userDAO.addUser(user);
  }

  @Test
  public void getDistinctStringTest() {
    List<String> list = messageDAO.getDistinctContent();
    for (String s:list) {
      System.out.println(s);
      System.out.println(s == null);
    }
  }

}
