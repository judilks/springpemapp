import com.yash.springpemapp.configuration.SpringRootConfig;
import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOFindByIdOperation {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        //user detail will be taken from user registration form
        User user = userDAO.findById(119);
        System.out.println("-----User Details!-----");
        System.out.println("Name: " + user.getName());
        System.out.println("Phone: " + user.getPhone());
    }
}
