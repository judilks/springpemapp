import com.yash.springpemapp.configuration.SpringRootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TestDataSource {

    public static void main(String[] args){
        ApplicationContext actx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = actx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql = "INSERT INTO users(name, phone, email, loginName, password) VALUES (?,?,?,?,?)";
        Object[] param = new Object[]{ "Nick Stone", "7082072733", "nick.stone@yash.com", "nstone", "password"};
        jt.update(sql, param);
        System.out.println("-----SQL Updated-----");
    }
}
