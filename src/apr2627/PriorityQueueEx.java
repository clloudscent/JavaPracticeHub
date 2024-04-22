package apr2627;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(4);
        queue.offer(5);
        queue.offer(1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());


        PriorityQueue<UserProfile> usersQueue = new PriorityQueue<>(
                Comparator.comparing((UserProfile u)->u.age)
        );
    }

    static class UserProfile{
        private final Integer age;

        public UserProfile(Integer age){
            this.age = age;
        }

        public Integer getAge(){
            return age;
        }
    }
}
