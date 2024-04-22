package jul10;

import java.io.File;
import java.util.Map;

public abstract class Practice {

    // 접근제한자 반환타입 메소드명(매개변수){}

    abstract int sum(int num1, int num2);

    abstract File downloadPGFile(String pgCode, String downloadPathString);
    abstract Map<String, String> extractPGContent(String pgCode);
}
