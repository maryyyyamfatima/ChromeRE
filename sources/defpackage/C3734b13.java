package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b13 */
/* loaded from: classes.dex */
public final class C3734b13 extends Drawable {
    public final TextPaint a;
    public final C10475ug b;
    public final DM1 c;
    public final String d;
    public final Context e;

    public C3734b13(Context context) {
        this.e = context;
        C10475ug c10475ug = new C10475ug(context, null);
        this.b = c10475ug;
        c10475ug.setTextAppearance(context, R.style.f101980_resource_name_obfuscated_res_0x7f150403);
        TextPaint paint = c10475ug.getPaint();
        this.a = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        DM1 dm1 = new DM1();
        this.c = dm1;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080222);
        S53 s53 = dm1.a.a;
        s53.getClass();
        R53 r53 = new R53(s53);
        r53.e = new C6129i(dimensionPixelSize);
        r53.f = new C6129i(dimensionPixelSize);
        r53.g = new C6129i(dimensionPixelSize);
        r53.h = new C6129i(dimensionPixelSize);
        dm1.b(new S53(r53));
        dm1.j(ColorStateList.valueOf(AbstractC10957w33.g(R.attr.0_resource_name_obfuscated_res_0x7f05013a, context)));
        this.d = "";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.c.draw(canvas);
        String str = this.d;
        int length = str.length();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        TextPaint textPaint = this.a;
        canvas.drawText(str, 0, length, centerX, centerY - ((textPaint.ascent() + textPaint.descent()) / 2.0f), (Paint) textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        int i = rect.top;
        Context context = this.e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080223) + i;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080222);
        int max = Math.max(dimensionPixelSize2, this.b.getMeasuredWidth() / 2);
        int dimensionPixelSize3 = (rect.right + max) - context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080221);
        Rect rect2 = new Rect(dimensionPixelSize3 - max, dimensionPixelSize - dimensionPixelSize2, dimensionPixelSize3 + max, dimensionPixelSize + dimensionPixelSize2);
        this.c.setBounds(rect2);
        super.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getAlpha();
    }
}
