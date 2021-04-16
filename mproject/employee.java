/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mproject;

/**
 *
 * @author Fawad computer
 */
public class employee {
    private String cellno;
// getter and setter for cell no
    public String getCellno() {
        return cellno;
    }
    public boolean setCellno(String cellno) {   //validattor
        boolean flag=true;
        int size=cellno.length();
        for(int i=0; i<size;i++)
        {
        if ((cellno.charAt(i)>='0')||(cellno.charAt(i)<='9'))
        {
             flag=true;
        }
        else
        {
            flag=false;
        }
        }
        if(flag==true){
        this.cellno = cellno;
        
    }
        return flag;
    }
    
private String name;
// getter and setter for name
  public String getName() {
        return name;
    }
    public boolean setName(String name) {      //validator
        boolean flag=true;
        int size=name.length();
        for(int i=0;i<size;i++){
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'||name.charAt(i)>='a'&&name.charAt(i)<='z')
                    {
                        flag=true;
                    }
                    else
                    {
                            flag=false;
                            }
        }
        if(flag==true){
        this.name = name;
        }
        return flag;
    }
// getter and setter for email
   
    private String email;
      public String getEmail() {
          
        return email;
    }
       public boolean setEmail(String email) {
         int size = email.length();      //validator
        boolean flag = false;
        int i = 0;
        while(email.charAt(i) != '@' && i<size)
        {
            if((email.charAt(i)>= 'A' && email.charAt(i)<= 'Z')||(email.charAt(i)>= 'a' && email.charAt(i)<= 'z') || (email.charAt(i)>= '0' && email.charAt(i)<= '9'))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        i++;
      
        while(i<size)
        {
            if((email.charAt(i)>= 'A' && email.charAt(i)<= 'Z')||(email.charAt(i)>= 'a' && email.charAt(i)<= 'z')||(email.charAt(i)=='.') )
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        if(flag==true)
    {
      this.email=email;
    }
       return flag; 
           
           
       }
  
  
    
    
}
