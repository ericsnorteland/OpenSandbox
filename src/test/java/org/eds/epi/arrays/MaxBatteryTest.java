package org.eds.epi.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxBatteryTest {
    @Test
    public void testEmpty() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        assertEquals(0, mb.maxBattery(path));
    }

    @Test
    public void testSinglePoint() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        assertEquals(0, mb.maxBattery(path));
    }

    @Test
    public void testSimple() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        path.add(new Point(4, 4, 7));
        path.add(new Point(4, 4, 2));
        path.add(new Point(4, 4, 9));
        assertEquals(7, mb.maxBattery(path));
    }

    @Test
    public void testMoreComplicated() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        path.add(new Point(4, 4, 7));
        path.add(new Point(4, 4, 2));
        path.add(new Point(4, 4, 5));
        path.add(new Point(4, 4, 9));
        assertEquals(7, mb.maxBattery(path));
    }

    @Test
    public void testEmptyA() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        assertEquals(0, mb.maxBatteryAdvanced(path));
    }

    @Test
    public void testSinglePointA() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        assertEquals(0, mb.maxBatteryAdvanced(path));
    }

    @Test
    public void testSimpleA() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        path.add(new Point(4, 4, 7));
        path.add(new Point(4, 4, 2));
        path.add(new Point(4, 4, 9));
        assertEquals(7, mb.maxBatteryAdvanced(path));
    }

    @Test
    public void testMoreComplicatedA() {
        MaxBattery mb = new MaxBattery();
        List<Point> path = new ArrayList<>();
        path.add(new Point(4, 4, 4));
        path.add(new Point(4, 4, 7));
        path.add(new Point(4, 4, 2));
        path.add(new Point(4, 4, 5));
        path.add(new Point(4, 4, 9));
        assertEquals(7, mb.maxBatteryAdvanced(path));
    }
}
