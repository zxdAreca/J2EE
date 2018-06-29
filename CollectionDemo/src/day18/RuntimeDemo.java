package day18;

public class RuntimeDemo {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		//r.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");
		Process p = r.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");
		Process d = r.exec("C:\\Users\\Administrator\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories SystemDemo.java");
		//下面的找不到程序的时候会抛出java.io.IOException
		//Process d = r.exec("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Notepad++");
		//杀死进程SystemDemo.java
		Thread.sleep(4000);
		
		p.destroy();
		
	}

}  
