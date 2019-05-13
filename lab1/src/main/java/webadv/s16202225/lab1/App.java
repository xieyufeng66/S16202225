package webadv.s16202225.lab1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
	App() {

	}

	public static void main(String[] args) throws IOException {
		while (true) {

			InputStreamReader inputStreamReader = null;
			BufferedReader reader = null;
			Scanner input = new Scanner(System.in);
			String correctUser;
			String correctPs;
			System.out.println("请输入用户名");
			String user = input.next();
			System.out.println("请输入密码");
			String password = input.next();
			try {
				compare(user, password);

			} catch (FileNotFoundException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static int compare(String user, String password) throws FileNotFoundException, IOException {
		InputStreamReader inputStreamReader;
		BufferedReader reader;
		String correctUser;
		String correctPs;
		password = sha256hex(password);
		FileInputStream io = new FileInputStream("a.txt");
		inputStreamReader = new InputStreamReader(io);
		reader = new BufferedReader(inputStreamReader);
		String line = null;
		int sign = 0;
		while ((line = reader.readLine()) != null) {

			correctUser = line.split(":")[0];

			correctPs = line.split(":")[1];

			if (user.equals(correctUser) && password.equals(correctPs)) {
				sign = 1;
				System.out.println("登录成功");
				break;
			}

		}
		if (sign == 0) {
			System.out.println("登录失败");
			return 0;

		}
		return 1;
	}

	public static String sha256hex(String input) {
		return DigestUtils.sha256Hex(input);
	}
}
