package oct24;

public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("sample1.txt").getPath();
        String photo2Path = clazz.getResource("images/sample2.txt").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}
