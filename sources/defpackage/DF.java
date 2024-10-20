package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DF extends View {
    public final int a;
    public final int g;
    public final Paint h;
    public final Paint i;
    public final int j;
    public final StaticLayout k;
    public Rect l;

    public DF(Context context) {
        super(context);
        this.a = getResources().getDimensionPixelSize(R.dimen.f38020_resource_name_obfuscated_res_0x7f080641);
        this.g = getResources().getDimensionPixelSize(R.dimen.f37940_resource_name_obfuscated_res_0x7f080639);
        this.j = getResources().getDimensionPixelSize(R.dimen.f38030_resource_name_obfuscated_res_0x7f080642);
        a();
        Paint paint = new Paint();
        this.i = paint;
        paint.setColor(getResources().getColor(R.color.f25570_resource_name_obfuscated_res_0x7f07080c));
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(getResources().getColor(android.R.color.white));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.f37950_resource_name_obfuscated_res_0x7f08063a));
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(getResources().getColor(android.R.color.white));
        textPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.f41720_resource_name_obfuscated_res_0x7f0807c9));
        this.k = new StaticLayout(getResources().getString(R.string.f83840_resource_name_obfuscated_res_0x7f140911), textPaint, this.l.width(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f = width;
        float f2 = this.l.top;
        Paint paint = this.i;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        Rect rect = this.l;
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        Rect rect2 = this.l;
        canvas.drawRect(rect2.right + 1, rect2.top, f, rect2.bottom + 1, paint);
        canvas.drawRect(0.0f, this.l.bottom + 1, f, height, paint);
        Path path = new Path();
        Rect rect3 = this.l;
        float f3 = rect3.left;
        int i = rect3.top;
        int i2 = this.g;
        path.moveTo(f3, i + i2);
        Rect rect4 = this.l;
        path.lineTo(rect4.left, rect4.top);
        Rect rect5 = this.l;
        path.lineTo(rect5.left + i2, rect5.top);
        Paint paint2 = this.h;
        canvas.drawPath(path, paint2);
        Rect rect6 = this.l;
        path.moveTo(rect6.right, rect6.top + i2);
        Rect rect7 = this.l;
        path.lineTo(rect7.right, rect7.top);
        Rect rect8 = this.l;
        path.lineTo(rect8.right - i2, rect8.top);
        canvas.drawPath(path, paint2);
        Rect rect9 = this.l;
        path.moveTo(rect9.right, rect9.bottom - i2);
        Rect rect10 = this.l;
        path.lineTo(rect10.right, rect10.bottom);
        Rect rect11 = this.l;
        path.lineTo(rect11.right - i2, rect11.bottom);
        canvas.drawPath(path, paint2);
        Rect rect12 = this.l;
        path.moveTo(rect12.left, rect12.bottom - i2);
        Rect rect13 = this.l;
        path.lineTo(rect13.left, rect13.bottom);
        Rect rect14 = this.l;
        path.lineTo(rect14.left + i2, rect14.bottom);
        canvas.drawPath(path, paint2);
        canvas.save();
        Rect rect15 = this.l;
        canvas.translate(rect15.left, rect15.bottom + this.j);
        this.k.draw(canvas);
        canvas.restore();
    }

    public final void a() {
        int width = getWidth();
        int height = getHeight();
        int i = this.a;
        this.l = new Rect((width - i) / 2, (height - i) / 2, ((width - i) / 2) + i, ((height - i) / 2) + i);
    }
}
