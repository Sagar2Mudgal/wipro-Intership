
public class Prime10Tp99 {
     	public static void main(String[] args) {
			int flag;
			for(int i = 10; i <= 99; i++) {
				flag = 1;
				for(int j = 2; j <= i/2; j++) {
					if(i % j == 0) {
						flag = 0;
						break;
					}
				}
				if(flag == 1) {
					System.out.print(i+" ");
				}
			}
		}

}
