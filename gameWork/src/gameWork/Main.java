package gameWork;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new GamerLogger());
		gamerManager.add();
		gamerManager.delete();

	}

}
