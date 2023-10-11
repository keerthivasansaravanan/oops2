package week5day2;

public class Android implements Whatsapp {

		

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open whatsapp");
		
	}

	@Override
	public void enterMessage() {
		// TODO Auto-generated method stub
		System.out.println("eneter message");
		
	}

	@Override
	public void voiceCall() {
		// TODO Auto-generated method stub
		System.out.println("voice call");
		
	}

	@Override
	public void voiceNote() {
		// TODO Auto-generated method stub
		System.out.println("voice note");
		
	}
	public static void main(String[] args) {
		Android whatsapp=new Android();
		whatsapp.open();
		whatsapp.enterMessage();
		whatsapp.voiceCall();
		whatsapp.voiceNote();

}
}
