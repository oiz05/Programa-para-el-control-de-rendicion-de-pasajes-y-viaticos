
package util;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private static Connection conn;
    
    public static Connection DataSource(){
        SQLServerDataSource ds = new SQLServerDataSource();
        
        try{
            ds.setServerName("95.217.180.168");
            ds.setDatabaseName("ControlPV");
            ds.setPortNumber(1433);
            ds.setUser("sa");
            ds.setPassword("01K#cjWq3c");
            ds.setEncrypt(false);            
            conn = ds.getConnection();
        }
        catch(SQLException ex){
           ex.printStackTrace();
        }
        
        return conn;        
    }

    
}
