package br.com.douglas.teste.view.personalizada;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Douglas on 24/09/2017.
 */

public class MinhaView extends View {
    private Paint pincelVermelho;
    private Paint pincelPreto;

    public MinhaView(Context context) {

        this(context, null);
    }

    public MinhaView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.LTGRAY);
        pincelVermelho = new Paint();
        pincelVermelho.setARGB(255, 255, 0, 0);

        pincelPreto = new Paint();
        pincelPreto.setARGB(255, 0, 0, 0);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawRect(20, 20, 200, 200, pincelVermelho);
        canvas.drawCircle(400, 400, 100, pincelPreto);

    }
}
