class Solution {
    boolean flag =false;
    int counter = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, 0, visited);
        if (counter == rooms.size())
            return true;
        else
            return false;

    }

    public void dfs (List<List<Integer>> rooms, int room_idx, boolean[]visited){

        visited[room_idx] = true;
        counter++;

        for (int i =0 ; i<rooms.get(room_idx).size(); i++){
            int next_room = rooms.get(room_idx).get(i);
            if (!visited[next_room])
                dfs(rooms, next_room, visited);
        }
    }
}