import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void displayAccount(Account theAccount) {
		// ��ʾһ����
		System.out.println();
		// ��ʾ�˺�
		System.out.println("Account: "+theAccount.getAccountNumber());	
		// ��ʾ������
		System.out.println("Number of Deposits: "+theAccount.getDeposits());
		// ��ʾȡ�����
		System.out.println("Number of Withdrawals: "+theAccount.getWithdrawals());
		// ��ʾ���(����С�������λ)
		System.out.println("Balance: $"+theAccount.getBalance());
	}

	public static void main(String[] args) throws IOException {
		String accountNo; // �ñ������ڴ���˺�
		double amount; // �ñ������ڴ�Ž��׵Ľ��
		
		// ����Scanner�������ڻ�ȡ�û�������
		Scanner keyboard = new Scanner(System.in);
		Account checking = new Account();
		// �������ñ���checking�������´�����Account�����ַ��ֵ��checking����
		checking.accountNo="123";
		checking.balance=500;
		// ���ö���checking��ָ��ģ����˺�����Ϊ"123"���������Ϊ500
		Account savings = new Account();
		// �������ñ���savings,�����´�����Account�����ַ��ֵ��savings����
		
		// ���ö���savings��ָ��ģ����˺�����Ϊ"456",�������Ϊ1000
		
		// ��ʾ����ȡ�û�������
		accountNo = keyboard.next();
		amount = keyboard.nextDouble();
		
		// ���û�������˺Ų���"#"
		while (!accountNo.equals("#")) {
		/*
			 * ����������Ϣ�ж϶��ĸ�Account������в�����checking����savings��,
			 * ���е���ʲô������ȡ��Ǵ�������Ϊȡ��Ǹ���Ϊ����
			 * �������ж�ִ����Ӧ�Ĳ�����������Ҫ�������
			 */
			
			
			// ��ʾ����ȡ�û�������
			accountNo = keyboard.next();
			amount = keyboard.nextDouble();
		}

		// ��ʾchecking��ָ��Ķ������Ϣ���˴��������displayAccount������
		
		
		// ��ʾsavings��ָ��Ķ������Ϣ���˴��������displayAccount������
		
	}
}
