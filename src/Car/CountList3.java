package Car;

import java.util.ArrayList;
import java.util.List;

public class CountList3 {
    public String countList(List<String> nameList) {
        int count = 0;
        for (int i = 0; i < nameList.size(); i++) {
            String currentUser = nameList.get(i);
            boolean userNotExist = true;

            for (int j = 0; j < nameList.size(); j++) {
                currentUser = nameList.get(j);
                if (currentUser.equals(nameList.get(i))) {
                    count++;
                    userNotExist = false;
                    break;
                }
            }

            if (userNotExist) {
                List<String> userToAdd = new ArrayList<>();
                userToAdd.add(currentUser);
                count ++;
                nameList = userToAdd;
            }
        }

        int maxNum = 0;
        String bestUserId = null;
        for (int i = 0; i < nameList.size(); i++) {
            String currentUser = nameList.get(i);
            if(count >= maxNum) {
                maxNum = count;
                bestUserId = currentUser;
            }
        }
        return bestUserId;
    }
}
