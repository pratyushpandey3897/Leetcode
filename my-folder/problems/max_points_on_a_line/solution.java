class Solution {
    public int maxPoints(int[][] points) {


        if (points.length == 1)
            return 1;
        int maxPoints = 0;
        
        for (int i = 0; i<points.length; i++){
            Map<String, Integer> slopeCount = new HashMap<>();
            int samePoints = 1;
            for (int j =0; j <points.length; j++){
                
                if (i == j) {
                    continue;
                }

                if (points[i][0] == points[j][0]) {  // vertical line
                    if (points[i][1] == points[j][1]) {  // same point
                        samePoints++;
                    } else {
                        if (!slopeCount.containsKey("inf")) {
                            slopeCount.put("inf", 1);
                        } else {
                            slopeCount.put("inf", slopeCount.get("inf") + 1);
                        }
                    }
                } else {

                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int gcd = gcd(dx, dy);
                String slope = (dy / gcd) + "/" + (dx / gcd);
                if (!slopeCount.containsKey(slope)) {
                    slopeCount.put(slope, 1);
                } else {
                    slopeCount.put(slope, slopeCount.get(slope) + 1);
                }
                }
            }

                for (int count : slopeCount.values()) {
                    maxPoints = Math.max(maxPoints, count + samePoints);
                }
                
            }

        return maxPoints;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}