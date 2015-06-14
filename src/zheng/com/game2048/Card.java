/**
 * 
 */
package zheng.com.game2048;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * @author michael
 *
 */
public class Card extends FrameLayout {

	/**
	 * @param context
	 */
	public Card(Context context) {
		super(context);
		
		label = new TextView(context);
		label.setTextSize(32);
		
		LayoutParams layoutParams = new LayoutParams(-1, -1);
		addView(label, layoutParams);
		
		setNum(0);
		
	}
	
	private int num = 0;
	private TextView label;
	
	public int getNum(){
		return this.num;
	}
	
	public void setNum(int num){
		this.num = num;
		
		this.label.setText(num+"");
		
	}
	public boolean equals(Card card){
		return this.getNum() == card.getNum();
	}
	
}
