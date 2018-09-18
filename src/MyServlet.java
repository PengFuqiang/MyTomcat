
//提供Servlet
//Servlet常见的doGet/doPost/service方法
public abstract  class MyServlet {
	public abstract void doGet(MyRequest myRequest,MyResponse myResponse);
	
	public abstract void doPost(MyRequest myRequest,MyResponse myResponse);
	
	public void service(MyRequest myRequest,MyResponse myResponse) {
		if(myRequest.getMethod().equals("POST")) {
			doPost(myRequest,myResponse);
		}else if(myRequest.getMethod().equals("GET")) {
			doGet(myRequest,myResponse);
		}
	}

}
