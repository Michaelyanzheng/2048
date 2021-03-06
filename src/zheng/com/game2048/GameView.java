/**
 * 
 */
package zheng.com.game2048;

import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

/**
 * @author michael
 *
 */
public class GameView extends GridLayout {

	public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		
		initGameView();
	}
	
	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		initGameView();
	}
	
	public GameView(Context context) {
		super(context);
		
		initGameView();
	}
	
	private void initGameView(){
		
		setOnTouchListener(new View.OnTouchListener() {
			
			private float startX,startY;
			private float offsetX,offsetY;
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					
					startX = event.getX();
					startY = event.getY();
					
					break;

				case MotionEvent.ACTION_UP:
					offsetX = event.getX() - startX;
					offsetY = event.getY() - startY;
					if (Math.abs(offsetX) > Math.abs(offsetY)) {
						if (offsetX < -5) {
							swipeLeft();
						}else if(offsetX > 5){
							swipeRight();
						}
					}else{
						if (offsetY < -5) {
							swipeUp();
						}else if (offsetY > 5) {
							swipeDown();
						}
					}
					break;
				}
				
				return true;
			}
		});
		
	}
	
	private void swipeLeft(){
		
	}
	
	private void swipeRight(){
		
	}
	
	private void swipeUp(){
		
	}
	
	private void swipeDown(){
		
	}
}
