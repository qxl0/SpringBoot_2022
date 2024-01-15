package qiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        staff.setQualification("MBBS");
        System.out.println(staff);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);
    }
}
