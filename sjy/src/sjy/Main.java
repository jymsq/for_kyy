package sjy;

public class Main {
	public static void main(String[] args) throws Exception {
		database data=new database();
		FGUI f=new FGUI(data.Get_Statement());
		f.run();
	}
}
