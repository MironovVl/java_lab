package n6;

import n5.StringFunc;

public class ProcessString implements StringFunc {

    @Override
    public int nimberOfChar(String st) {
        return st.length();
    }

    @Override
    public String unevenChar(String st) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < st.length(); i += 2) {
            res.append(st.charAt(i));
        }
        return res.toString();
    }

    @Override
    public String invert(String st) {
        return new StringBuilder(st).reverse().toString();
    }
}
