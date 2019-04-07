class Solution {
    public int trap(int[] height) {
        if (height.length<3) {
			return 0;
		}else {
			int filledWater=0;
			int[] leftWall=new int [height.length-2];//左壁
			int[] rightWall=new int [height.length-2];//右壁
			int canWater;
			leftWall[0]=height[0];
			for (int i = 1; i < leftWall.length; i++) {
				leftWall[i]=Math.max(height[i], leftWall[i-1]);
			}
			rightWall[rightWall.length-1]=height[height.length-1];
			for (int i = rightWall.length-2; i >=0; i--) {
				rightWall[i]=Math.max(rightWall[i+1], height[i+2]);
			}
			for (int i = 0; i < rightWall.length; i++) {
				canWater=Math.min(rightWall[i], leftWall[i])-height[i+1];
				filledWater+=canWater>0?canWater:0;
			}
			return filledWater;
		}
    }
}
