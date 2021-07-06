package org.eds.epi.arrays;

import java.util.List;

public class MaxBattery {
    public int maxBattery(List<Point> path) {
        int ans = 0;

        for (int i = 0; i < path.size() - 1; i++) {
            for (int j = 1 + 1; j < path.size(); j++) {
                int height = path.get(j).z - path.get(i).z;
                if (height > ans) {
                    ans = height;
                }
            }
        }
        return ans;
    }

    public int maxBatteryAdvanced(List<Point> path) {
        int ans = 0;
        int runningMin = Integer.MAX_VALUE;

        for (int i = 0; i < path.size(); i++) {
            ans = Integer.max(ans, path.get(i).z - runningMin);
            runningMin = Integer.min(runningMin, path.get(i).z);
        }
        return ans;
    }

    public MaxBattery() {

    }
}
