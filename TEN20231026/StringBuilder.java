package TEN20231026;

public class StringBuilder {
    private char[] chars;
    private int n;

    public StringBuilder() {
        chars = new char[16];
        n = 0;
    }

    public StringBuilder(String s) {
        chars = new char[s.length() * 2];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        n = s.length();
    }

    public int length() {
        return n;
    }

    public int capacity() {
        return chars.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("Index= " + index);
        }
        return chars[index];
    }

    private void expand() {
        char[] copy = new char[chars.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = chars[i];
        }
        chars = copy;
    }

    public void append(char c) {
        if (n >= chars.length) {
            expand();
        }
        chars[n] = c;
        n++;
    }

    public void append(String str) {
        for (int i = 0; i < str.length(); i++) {
            append(str.charAt(i));
        }
    }

    public String toString() {
        return new String(chars, 0, n);
    }
}