package comparator;

<<<<<<< HEAD
import member.Member;

=======
        >>>>>>> MarkDevelopmentArea
import java.util.Comparator;

public class RygcrawlComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2){
        return m1.getSwimmingTime().compareTo(m2.getSwimmingTime);
    }
}
