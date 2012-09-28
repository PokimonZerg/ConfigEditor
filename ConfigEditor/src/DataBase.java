import java.sql.*;
import javax.swing.JOptionPane;


public class DataBase
{
    DataBase(String filename)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
        
            c = DriverManager.getConnection("jdbc:sqlite:" + filename);
            s = c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error while working with database: " + e);
        }
    }
    
    public ResultSet RunSQLCommand(String command)
    {
        try
        {
            return s.executeQuery(command);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error with SQL command: " + e);
            return null;
        }
    }
    
    public boolean RunPureSQLCommand(String command)
    {
        try
        {
            s.execute(command);
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error with SQL command: " + e);
            return false;
        }
    }
    
    public boolean close()
    {
        try
        {
            s.close();
            c.close();
            
            s = null;
            c = null;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error while closing database: " + e);
            return false;
        }
        
        return true;
    }
    
    @Override
    public void finalize()
    {
        if(c != null)
        {
            close();
        }
    }
    
    private Connection c;
    private Statement  s;
}