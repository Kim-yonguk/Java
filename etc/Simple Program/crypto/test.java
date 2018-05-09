package crypto;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class test {

	public static void main(String[] args) {
		
		String plainText="Hello My Friend";
		
		try {
			//암호화 알고리즘을 세운다.
			SecretKey mySecret = KeyGenerator.getInstance("AES").generateKey();
			
			//키 값을 부여한 뒤에는 AES알고리즘을이용해 암호를 만든다.
			Cipher myCypherOut=Cipher.getInstance("AES");
			
			//만든 암호를 맨처음 생성한 키값으로 초기화 해준다.
			myCypherOut.init(Cipher.ENCRYPT_MODE, mySecret);
			
			//암호화 되지 않은 문자에서 각각의 바이트를 암호화해준다.
			byte[] cipherTextByte=myCypherOut.doFinal(plainText.getBytes());
			
			//그 바이트를 문자열로 바꾸어준다. => 암호그자체,즉 cipherText는 암호.
			String cipherText=new String(cipherTextByte);
			
			
			//////////////////////////////////////////////////////////
			
			
			//AES알고리즘을 이용하여 복호화를 세팅해준다.
			Cipher myCypherIn=Cipher.getInstance("AES");
			
			//이번에 만든 암호객체는 복호화 모드를 잡아준다.처음 만들어준 키값으로 복호화해줌.
			myCypherIn.init(Cipher.DECRYPT_MODE, mySecret);
			
			//복호화 문자를 만들어준다.
			String decryptText = new String(myCypherIn.doFinal(cipherTextByte));
			
			System.out.println("plainText : "+plainText);
			System.out.println("Encrypted Text : "+cipherText);
			System.out.println("Decrypted Text : "+decryptText);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
