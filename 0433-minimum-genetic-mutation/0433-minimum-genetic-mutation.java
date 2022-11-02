class Solution {
    private int count = Integer.MAX_VALUE;;

  public int minMutation(String start, String end, String[] bank) {
    Set<String> visitedSet = new HashSet<>();
    visitedSet.add(start);
    _DFSHelper(start, end, bank, 0, visitedSet);
    return count == Integer.MAX_VALUE ? -1 : count;
  }

  private void _DFSHelper(
      String start, String end, String[] bank, int moves, Set<String> visitedSet) {
    // Terminator
    if (start.equals(end)) {
      count = Math.min(count, moves);
      return;
    }
    // Process
    for (String validStr : bank) {
      // If this str occured before, then skip it;
      if (visitedSet.contains(validStr)) continue;
      // Find out which VALID string only has one different than start
      // (Because we could only move once a time);
      int diff = 0;
      for (int j = 0; j < 8; j++) {
        if (start.charAt(j) != validStr.charAt(j)) {
          diff += 1;
        }
        if (diff > 1) {
          break;
        }
      }
      if (diff == 1) {
        visitedSet.add(validStr);
        // Drill down
        _DFSHelper(validStr, end, bank, moves + 1, visitedSet);
        // Reverse state
        visitedSet.remove(validStr);
      }
    }
  }
}