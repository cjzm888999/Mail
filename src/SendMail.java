
public class SendMail {

	public static void main(String[] args) {
			Mail mail = new Mail();
			mail.setHost("smtp.163.com"); // �����ʼ�������,�������163��,�Լ����ҿ���ص�
			//mail.setHost("smtp.bdcom.com.cn");
			mail.setSender("13315126020@163.com");
			//mail.setSender("jinjianlin@bdcom.com.cn");
			mail.setReceiver("jinjianlin@bdcom.com.cn"); // ������
			mail.setUsername("13315126020@163.com"); // ��¼�˺�,һ�㶼�Ǻ�������һ����
			mail.setPassword("CJZM888999"); // ����������ĵ�¼����(163����Ȩ��)
			//mail.setUsername("jinjianlin@bdcom.com.cn");
			//mail.setPassword("888999a");
			
			
			mail.setSubject("aaaaaaaaa");
			mail.setMessage("bbbbbbbbbbbbbbbbb");
			new MailUtil().send(mail);
		}
}
