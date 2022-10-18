package Question4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AssignmentApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(AssignmentApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AssignmentApplication.class);
        BinarySearchImpl binarysearchimpl = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
        System.out.println("Found at index - "+binarysearchimpl.binarySearch(new int[]{10, 4, 5, 6, 89, 7}, 89));
        annotationConfigApplicationContext.close();
    }

}
