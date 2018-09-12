import com.yash.springpemapp.configuration.SpringRootConfig;
import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOSaveOperation {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        //user detail will be taken from user registration form
        User user = new User();
        user.setName("Nick");
        user.setPhone("7082072733");
        user.setEmail("email@email.com");
        user.setLoginName("nstone");
        user.setPassword("password");

        userDAO.save(user);
        System.out.println("-----User Saved!-----");
    }
}
