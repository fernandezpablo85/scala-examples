package org.actors.real;

import java.io.*;

public class Log implements ILog
{
  private final File f;
  
  public Log()
  {
    try
    {
      f = new File("./example.log"); 
    }
    catch(Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  public void info(String message)
  {
    append("[info] "+message+"\n");
  }
  
  public void error(String message)
  {
    append("[ERROR] "+message+"\n");
  }
  
  private void append(String message)
  {
    FileWriter fw = null;
    try
    {
      fw = new FileWriter(f,true);
      fw.append(message);
    }
    catch(Exception e)
    {
      throw new RuntimeException(e);
    }
    finally
    {
      try
      {
        fw.close();
      }
      catch(Exception e)
      {
        throw new RuntimeException(e);
      }
      
    }
  }

  public String getFileName()
  {
    return f.getAbsolutePath();
  }
}
