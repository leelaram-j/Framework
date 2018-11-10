package Framework.TestNGFiles2;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class data_driven_propertiesClass
{
    @Test
    public void login() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("//Users//lee//eclipse-workspace//Framework//src//TestNGFiles2//inputData.properties");
        prop.load(fis);
        System.out.println("Username is "+prop.getProperty("username"));
        System.out.println("password is "+prop.getProperty("password"));
        System.out.println("URL is "+prop.getProperty("url"));
    }
}
