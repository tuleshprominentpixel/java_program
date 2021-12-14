import java.util.Comparator;

public


class IdComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee s1, ProminentTrainee s2)
    {
        if (s1.getId() == s2.getId())
            return 0;
        else if (s1.getId() > s2.getId())
            return 1;
        else
            return -1;
    }
}
