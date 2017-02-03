
public class SendMail {

	public static void main(String[] args) {
			Mail mail = new Mail();
			mail.setHost("smtp.163.com"); // 设置邮件服务器,如果不用163的,自己找找看相关的
			//mail.setHost("smtp.bdcom.com.cn");
			mail.setSender("13315126020@163.com");
			//mail.setSender("jinjianlin@bdcom.com.cn");
			mail.setReceiver("jinjianlin@bdcom.com.cn"); // 接收人
			mail.setUsername("13315126020@163.com"); // 登录账号,一般都是和邮箱名一样吧
			mail.setPassword("CJZM888999"); // 发件人邮箱的登录密码(163是授权码)
			//mail.setUsername("jinjianlin@bdcom.com.cn");
			//mail.setPassword("888999a");
			
			
			mail.setSubject("aaaaaaaaa");
			mail.setMessage("bbbbbbbbbbbbbbbbb");
			new MailUtil().send(mail);
		}
}
