class degree
{
	static class Graph
	{
		int v, e;
		int[][] dir;
		Graph(int v, int e) {
			this.v = v;
			this.e = e;
			dir = new int[v][];
			for (int i = 0; i < v; i++)
				dir[i] = new int[v];
		}
	}
	static Graph createGraph(int v, int e) 
	{
		Graph G = new Graph(v, e);
		G.dir[0][1] = 1;
		G.dir[0][2] = 1;
		G.dir[1][0] = 1;
        G.dir[1][2] = 1;
		G.dir[1][3] = 1;
        G.dir[1][4] = 1;
        G.dir[2][1] = 1;
		G.dir[2][0] = 1;
		G.dir[2][4] = 1;
		G.dir[3][1] = 1;
		G.dir[3][4] = 1;
        G.dir[4][3] = 1;
        G.dir[4][2] = 1;
        G.dir[4][1] = 1;
		return G;
	}

	static int findDegree(Graph G, int ver) 
	{
		int degree = 0;
		for (int i = 0; i < G.v; i++) {
			if (G.dir[ver][i] == 1)
				degree++;
		}
		if(G.dir[ver][ver] == 1) degree++;
		return degree;
	}
	public static void main(String[] args)
	{
		int vertices = 5;
		int edges = 7;
		Graph G = createGraph(vertices, edges);
        for (int i = 0; i<5;i++) {
        int ver = i;
        System.out.println("For the vertex "+i+" the degree is :");
		int degree = findDegree(G, ver);
		System.out.println(degree);
            
        }
		
	}
}

