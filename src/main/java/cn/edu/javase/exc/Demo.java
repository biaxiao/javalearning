package cn.edu.javase.exc;

import java.io.IOException;
import java.sql.SQLException;

public class Demo {
}
class Father
{
    public void start() throws Exception
    {
        throw new IOException();
    }
}

class Son extends Father
{
    public void start() throws SQLException,IOException
    {
        throw new SQLException();
    }
}