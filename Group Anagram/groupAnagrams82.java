class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<String, String>> = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord);
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}