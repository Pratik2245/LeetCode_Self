public class LC_1578MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        String colors="abaac";
        int[] neededTime={1,2,3,4,5};
        int ans=minCost(colors,neededTime);
        System.out.println(ans);
    }
    public static int minCost(String colors, int[] neededTime) {
        int min = 0;

        for(int i=1; i<colors.length(); i++) {

            if(colors.charAt(i) == colors.charAt(i-1)) {
//                remove the smaller one and
                min += Math.min(neededTime[i] , neededTime[i-1]);
//                  assign the needed with the larger one
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
        }
        return min;
    }
}
