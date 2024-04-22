package Jun22;

public class Practice03 {
    public static void main(String[] args) {
        String text = "I have an apple and a banana";
        String pattern = "an";
//        System.out.println(text.indexOf(pattern));

        int count = 0;
        System.out.println("현재 찾아보려는 문자열: "+text);
        int index = text.indexOf(pattern);
        System.out.println("index: "+index);
        while (index != -1) {
            count++;
            text = text.substring(index+pattern.length());
            System.out.println("현재 찾아보려는 문자열: "+text);
            index = text.indexOf(pattern);
            System.out.println("index: "+index);
        }

        System.out.println("찾은 개수: "+count);

    }
}
