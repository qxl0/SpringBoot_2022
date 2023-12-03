package qiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor staff = context.getBean(Doctor.class);
        System.out.println(staff.getQualification());
        staff.assist();
    }
}
