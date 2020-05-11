package com.practice.finalpractice.array.meregInterval;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
