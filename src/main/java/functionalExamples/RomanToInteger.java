package functionalExamples;

import java.util.ArrayList;
import java.util.List;

public class RomanToInteger {
    public static Integer romanToInt(String s) {
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;
        char[] resultCharArray = s.toCharArray();
        List<Integer> valuesList = new ArrayList<>();
        char currentCharFromArray = 'p';
        char previousCharFromArray = 'p';
        for (int z = 0; z < resultCharArray.length; z++) {
            resultCharArray[z] = Character.toLowerCase(resultCharArray[z]);
            currentCharFromArray = resultCharArray[z];
            if (z > 0) {
                previousCharFromArray = resultCharArray[z - 1];
                if (resultCharArray[z] == 'x' && previousCharFromArray == 'i') {
                    valuesList.add(x - i);
                    System.out.println(valuesList);
    
                }
                if (resultCharArray[z] == 'v' && previousCharFromArray == 'i') {
//                    v = v - i;
                    valuesList.add(v - i);
                    System.out.println(valuesList);
        
                }
                if (resultCharArray[z] == 'c' && previousCharFromArray == 'x') {
//                    c = c - x;
                    valuesList.add(c - x);
                    System.out.println(valuesList);
        
                }
                if (resultCharArray[z] == 'l' && previousCharFromArray == 'x') {
//                    l = l - x;
                    valuesList.add(l - x);
                    System.out.println(valuesList);
        
                }
                if (resultCharArray[z] == 'm' && previousCharFromArray == 'c') {
//                    m = m - c;
                    valuesList.add(m - c);
                    System.out.println(valuesList);
        
                }
                if (resultCharArray[z] == 'd' && previousCharFromArray == 'c') {
//                    d = d - c;
                    valuesList.add(d - c);
                    System.out.println(valuesList);
                }
                continue;
            }
                valuesList.add(currentCharFromArray == 'i' ? i :
                        (currentCharFromArray == 'v' ? v :
                                (currentCharFromArray == 'x' ? x :
                                        (currentCharFromArray == 'l' ? l :
                                                (currentCharFromArray == 'c' ? c :
                                                        (currentCharFromArray == 'd' ? d :
                                                                (currentCharFromArray == 'm' ? m : 0)))))));
                System.out.println("Final method " + valuesList);
        }
        return valuesList.stream().mapToInt(Integer::intValue).sum();
    }
}
