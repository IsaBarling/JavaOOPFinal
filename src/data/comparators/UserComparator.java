package data.comparators;


import data.user.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {



    @Override
    public int compare(User o1, User o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        
        if( name1 == name2)
        {   return 0;}
        else if (name1 == null) 
        {
            return -1;
        }
        if (name2 == null) 
        {
            return 1;
        }
        else  
        {
            return name1.compareTo(name2);
        }                  

    }




}

