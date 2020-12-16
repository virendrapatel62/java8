package java8.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EncryptDecryptConsumer {
	
	public EncryptDecryptConsumer() {
		
	}
	
	public java.util.List<String> encrypt(List<String> list){
		List<String > encrypted = new ArrayList<String>();
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				final StringBuilder builder = new StringBuilder();
				for (char  c : t.toCharArray()) {
					builder.append(((char)(c+10))+"");
				}
				encrypted.add(builder.toString());
			}
		});
		
		return encrypted;
		
	}
	
	public java.util.List<String> decrypt(List<String> list){
		List<String > decrypted = new ArrayList<String>();
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				final StringBuilder builder = new StringBuilder();
				for (char  c : t.toCharArray()) {
					builder.append(((char)(c-10))+"");
				}
				decrypted.add(builder.toString());
			}
		});
		
		return decrypted;
		
	}

}
