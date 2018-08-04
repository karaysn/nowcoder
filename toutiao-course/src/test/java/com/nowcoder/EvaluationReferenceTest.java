package com.nowcoder;

import com.nowcoder.dao.TestDAO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author liumeng
 * 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@SpringBootTest(classes = ToutiaoApplication.class)
@WebAppConfiguration
public class EvaluationReferenceTest {

  @Autowired
  private TestDAO testDAO;

  @Test
  public void testone() {
    testDAO.updateLikeCount(20,"test");
  }

}
