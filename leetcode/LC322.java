public class LC322 {

    public int coinChange(int[] coins, int amount) {

        // 지불해야 할 돈이 0원이면 그대로 리턴
        if (amount == 0) {
            return 0;
        }

        // n원까지의 코인 개수를 저장
        int[] cache = new int[amount + 1];
        // 1부터 amount까지 각각 필요한 코인 개수를 구한다
        for (int amt = 1; amt <= amount; ++amt) {
            int coinCount = -1;
            for (int coin : coins) {
                // amount가 코인의 값보다 작거나, 이전 값에서 현재 동전으로 현재 값을 만들 수 없다면 건너뛴다
                if (amt < coin || cache[amt - coin] == -1) {
                    continue;
                }
                // 이 동전으로 만들 수 있다면
                // 이전 동전 개수 + 현재 동전 개수
                int curCoinCount = cache[amt - coin] + 1;
                if (coinCount < 0 || curCoinCount < coinCount) {
                    coinCount = curCoinCount;
                }
            }
            cache[amt] = coinCount;
        }

        return cache[amount];
    }

    public static void main(String[] args) {
        System.out.println(new LC322().coinChange(new int[]{1,2,5}, 1));
    }
}
