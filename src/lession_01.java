import java.util.HashSet;

public class lession_01 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("幹");
		hashSet.add("你");
		hashSet.add("娘");
		hashSet.add("操");
		hashSet.add("機");
		hashSet.add("掰");

		for (String s : hashSet) {
			System.out.println(s);
			
		}

	}
}
