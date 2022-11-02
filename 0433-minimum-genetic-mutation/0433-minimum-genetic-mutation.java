class Solution {
   public int minMutation(String start, String end, String[] bank) {
    if (start.equals(end)) return 0;
    int moves = 0;
    Set<Character> keysSet = new HashSet<>(Arrays.asList('A', 'C', 'G', 'T'));
    Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
    Set<String> visitedSet = new HashSet<>();
    Queue<String> tmpQueue = new LinkedList<>();
    visitedSet.add(start);
    tmpQueue.offer(start);
    while (!tmpQueue.isEmpty()) {
      int nsize = tmpQueue.size();
      for (int i = 0; i < nsize; i++) {
        String str = tmpQueue.poll();
        if (str.equals(end)) return moves;
        char tmpC[] = str.toCharArray();
        // Replace the character one by one in current string
        for (int j = 0; j < start.length(); j++) {
          char cache = tmpC[j];
          for (char key : keysSet) {
            // If the new character is same as replaced char, then skip it;
            if (tmpC[j] == key) continue;
            tmpC[j] = key;
            String tmpStr = new String(tmpC);
            // If the new string is never used before and it is a valid gene
            // string.
            if (!visitedSet.contains(tmpStr) && bankSet.contains(tmpStr)) {
              visitedSet.add(tmpStr);
              tmpQueue.offer(tmpStr);
            }
          }
          // Reverse State
          tmpC[j] = cache;
        }
      }
      moves += 1;
    }
    return -1;
  }
}