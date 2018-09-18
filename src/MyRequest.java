import java.io.IOException;
import java.io.InputStream;

//ͨ����������HTTPЭ����н������õ�HTTP����ͷ�ķ����Լ�URL

public class MyRequest {
		private String url;
		private String method;
		
		public MyRequest(InputStream inputStream) throws IOException{
			String httpRequest = "";
			byte[] httpRequestBytes = new byte[1024];
			int length = 0;
			if((length = inputStream.read(httpRequestBytes)) > 0) {
				httpRequest = new String(httpRequestBytes,0,length);
			}
			String httpHead = httpRequest.split("\n")[0];
			url = httpHead.split("\\s")[1];
			method = httpHead.split("\\s")[0];
			System.out.println(this);
		}

		public Object getMethod() {
			return method;
		}
		public Object getUrl() {
			return url;
		}


}
