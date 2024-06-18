import java.util.*;
class inandout {

	static void findInOutDegree(List<List<Integer> > adjList, int n)
	{
		int in[] = new int[n];
		int out[] = new int[n];

		for (int i = 0; i < adjList.size(); i++) {

			List<Integer> list = adjList.get(i);

			// Out degree for ith vertex will be the count
			// of direct paths from i to other vertices
			out[i] = list.size();
			for (int j = 0; j < list.size(); j++)
				in[list.get(j)]++;
		}
		System.out.println("Vertex\tIn\tOut");
		for (int k = 0; k < n; k++) {
			System.out.println(k + "\t" + in[k] + "\t" + out[k]);
		}
	}
	public static void main(String args[])
	{
		List<List<Integer> > adjList = new ArrayList<>();
		// from vertex 0
		List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(1, 2));
		adjList.add(tmp);
		// from vertex 1
		tmp = new ArrayList<Integer>(Arrays.asList(3));
		adjList.add(tmp);
		// from vertex 2
		tmp = new ArrayList<Integer>(Arrays.asList(1));
		adjList.add(tmp);
		// from vertex 3
		tmp = new ArrayList<Integer>(Arrays.asList());
		adjList.add(tmp);
		// from vertex 4
		tmp = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		adjList.add(tmp);
		int n = adjList.size();
		findInOutDegree(adjList, n);
	}
}

