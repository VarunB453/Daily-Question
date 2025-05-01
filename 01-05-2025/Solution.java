class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        
        int left = 0, right = Math.min(tasks.length, workers.length);
        
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (canAssign(mid, tasks, workers, pills, strength)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean canAssign(int k, int[] tasks, int[] workers, int pills, int strength) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = workers.length - k; i < workers.length; i++) {
            deque.addLast(workers[i]);
        }

        int availablePills = pills;
        for (int i = k - 1; i >= 0; i--) {
            int task = tasks[i];
            if (!deque.isEmpty() && deque.getLast() >= task) {
                deque.removeLast(); // assign strongest worker
            } else {
                if (availablePills == 0) return false;
                while (!deque.isEmpty() && deque.getFirst() + strength < task) {
                    deque.removeFirst(); // discard weakest unqualified
                }
                if (deque.isEmpty()) return false;
                deque.removeFirst(); // use pill on weakest viable
                availablePills--;
            }
        }
        return true;
    }
}
