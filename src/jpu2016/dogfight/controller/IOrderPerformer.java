package jpu2016.dogfight.controller;
import java.io.IOException;
import jpu2016.dogfight.controller.UseOrder;

public interface IOrderPerformer {
	public void orderPerform(UserOrder userOrder) throws IOException;
		
	
}
