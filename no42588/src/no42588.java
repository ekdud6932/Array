/*
 < ž - ���� ����>
  ���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. 
  �߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. 
  ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.
  
  ���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ž�� �������� ���ÿ� ������ ��ȣ�� �߻��մϴ�. 
  �׷���, ž�� ������ ���� ��ȣ�� �ְ�޽��ϴ�. 
  ���̰� 4�� �ټ� ��° ž���� �߻��� ��ȣ�� ���̰� 7�� �� ��° ž�� �����ϰ�, 
  ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��, 
  ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� �����մϴ�. 
  ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ �� �����ϴ�.
  
 < ����� �� >
 heights[6,9,5,7,4] -> return [0,0,2,2,4]
 heights[3,9,9,3,5,7,2]	-> [0,0,0,3,3,3,6]
 heights[1,5,3,6,7,6,5]	-> [0,0,2,0,0,5,6]
 */
import java.util.Arrays;

public class no42588 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {1, 5, 3, 6, 7, 6, 5};
		System.out.println(Arrays.toString(solution(heights)));
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
       
        answer[0] = 0;
        for (int i = heights.length - 1; i > 0; i--) {
        	answer[i] = 0;
        	for (int j = i - 1; j >= 0; j--) {
        		if (heights[j] > heights[i]) {
        			answer[i] = j + 1;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
