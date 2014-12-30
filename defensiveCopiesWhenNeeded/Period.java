import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Created by a587078 on 2014-12-30.
 */
public class Period {

    private final Date start;
    private final Date end;


    // Repaired constructor - makes defensive copies of parameters
    public Period(Date start, Date end) {

        // -----------> this new Date are most important!!!!   <---------
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());


        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
    }

    // Repaired accessors - make defensive copies of internal fields
    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    public static void main(String[] args) {

        // Attack the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);

        end.setYear(78);  // Modifies internals of p!
        System.out.println(p.getEnd().getYear());
        p.getEnd().setYear(78);  // Modifies internals of p!
        System.out.println(p.getEnd().getYear());
    }

}
