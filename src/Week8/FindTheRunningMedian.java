package Week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindTheRunningMedian {

    Double getMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        double m;
        if (maxHeap.isEmpty()) {
            return 0.0;
        } else if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek()*1.0;
        }
    }
    public List<Double> runningMedian(List<Integer> a) {
        List<Double> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < a.size(); i++){
            if (maxHeap.isEmpty()) {
                maxHeap.add(a.get(i));
            } else if (maxHeap.size() == minHeap.size()) {
                if (a.get(i) < minHeap.peek()) {
                    maxHeap.add(a.get(i));
                } else {
                    minHeap.add(a.get(i));
                    maxHeap.add(minHeap.remove());
                }
            } else if (maxHeap.size() > minHeap.size()) {
                if (a.get(i) > maxHeap.peek()) {
                    minHeap.add(a.get(i));
                } else {
                    maxHeap.add(a.get(i));
                    minHeap.add(maxHeap.remove());
                }
            }
            res.add(getMedian(maxHeap, minHeap));
        }

        return res;
    }

}
