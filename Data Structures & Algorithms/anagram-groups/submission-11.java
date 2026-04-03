class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            res.putIfAbsent(str, new ArrayList<>());
            res.get(str).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
