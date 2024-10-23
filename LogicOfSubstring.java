public class LogicOfSubstring {
    public static void main(String[] args) {
        String fullName = "Hello Maya Mehra";
        String name = "";
        String surname = "";
        for (int i = 0; i < fullName.length(); i++) {
            char newChar = fullName.charAt(i);
            if (newChar == ' ') {
              break;
            }
            name = name + fullName.charAt(i);
        }
        for (int i = 0; i < fullName.length(); i++) {
            int len = name.length();
            if (i > len) {
                surname += fullName.charAt(i);
            }
        }
        System.out.println(name);
        System.out.println(surname);
    }
}
