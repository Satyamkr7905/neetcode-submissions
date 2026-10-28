class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find the delimiter
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get the length of the next string
            int len = Integer.parseInt(s.substring(i, j));

            // Extract the string
            int start = j + 1;
            int end = start + len;
            result.add(s.substring(start, end));

            i = end;
        }

        return result;
    }
}
