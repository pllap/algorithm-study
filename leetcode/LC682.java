public class LC682 {

    public int calPoints(String[] ops) {
        // ops: 점수 / + / D / C
        // 점수: 새로운 점수
        // +: 이전 두 점수의 합을 새로운 점수로 만듬
        // D: 이전 점수의 2배를 새로운 점수로 만듬
        // C: 이전 점수를 지움

        // record 기록
        int[] record = new int[ops.length];
        int round = -1;
        for (String op : ops) {
            if (op.equals("C")) {
                --round;
                continue;
            }
            if (op.equals("D")) {
                ++round;
                record[round] = record[round - 1] * 2;
                continue;
            }
            if (op.equals("+")) {
                ++round;
                record[round] = record[round - 1] + record[round - 2];
                continue;
            }
            record[++round] = Integer.parseInt(op);
        }

        // 점수 더하기
        int point = 0;
        for (int i = 0; i < round + 1; ++i) {
            point += record[i];
        }
        return point;
    }

    public static void main(String[] args) {
        System.out.println(new LC682().calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(new LC682().calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
        System.out.println(new LC682().calPoints(new String[]{"1"}));
    }
}
