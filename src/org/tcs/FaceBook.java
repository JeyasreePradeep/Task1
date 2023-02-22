package org.tcs;
public class FaceBook {
	private void fbUrl(String name) {
		System.out.println("Fb url is "+name);
		System.out.println("facebook updated");
	}
	
	private void fbLogin(String id, String pWord) {
		System.out.println("user id is" +id);
		System.out.println("passWord is "+pWord);
	}
	public static void main(String[] args) {
		FaceBook f=new FaceBook();
		f.fbUrl("www.facebook.com");
		f.fbLogin("jeyasree", "sree");
	}
}
