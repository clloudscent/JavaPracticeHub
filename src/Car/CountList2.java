package Car;

import java.util.ArrayList;
import java.util.List;

public class CountList2 {
    String countList(List<String> nameList) {
        for (int i = 0; i < nameList.size(); i++) {
            String currentUser = nameList.get(i);
            int userCount = 0;
            boolean nameListEmpty = true;

            for (int j = 0; j < nameList.size(); j++) {
                List<String> currentNameList = new ArrayList<>();
                currentNameList.add(nameList.get(i));
                if (currentNameList.get(i).equals(currentUser)) {
                    userCount++;
                    nameListEmpty = false;
                    break;
                }
            }
            if (nameListEmpty) {
                List<String> newUser = new ArrayList<>();
                newUser.add(currentUser);
                userCount = 1;
                nameList = newUser;
            }
        }
        int maxNum = 0;
        String userTop = null;
        for (int i = 0; i < nameList.size(); i++) {
            String currentUser = nameList.get(i);

        }
        return userTop;
    }

}


