package com.company;


import java.util.Comparator;

import static java.util.Collections.sort;

// creates the comparator for comparing name
class AgeComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2) {

        if (p1.getAge() == p2.getAge()) {
            if (p1.getName().compareTo(p2.getName()) > 1) {
                return 1;
            } else if (p1.getName().compareTo(p2.getName()) == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        else if (p1.getAge() > p2.getAge())
            return 1;
        else
            return -1;
    }
}