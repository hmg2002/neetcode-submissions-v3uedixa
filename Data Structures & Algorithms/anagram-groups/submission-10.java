class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String newStr = new String(c);
            res.putIfAbsent(newStr, new ArrayList<>());
            res.get(newStr).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
