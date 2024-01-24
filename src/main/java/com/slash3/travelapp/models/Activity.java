package com.slash3.travelapp.models;

import javax.validation.constraints.Size;

public class Activity {

    private int id;
    private static int nextId = 1;
    private String name;
    private String location;
    private String description;
    private double cost;
    private int rating;

}
