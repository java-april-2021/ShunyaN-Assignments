public class StringManipulator {
    public String trimAndConcat(String line1, String line2) {
        return line1.trim().concat(line2.trim());
    }

    public Integer getIndexOrNull(String line, char i) {
        if(line.indexOf(i) == -1) {
            return null;
        }
        return line.indexOf(i);
    }
    public Integer getIndexOrNull(String line, String subLine) {
        if(line.indexOf(subLine) == -1) {
            return null;
        }
        return line.indexOf(subLine);
    }

    public String concatSubstring(String line, int idxA, int idxB, String replacement) {
        String substr;
        try{
            substr = line.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "whoops!";
        }
        return substr.concat(replacement);
    }
}
