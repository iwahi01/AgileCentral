import com.sun.jna.Library;
import com.sun.jna.Native;

//interface hello extends Library {
interface HelloLib extends Library {
	HelloLib INSTANCE = (HelloLib) Native.loadLibrary("Hello.dll", HelloLib.class);
	void Hello();
}

public class Hello_Java {
	public static void main(String[] args) {
		System.out.println("呼び出し元｢Hello_Java｣から出力\n");
//Update for oDE1
		HelloLib hello = HelloLib.INSTANCE;
		hello.Hello();
  }
}