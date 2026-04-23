class Solution {
    String code = "@@!";
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            sb.append(strs.get(i) + code);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> output = new ArrayList<>();
        char[] encoded = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encoded.length; i++) {
            if (i <= encoded.length - code.length() &&
                    encoded[i] == '@' && encoded[i + 1] == '@' && encoded[i + 2] == '!') {
                output.add(sb.toString());
                sb.setLength(0);
                i += code.length() - 1; // Skip the code delimiter
            } else {
                sb.append(encoded[i]);
            }
        }
        System.out.println(output);
        return output;
    }
}
