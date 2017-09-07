/**
 * This is a main class
 */
public class Application {

	/**
	 * Entry-Point method
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		System.out.println(echo("hello world"));		
	}
	
	/**
     * Return the same message
     * @param msg This Student's new name.  
     * @return echo message
     */
	public static String echo(String msg) {
		return msg;
	}
}
