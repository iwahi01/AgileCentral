import com.sun.jna.Library;
import com.sun.jna.Native;

//interface hello extends Library {
interface HelloLib extends Library {
	HelloLib INSTANCE = (HelloLib) Native.loadLibrary("Hello.dll", HelloLib.class);
	int Hello(int val);
}

public class Hello_Java {
	public static void main(String[] args) {
		System.out.println("呼び出し元｢Hello_Java｣から出力\n");
//Update for DE1
		HelloLib hello = HelloLib.INSTANCE;
		int val = hello.Hello(99);
		System.out.println("呼び出し先｢Hello｣からの戻り値=" + val + "\n");
  }
}