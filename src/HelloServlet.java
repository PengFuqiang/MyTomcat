import java.io.IOException;

public class HelloServlet extends MyServlet {
	@Override
	public void doGet(MyRequest myRequest, MyResponse myResponse) {
		try {
			myResponse.write("get Servlet...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(MyRequest myRequest, MyResponse myResponse) {

		try {
			myResponse.write("post servlet...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
