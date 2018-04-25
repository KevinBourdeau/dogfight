package jpu2016.dogfight.controller;

public abstract class DogfightController implements IOrderPerformer {

		private static int TIMESLEEP = 30;
	
		public static int getTIMESLEEP() {
			return TIMESLEEP;
		}



		public static void setTIMESLEEP(int tIMESLEEP) {
			TIMESLEEP = tIMESLEEP;
		}
		
		public void setViewSystem(IViewsystem viewSystem){
			
		}
		
		public void play(){
			
		}
		

	@Override
	public void orderPerform(userOrder UserOrder) {
		
		
	}
	
	private void lauchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}

	public DogfightController(IDofightModel dogfightModel){
		
	}
	
	
}
