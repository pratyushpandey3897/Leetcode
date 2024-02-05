class Solution {
    List<List<Integer>> adj = new ArrayList<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        for (int i = 0; i < numCourses; i++)
            adj.add(new LinkedList<>());

        for (int i =0; i< prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        boolean visit[] = new boolean[numCourses];
        boolean instack[] = new boolean[numCourses];
        for (int i =0 ;i<numCourses; i++ ){

            if (!visit[i])
                if (dfs(i,visit, instack))
                    return false;
        }
        return true;
    }

    public boolean dfs(int course, boolean[]visit, boolean[]instack){
        // if (instack[course])
        //     return true;
        
        // if (visit[course])
        //     return false;

        visit[course] = true;
        instack[course] = true;
        for (int n:adj.get(course)){
            if (instack[n]) return true;

            if (!visit[n])
                if (dfs(n, visit, instack))
                    return true;
        }
        instack[course] = false;
        return false;
    }
}