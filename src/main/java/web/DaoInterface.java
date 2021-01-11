package web;

import javax.sql.DataSource;

public interface DaoInterface {
    public void setDatasource(DataSource source);
    public void getData();
}
