package DSA.A01_linearSearch;

public class searchInString {
    public static void main(String[] args) {
        String name = "ujjawal";
        char target = 'a';
        char target2 = 'z';
        System.out.println(search(name, target));
        System.out.println(search2(name, target2));
    }
    static boolean search(String name, char target){
        if (!name.isEmpty()) {
            //"name.length() != 0" is same as "!name.isEmpty()"
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == target) {
                    return true;
                }

            }
        }
        return false;
    }

    static boolean search2(String name, char target){
        if (!name.isEmpty()) {
            //"name.length() != 0" is same as "!name.isEmpty()"
            for (char ch: name.toCharArray()) {
                if (ch == target){
                    return true;
                }
            }
        }
        return false;
    }
}
