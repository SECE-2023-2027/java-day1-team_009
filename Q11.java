public class CountCharacters {
    public static void main(String[] args) {

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                numbers++;
            else if (Character.isSpaceChar(ch))
                spaces++;
            else
                others++;
        }

        System.out.println("The string is : " + str);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}