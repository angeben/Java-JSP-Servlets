import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		Random rand = new Random();
		int randn;
		
		tree.add(13);
		
		for(int i = 0; i < 10; ++i) {
			randn = rand.nextInt(40);
			tree.add(randn);
		}
		
		System.out.println("The tree contains " + tree.size() + " elements");
		if(tree.contains(10)) {
			System.out.println("The tree contains number 10");
		}
		else System.out.println("The tree does NOT contain number 10");
		
		String treestr = "";
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext()) {
			treestr += it.next();
			if(it.hasNext())
				treestr += " ";
		}
		System.out.println("Tree: {" + treestr + "}");
	}

}
