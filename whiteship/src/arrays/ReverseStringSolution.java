package arrays;


public class ReverseStringSolution {
    public static void main(String[] args) {
        ReverseStringSolution reverseString = new ReverseStringSolution();
        System.out.println(reverseString.solution2("Hello".toCharArray()));
    }

    //              0 1 2 3 4
    // H e l l o -> o l l e H
    private char[] solution1(char[] message) {
        char[] reversedMessage = new char[message.length];

        // 4 - 4 -> 0
        // 4 - 3 -> 1
        // 4 - 2 -> 2
        // 4 - 1 -> 3
        // 4 - 0 -> 4
        for (int i = message.length - 1; i >= 0; i--) {
            reversedMessage[message.length - 1 - i] = message[i];
        }
        return reversedMessage;
    }

    // h l l e o
    // he l lo
    // h e l l o
    // 4 - 0 -> 4
    // 4 - 1 -> 3
    private char[] solution2(char[] message) {
        for (int i = 0; i < message.length / 2; i++) {
            char temp = message[i];
            message[i] = message[message.length -1 - i];
            message[message.length -1 - i] = temp;
        }
        return message;
    }
}
