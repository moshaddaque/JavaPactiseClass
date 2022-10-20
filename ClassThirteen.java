public class ClassThirteen {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mizan");
        System.out.println(sb);

        // Char at index
        System.out.println(sb.charAt(0));

        // Set char at index
        sb.setCharAt(2, 'j');
        System.out.println(sb);

        // insert
        sb.insert(0, 'S');
        sb.insert(1, 'M');
        System.out.println(sb);

        // delete
        sb.delete(2, sb.length());
        System.out.println(sb);
        // append
        sb.append('M');
        sb.append('I');
        sb.append('Z');
        sb.append('A');
        sb.append('N');
        System.out.println(sb);

        // Reverse

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
