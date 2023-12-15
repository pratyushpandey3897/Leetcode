class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> graph = new HashMap<>();

        for (List<String> l: paths){
            String from = l.get(0);
            String to = l.get(1);

            graph.put(from, graph.getOrDefault(from, 0) + 1 );
            graph.put(to , graph.getOrDefault(to, 0));
        }

        for (Map.Entry<String, Integer> m: graph.entrySet()){
            if (m.getValue() == 0)
                return m.getKey();
        }

        return "";
        
    }
}