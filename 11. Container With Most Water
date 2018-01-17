
public class barrel {
	
	public static int maxArea(int[] height) {
        
        int area = 0;
        int left = 0;
        int right = height.length -1;
        while(left<right) {
            int h = Math.min(height[left],height[right]);
            area = Math.max(area,(right-left)*h);
            System.out.println("area: "+area);
            if(height[left]<height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1 = {1,2,3};
		int[] t2 = {1,1};
		int[] t3 = {1,3,5,2,4,6,7,4};
		int[] t4 = {1,2,3,4,5,6,7};
		System.out.println(maxArea(t1));
		System.out.println(maxArea(t2));
		System.out.println(maxArea(t3));
		System.out.println(maxArea(t4));
	}

}
