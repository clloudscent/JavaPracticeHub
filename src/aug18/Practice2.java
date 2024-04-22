/*
package aug18;

public class Practice2 {
    public static void main(String[] args) {
        String[][] wordsList = {
                {"The monkey ", "The bird ", "The dog ", "Yamada Tarou "},
                {"washed clothes ", "climbed trees ", "reads books "},
                {"with John ", "with Jane ", "with a puppy ", "with Urashima Tarou "},
                {"on the mountain", "in the river", "at Onigashima", "at Ryugu Castle"}
        };

        int currentListNum=0;
        //[][]
        //[1][0]
        String currentSentence = "";
        completeSentence(wordsList, currentSentence, currentListNum);
    }

    public static void completeSentence(String[][] wordList, String currentSentence, int currentListNum){

        if(currentListNum = wordList.length()){//for the first time
            StringBuilder sentence = new StringBuilder();

            for(String sentence : currentSentence){
                sentence.append(sentence); //need blank space
            }
            System.out.println(sentence.toString()); //String
            return;
        }

        for(String sentence : wordList[currentListNum]){
            currentSentence[currentListNum] = sentence;
            completeSentece(wordList, currentSentence, currentListNum+1);
        }

    }

}
}
*/
