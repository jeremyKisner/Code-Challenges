package challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
/*
* Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. 
* If there is no such character, return '_'.
*/
	public static void main(String[] args) {
		System.out.println(firstNotRepeatingCharacter("abacabad"));
		firstNotRepeatingCharacter("abacabad");
	}

	static char firstNotRepeatingCharacter(String s) {
		char answer = '_';
		String[] c = s.split("");
		Map <String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < c.length; i++) {
			if (!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			else {
				int value = map.get(c[i]);
				value++;
				map.put(c[i], value);
			}
		}
		if (map.containsValue(1)) {
			for(String key : map.keySet()) {
				if (map.get(key) == 1) {
					answer = key.charAt(0);
					return answer;
				}
			}
		}
		return answer;
	}

}
