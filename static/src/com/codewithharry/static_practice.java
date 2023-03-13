package com.codewithharry;
class hondaCity{
    static long price=10;
    int a,b;

    static double onRoadPrice(String city){
        switch (city){
            case "delhi":
                return price+price*0.1;
            case "mumbai":
                return price+price*0.09;
        }

        return 0;
    }
}

public class static_practice {
    public static void  main(String args[]){
        hondaCity h1=new hondaCity();
        hondaCity h2=new hondaCity();



    }
}
