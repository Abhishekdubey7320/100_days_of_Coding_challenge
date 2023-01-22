class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap index = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!index.containsKey(c))
                index.put(c, i);

            if (!index.containsKey(w))
                index.put(w, i);

            if (index.get(c) != index.get(w))
                return false;
        }

        return true;
    }
}
