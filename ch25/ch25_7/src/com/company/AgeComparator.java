package com.company;


import java.util.Comparator;

// creates the comparator for comparing name
class AgeComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        if (p1.getAge() == p2.getAge())
            return 0;
        else if (p1.getAge() > p2.getAge())
            return 1;
        else
            return -1;
    }
}