
class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> ans = new ArrayList<>(), idxa = new ArrayList<>(), idxb = new ArrayList<>();

        int x = s.length(), y = a.length(), z = b.length();

        for (int i = 0; i <= x - y; i++) {
            if (s.substring(i, i + y).equals(a)) {
                idxa.add(i);
            }
        }

        for (int j = 0; j <= x - z; j++) {
            if (s.substring(j, j + z).equals(b)) {
                idxb.add(j);
            }
        }

        for (int i = 0; i < idxa.size(); i++) {
            for (int j = 0; j < idxb.size(); j++) {
                if (Math.abs(idxa.get(i) - idxb.get(j)) <= k) {
                    ans.add(idxa.get(i));
                    break;
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}
