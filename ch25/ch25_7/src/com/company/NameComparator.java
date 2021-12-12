package com.company;

import java.util.Comparator;

// creates the comparator for comparing name
class NameComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}