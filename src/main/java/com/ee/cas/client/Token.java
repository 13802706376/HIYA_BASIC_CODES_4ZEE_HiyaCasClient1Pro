package com.ee.cas.client;

import java.io.Serializable;
import java.util.Date;

public class Token implements Serializable
{
    private static final long serialVersionUID = 144333L;
    private String ticket;
    private String userName;
    private String passWord;
    private Date validityDate;
    
    public Token(String ticket,String userName, String passWord, Date validityDate)
    {
        this.ticket = ticket;
        this.userName = userName;
        this.passWord = passWord;
        this.validityDate = validityDate;
    }
    
    public String getTicket()
    {
        return ticket;
    }

    public void setTicket(String ticket)
    {
        this.ticket = ticket;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getPassWord()
    {
        return passWord;
    }
    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }
    public Date getValidityDate()
    {
        return validityDate;
    }
    public void setValidityDate(Date validityDate)
    {
        this.validityDate = validityDate;
    } 
    
    

}
