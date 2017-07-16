import com.sun.jna.Library;
import com.sun.jna.Native;

//interface hello extends Library {
interface HelloLib extends Library {
	HelloLib INSTANCE = (HelloLib) Native.loadLibrary("Hello.dll", HelloLib.class);
	void Hello();
}

public class Hello_Java {
	public static void main(String[] args) {
		System.out.println("�Ăяo�����Hello_Java�����o��\n");

		HelloLib hello = HelloLib.INSTANCE;
		hello.Hello();
  }
}