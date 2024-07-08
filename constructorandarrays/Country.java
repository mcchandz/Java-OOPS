package constructorandarrays;

public class Country {
	public static void main(String[] args) {
		Countries[] c = new Countries[4];
		
		c[0] = new Countries("Russia", 120000000);
		c[1] = new Countries("China", 130000000);
		c[2] = new Countries("India", 141000000);
		c[3] = new Countries("USA", 140000000);
		
		Countries max = c[0];

		for(int i=0;i<c.length;i++) {
			if(c[i].pop > max.pop) {
				max = c[i];
			}
		}
		System.out.println("Country with highest population is: "+max.name);
	}
}
class Countries{
	String name;
	long pop;
	
	Countries(String name, long pop){
		this.name = name;
		this.pop = pop;
	}
}
