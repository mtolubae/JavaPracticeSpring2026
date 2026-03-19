import com.sun.source.util.Trees;

import java.util.*;

public class JavaCollections2 {
    public static void main(String[] args) {
        HashMap<Long, Student> map = new HashMap<>();
        Student s1 = new Student("Altinai Ismailova",4.0);
        Student s2 = new Student("Iskender Baitemirov", 3.5);
        Student s3 = new Student("Elenora Mamatjanova", 4.0);
        map.put(12345L,s1);
        map.put(12346L, s2);
        map.put(12347L, s3);

//        for(Map.Entry<Long,Student> e: map.entrySet()){
//            System.out.println(e.getValue());
//        }

//        if(map.containsKey(12346L)) {
//
//            map.get(12346L).setGpa(3.9);
//        }
//        Student s = map.get(12346L);
//        System.out.println(s.getName() + " " + s.getGpa());



        TreeSet<Student> ts = new TreeSet<>(new GPAComparator());
        ts.add(s1);ts.add(s2);ts.add(s3);

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("Altinay");ts2.add("Iskender");ts2.add("Elenora");

        for(String s:ts2) System.out.println(s);

        System.out.println("TS size = "+ts.size());
        Iterator<Student> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class GPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(),o1.getGpa());
    }
}
