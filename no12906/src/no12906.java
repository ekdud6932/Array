import java.util.ArrayList;
import java.util.Arrays;

public class no12906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int []arr) {
        int[] answer;
        
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 10;
        
        for (int num : arr) {
            if (temp != num) {
                list.add(num);
            }
            temp = num;
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
	}
}
