package com.nerchuko;

public class Dev
{
    private int age;
    private Laptop laptop;

    public Dev()
    {
        System.out.println("Dev constructor");
    }
        // public int getAge()
        // {
        //     return age;
        // }

        // public void setAge(int age)
        // {
        //     this.age = age;
        // }
    
    public Dev(Laptop laptop)
    {
        this.laptop = laptop;
        System.out.println("Devs cosntructor");
    }
        public Laptop getlaptop()
        {
            return laptop;
        }
        public void setlaptop(Laptop laptop)
        {
            this.laptop = laptop;
        }
    
    public Dev(int age)
    {
        this.age = age;
        System.out.println("Dev1 constructor");
    }
    public int getAge()
    {
        return  age ;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
        
        


}
    // public void build()
    // {
    //     System.out.println("building and awesome project");
    // }

    

