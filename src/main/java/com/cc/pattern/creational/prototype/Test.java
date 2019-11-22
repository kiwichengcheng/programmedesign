package com.cc.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail.toString());
        for (int i = 0 ; i < 10 ; i++){
            Mail mailTemp = (Mail)mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@cc.com");
            mailTemp.setContent("Hello World");
            MailUtil.sendMail(mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
