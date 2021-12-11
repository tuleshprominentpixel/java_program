package com.company;

import java.util.Comparator;

// creates the comparator for comparing name
class DateComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        return p1.getDob().compareTo(p2.getDob());
    }
}