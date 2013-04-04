import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;



  class DescendingScoreComparator implements Comparator<ObjectHolder> {
    @Override
    public int compare(ObjectHolder o1, ObjectHolder o2) {
      return o2.getScore().compareTo(o1.getScore());
    }
  }


  class ObjectHolder {
	    Object obj;
	    Integer score;

	    public ObjectHolder(Object o, Integer score) {
	      this.obj = o;
	      this.score = score;
	    }

	    public Object getObject() {
	      return obj;
	    }
	    public Integer getScore() {
	      return score;
	    }
	  


  public void showExample() {

    List<ObjectHolder> list = new LinkedList<ObjectHolder>();
    list.add(new ObjectHolder("addedFirst", 55));
    list.add(new ObjectHolder("addedSecond", 25));
    list.add(new ObjectHolder("addedThird", 75));
    list.add(new ObjectHolder("addedFourth", 25));
    list.add(new ObjectHolder("addedFifth", 95));

    Collections.sort(list, new DescendingScoreComparator());

    System.out.println("\nWill print 5 items, but this time in descending order");
    for (ObjectHolder holder : list) {
      System.out.println(holder.getScore());
    }
  }
  }