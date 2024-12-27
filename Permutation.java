public class Permutation {
    public static void calPermute(String name, String result) {
        if (name.isEmpty()) {
            System.out.println(result);
            return;
        } else {
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                String newName = name.substring(0, i) + name.substring(i + 1);
                calPermute(newName, result + c);
            }
        }
    }

    public static void main(String[] args) {
        String name = "ABC";
        calPermute(name, "");
    }
}
