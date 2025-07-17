class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
 
        // L = length of all strings together
        // T: O(L log L)
        // S: O(L)
 
        for (String word : strs) {  // O(N)
            // Each anagram can be identified uniquely
            // by a sorted list of its characters.
            //
            // For each word, create its copy
            // with all characters sorted.
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
 
            // if (map doesn't contain key sortedWord, i.e. such anagram was never seen before) {
            //   create an empty list for that new anagram
            // }  
            // add to this list the current word as it corresponds to that anagram
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}