package com.example.viewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;


public class InvalidTextView extends androidx.appcompat.widget.AppCompatTextView {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public InvalidTextView(Context context){
        super(context);
        initDraw();
    }

    public InvalidTextView(Context context, AttributeSet attrs){
        super(context,attrs);
        initDraw();
    }

    public InvalidTextView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        initDraw();
    }

    private void initDraw(){
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1.5f);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        canvas.drawLine(0, height / 2, width,height / 2,paint);
    }
}
