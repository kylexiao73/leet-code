import java.util.*;

public class mergeIntervals {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	public List<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals.size()==0) return res;
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];
        for(int i=0; i<intervals.size();i++){
        	start[i] = intervals.get(i).start;
        	end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        for(int i=0; i<start.length;i++){
        	int st = start[i];
        	while(i!= start.length-1 && end[i]>=start[i+1]){
        		i++;
        	}
        	Interval it = new Interval(st,end[i]);
        	res.add(it);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
