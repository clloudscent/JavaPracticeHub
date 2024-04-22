package jul04;

public class Practice01 {


    public static void main(String[] args) {
        Toy[] toyArray = {new Toy(), new Toy(), new Toy()};

        Toy[] anotherToyArray = new Toy[3];
        System.arraycopy(toyArray, 0, anotherToyArray, 0, toyArray.length);


    }
}
