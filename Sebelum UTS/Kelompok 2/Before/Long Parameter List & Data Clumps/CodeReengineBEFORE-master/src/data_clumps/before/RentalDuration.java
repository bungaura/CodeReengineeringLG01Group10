package data_clumps.before;

import java.util.*;

public class RentalDuration {
    private Date start;
	private Date end;

    public RentalDuration(Date start, Date end){
        if(start.after(end)){
            throw new IllegalArgumentException("Start date must be before end date");
        }
        this.start = start;
        this.end = end;
    }

    public Date getStart(){
        return start;
    }

    public void setStart(Date start){
        this.start = start;
    }

    public Date getEnd(){
        return end;
    }

    public void setEnd(Date end){
        this.end = end;
    }
}
