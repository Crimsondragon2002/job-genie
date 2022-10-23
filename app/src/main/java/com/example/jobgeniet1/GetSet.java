package com.example.jobgeniet1;
//this entie section is just extra code to make sure that going back and fourth between trying to change data goes to the proper fragment
public class GetSet {
    
    private static boolean Seconding = false;
    //gets the boolean seconding, which checks to see if it goes through the second fragment
    public boolean getSeconding(){
        return Seconding;
    }
    //sets the boolean seconding, which checks to see if it goes through the second fragment
    void setSeconding(boolean Second){
        this.Seconding = Second;
    }
}
