import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        int wordListSize = wordList.size();
        boolean[] visited = new boolean[wordListSize];
        // beginWord가 있다면 다시 가지 않도록 방문 처리
        for (int i = 0; i < wordListSize; ++i) {
            if (wordList.get(i).equals(beginWord)) {
                visited[i] = true;
            }
        }
        // queue에 beginWord 넣고 bfs 시작
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int step = 0;
        while (queue.size() > 0) {
            ++step;
            int currentQueueSize = queue.size();
            for (int i = 0; i < currentQueueSize; ++i) {
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)) {
                    return step;
                }
                for (int j = 0; j < wordListSize; ++j) {
                    if (hasOneDiff(currentWord, wordList.get(j)) && !visited[j]) {
                        visited[j] = true;
                        queue.offer(wordList.get(j));
                    }
                }
            }
        }

        return 0;
    }

    private boolean hasOneDiff(String str1, String str2) {
        int numDiff = 0;
        for (int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ++numDiff;
                if (numDiff > 1) {
                    return false;
                }
            }
        }
        return numDiff == 1;
    }

    // dfs 시도, 실패
    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        int length = wordList.size();
        boolean[] visited = new boolean[length];
        for (int i = 0; i < wordList.size(); ++i) {
            if (wordList.get(i).equals(beginWord)) {
                visited[i] = true;
            }
        }
        return dfs(beginWord, endWord, wordList, visited, 0);
    }

    private int dfs(String currentWord, String endWord, List<String> wordList, boolean[] visited, int step) {
        if (currentWord.equals(endWord)) {
            return step;
        }

        int answer = 0;
        for (int i = 0; i < wordList.size(); ++i) {
            if (hasOneDiff(currentWord, wordList.get(i)) && !visited[i]) {
                visited[i] = true;
                answer = Math.max(dfs(wordList.get(i), endWord, wordList, visited, step + 1), answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String beginWord;
        String endWord;
        List<String> wordList;

        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));

        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));

        beginWord = "a";
        endWord = "c";
        wordList = Arrays.asList("a", "b", "c");
        System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));

        beginWord = "hot";
        endWord = "dog";
        wordList = Arrays.asList("hot", "dog", "dot");
        System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));
    }
}
