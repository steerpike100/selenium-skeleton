package tech.verenti.pages;

import tech.verenti.utils.HomePageActionController;

public class HomePage {

    private HomePageActionController act;

    private HomePage(HomePageActionController act){
        this.act = act;
    }


    public HomePageActionController act(){
        return act;
    }

    public static HomePage getHomePage(){
        return new HomePage(new HomePageActionController());
    }




}