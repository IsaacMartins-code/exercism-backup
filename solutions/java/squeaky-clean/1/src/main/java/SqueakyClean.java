class SqueakyClean {
    public static String clean(String identifier) {

        String result = identifier.replace(" ", "_");

        result = result.replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');

        StringBuilder sb = new StringBuilder();
        boolean upperNext = false;

        for (char c : result.toCharArray()) {
            if (c == '-') {
                upperNext = true;
            } else if (upperNext) {
                sb.append(Character.toUpperCase(c));
                upperNext = false;
            } else {
                sb.append(c);
            }
        }
        result = sb.toString();

        result = result.replaceAll("[^\\p{L}_]", "");

        return result;
    }
}
