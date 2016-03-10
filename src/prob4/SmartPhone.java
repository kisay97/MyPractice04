package prob4;

public class SmartPhone extends MusicPhone{

	@Override
	public void execute(String function) {
		if(function.equals("음악"))
			playMusic();
		else if(function.equals("통화"))
			call();
		else if(function.equals("앱"))
			playApp();
	}
	
	private void playMusic(){
		System.out.println("다운로드해서 음악재생");
	}
	
	private void call(){
		System.out.println("통화기능시작");
	}
	
	private void playApp(){
		System.out.println("앱실행");
	}
	
}
