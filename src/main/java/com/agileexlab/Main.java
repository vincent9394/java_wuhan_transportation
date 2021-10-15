package com.agileexlab;

import com.agileexlab.transport.*;

public class Main {
    public static void main(String[] arg) {
        TransportWuhanToBeijing[] t={new Bus(), new Car(), new Plane(), new Train()};


        for (int i = 0; i<4; i++){
            if (t[i].getPrice() <= 500){
                System.out.println("Xiaoming can choose to get there by "+ t[i].getName());
            }
        }


    }
}
/*
From Wuhan to Beijing you can choose from 4 means of transportation,
including driving a car, taking bus, train, or plane.
Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan. With the budget of 500 yuan,
which vehicles Xiaoming can choose to get there?
 */