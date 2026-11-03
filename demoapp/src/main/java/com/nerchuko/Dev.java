package com.nerchuko;

public class Dev
{
   
    private Computer com;

    public Dev()
    {
        System.out.println("Dev constructor");
    }
       public Computer getCom()
       {
        return com;
       } 
       public void setCom(Computer com)
       {
        this.com = com;
       }
        public void build()
    {
        //com.compile();
        System.out.println("building an awesome project");
    }
}
   

    

