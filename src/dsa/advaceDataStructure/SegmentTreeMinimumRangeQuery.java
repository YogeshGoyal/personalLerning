/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.advaceDataStructure;

/**
 *
 * @author yokukuma
 */
public class SegmentTreeMinimumRangeQuery {

    public int[] createSegmentTree(int[] input) {
        NextPowerOf2 np = new NextPowerOf2();
        int nextPower = np.nextPowerOf2(input.length);
        int[] segmentTree = new int[2 * nextPower - 1];

        for (int i : segmentTree) {
            segmentTree[i] = Integer.MAX_VALUE;
        }
        constructMinSegmentTree(input, segmentTree, 0, input.length - 1, 0);
        return segmentTree;
    }

    private void constructMinSegmentTree(int[] input, int[] segmentTree, int low, int high, int pos) {
        if (low == high) {
            segmentTree[pos] = input[low];
            return;
        }
        int mid = (low + high) / 2;
        constructMinSegmentTree(input, segmentTree, low, mid, 2 * pos + 1);
        constructMinSegmentTree(input, segmentTree, mid + 1, high, 2 * pos + 2);
        segmentTree[pos] = Math.min(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);

    }

    public static void main(String[] args) {
        SegmentTreeMinimumRangeQuery st = new SegmentTreeMinimumRangeQuery();
        int[] input = {0, 3, 4, 2, 1, 6, -1};
        int[] segTree = st.createSegmentTree(input);
        //non lazy propagation example
        assert 0 == st.rangeMinimumQuery(segTree, 0, 3, input.length);
        assert 1 == st.rangeMinimumQuery(segTree, 1, 5, input.length);
        assert -1 == st.rangeMinimumQuery(segTree, 1, 6, input.length);
    }

    /**
     * Queries given range for minimum value.
     */
    public int rangeMinimumQuery(int[] segmentTree, int qlow, int qhigh, int len) {
        return rangeMinimumQuery(segmentTree, 0, len - 1, qlow, qhigh, 0);
    }

    private int rangeMinimumQuery(int[] segmentTree, int low, int high, int qlow, int qhigh, int pos) {
        if (qlow <= low && qhigh >= high) {
            return segmentTree[pos];
        }
        if (qlow > high || qhigh < low) {
            return Integer.MAX_VALUE;
        }
        int mid = (low + high) / 2;
        return Math.min(rangeMinimumQuery(segmentTree, low, mid, qlow, qhigh, 2 * pos + 1),
                rangeMinimumQuery(segmentTree, mid + 1, high, qlow, qhigh, 2 * pos + 2));

    }

}
