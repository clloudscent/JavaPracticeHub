package aug18;

public class Practice {
    /*
   A two dimensional array of strings is given below.
Engligh Sentences can be made by putting together one string from each dimension.
Write a program that outputs all possible english sentences.
   String[][] wordsList = {
      {"The monkey ", "The bird ", "The dog ", "Yamada Tarou "}, //a
  {"washed clothes ", "climbed trees ", "reads books "},//b
  {"with John ", "with Jane ", "with a puppy ", "with Urashima Tarou "},//c
  {"on the mountain", "in the river", "at Onigashima", "at Ryugu Castle"}//d
  };
  /*The monkey washed clothes with John on the mountain
  a b c d
---------------------------------------------
      /*The monkey washed clothes with John on the mountain
      The monkey washed clothes with John in the river
      The monkey washed clothes with John at Onigashima
      The monkey washed clothes with John at Ryugu Castle

      The monkey washed clothes with Jane on the mountain*/
    public static void main(String[] args) {
        String[][] wordsList = {
                {"The monkey ", "The bird ", "The dog ", "Yamada Tarou "}, //a
                {"washed clothes ", "climbed trees ", "reads books "},//b
                {"with John ", "with Jane ", "with a puppy ", "with Urashima Tarou "},//c
                {"on the mountain", "in the river", "at Onigashima", "at Ryugu Castle"}//d
        };

        int a = 0;
        int b = 0;
        int c = -1;
        int d = -1;
        while (true) {
            System.out.print(wordsList[0][a]);

            System.out.print(wordsList[1][b]);
            if (c >= 0) {
                System.out.print(wordsList[2][c]);
            }
            if (d >= 0) {
                System.out.print(wordsList[3][d]);
            }
            System.out.println();
            if (d < wordsList[3].length-1) {
                d++;
            } else {
                d = -1;
                if (c < wordsList[2].length-1) {
                    c++;
                } else {
                    c = -1;
                    if (b < wordsList[1].length-1) {
                        b++;
                    } else {
                        b = 0;
                        if (a < wordsList[0].length-1) {
                            a++;
                        } else {
                            break;
                        }
                    }
                }
            }


        }
    }
}
