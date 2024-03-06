package org.example;


import java.util.*;

//class Code{
class Code implements Comparable<Code> { // added for treeMaps to define natural ordering for intances of Code
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }
    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    //add equals() and hash codes() to custom object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }
}

public class Main {
    public static void main(String[] args) {
        //Requires a comparator to operate
        Map<Code, String> map = new TreeMap<>();
//        Map<Code, String> map = new HashMap<>();
        map.put(new Code("s1", "l1"), "Chaand");
        map.put(new Code("s1", "l2"), "Bill");
        map.put(new Code("s1", "l3"), "You");
        map.put(new Code("s1", "l4"), "Reg");
        map.put(new Code("s2", "l1"), "Chaand");
        map.put(new Code("s2", "l2"), "Z");
        map.put(new Code("s2", "l3"), "Luka");
//        map.put("a0", "Ken");
//        System.out.println(map);
        //search in maps //for value with key
//        System.out.println(map.get(new Code("s2", "l2")));

        //search for key given value
        Code code = null; //initialize first
        for (Code key: map.keySet()){
            if (map.get(key).equals("Chaand")){
                code = key;
                break;
            }
        }
        System.out.println(code);



        //ways to iterate over map
//       for(String key:map.keySet()){
//           System.out.println("Key: "+key+" Value: "+map.get(key));
//       }
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//        }
//        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
//        while (entryIterator.hasNext()){
//            Map.Entry<String, String> temp = entryIterator.next();
//            System.out.println("Key: "+temp.getKey()+" Value: "+temp.getValue());
//
//        }

    }

//    public static void main(String[] args) {
//        String x1 = "Study";
//        x1 += "Easy";
//        String x2 = "StudyEasy";
//
////        System.out.println(x1.hashCode());
////        System.out.println(x2.hashCode());
////        System.out.println(x2== "StudyEasy");
//////        System.out.println(x1==x2); // doesn't compare hashcodes accurately
////        System.out.println(x1.equals(x2));
//
//        Code code1 = new Code("01", "01"); // custom objects
//        Code code2 = new Code("01", "01");
//        System.out.println(code1==code2); // compare custom objects doesn't override default hashcodes
//        System.out.println(code1.equals(code2));
//        System.out.println(code1.hashCode());
//        System.out.println(code2.hashCode());
//
//    }
}