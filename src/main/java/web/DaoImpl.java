package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class DaoImpl implements DaoInterface {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    @Autowired
    public void setDatasource(DataSource source) {
        dataSource=source;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public void getData() {

        List<Roll> rollList=jdbcTemplate.query("select * from shikado",new DataMapper());
        for (Roll roll:rollList
             ) {
            System.out.println(roll.getName());
        }
    }
}
