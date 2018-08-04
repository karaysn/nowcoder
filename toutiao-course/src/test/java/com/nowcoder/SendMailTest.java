package com.nowcoder;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.util.Map;
import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

/**
 * @Author liumeng
 * 2017/7/5.
 */
public class SendMailTest {

  private static JavaMailSenderImpl mailSender;

  static {
    mailSender = new JavaMailSenderImpl();
    mailSender.setUsername("meng.liu@nowcoder.com");
    mailSender.setPassword("Rational2017");
    mailSender.setHost("smtp.exmail.qq.com");
    mailSender.setPort(465);
    mailSender.setProtocol("smtps");
    mailSender.setDefaultEncoding("utf8");
    Properties javaMailProperties = new Properties();
    javaMailProperties.put("mail.smtp.ssl.enable", true);
    mailSender.setJavaMailProperties(javaMailProperties);
  }


  public static boolean sendWithHTMLTemplate(String to, String subject,
                                      String template, Map<String, Object> model) {
    try {
      String nick = MimeUtility.encodeText("牛客中级课");
      InternetAddress from = new InternetAddress(nick + "<meng.liu@nowcoder.com>");
      MimeMessage mimeMessage = mailSender.createMimeMessage();
      MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
      String result  = " ====== test mail ====== ";
      mimeMessageHelper.setTo(to);
      mimeMessageHelper.setFrom(from);
      mimeMessageHelper.setSubject(subject);
      mimeMessageHelper.setText(result, false);
      mailSender.send(mimeMessage);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(sendWithHTMLTemplate("zhixian.yang@qq.com","主题邮件",null, null));
  }

}
