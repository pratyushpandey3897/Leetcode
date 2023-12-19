class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        

        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n+1];
        for (int i = 0; i<n+1; i++){
            graph.add(new ArrayList<Integer>());
        }

        for (int[] relation : relations){
            graph.get(relation[0]).add(relation[1]); // creating the graph
            indegree[relation[1]]++;
        }

        int sem = 0;
        int studiedCourses = 0;

        Queue<Integer> q = new LinkedList<>();
        
        for (int i=1 ; i<n+1; i++){
            if (indegree[i] == 0)
                q.add(i);
        }

        //start bfs 

        while(!q.isEmpty()){
            sem++;
            Queue<Integer> nextCoursesQ = new LinkedList<>();
            for (int node : q){
                studiedCourses++;

                for (int node2 : graph.get(node)){
                    indegree[node2]--;

                    if (indegree[node2] == 0)
                        nextCoursesQ.add(node2);
                }
            }

            q = nextCoursesQ;
        }

        if (studiedCourses == n)
            return sem;
        return -1;
    }
}