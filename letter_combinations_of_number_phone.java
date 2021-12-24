import java.util.*;

//	LeetCode/letter-combinations-of-a-phone-number
//	https://leetcode.com/problems/letter-combinations-of-a-phone-number
// Starategie:
    /*
           xyz
           
           1: a,b,c
           2: d,e,f

           2112: a
	Simply iterete this prototype list : [[a,b], [] ,[], [] ]
     */

public class letter_combinations_of_number_phone {

    public static void main(String[] args) {
        String digits = "";
        Map<String, List<String>> telephone = new HashMap<>();
        List<String> results = new ArrayList<>();
        List<List<String>> allList = new ArrayList<>();
        telephone.put("2", Arrays.asList("a", "b", "c"));
        telephone.put("3", Arrays.asList("d", "e", "f"));
        telephone.put("4", Arrays.asList("g", "h", "i"));
        telephone.put("5", Arrays.asList("j", "k", "l"));
        telephone.put("6", Arrays.asList("m", "n", "o"));
        telephone.put("7", Arrays.asList("p", "q", "r", "s"));
        telephone.put("8", Arrays.asList("t", "u", "v"));
        telephone.put("9", Arrays.asList("w", "x", "y", "z"));

        for (int i = 0; i < digits.length(); i++) {
            String digit = String.valueOf(digits.charAt(i));
            allList.add(telephone.get(digit));
        }

        if (allList.size() < 4) {
            for (int i = 0; i < 4 - digits.length(); i++) {
                allList.add(new ArrayList<>());
            }
        }

        if (!allList.get(0).isEmpty()) {
            for (String item1 : allList.get(0)) {
                if (allList.get(1).isEmpty()) {
                    results.add(item1);
                } else {
                    for (String item2 : allList.get(1)) {
                        if (allList.get(2).isEmpty()) {
                            results.add(item1 + item2);
                        } else {
                            for (String item3 : allList.get(2)) {
                                if (allList.get(3).isEmpty()) {
                                    results.add(item1 + item2 + item3);
                                } else {
                                    for (String item4 : allList.get(3)) {
                                        results.add(item1 + item2 + item3 + item4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(allList);
        System.out.println(results);
    }
}
