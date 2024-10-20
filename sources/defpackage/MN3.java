package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextPaint;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MN3 {
    public final int a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    public MN3(Context context, boolean z) {
        Resources resources = context.getResources();
        int defaultColor = Y50.b(context, z ? R.color.f17230_resource_name_obfuscated_res_0x7f0700d8 : R.color.f17220_resource_name_obfuscated_res_0x7f0700d7).getDefaultColor();
        float dimension = resources.getDimension(R.dimen.f29590_resource_name_obfuscated_res_0x7f080120);
        boolean z2 = resources.getBoolean(R.bool.f15400_resource_name_obfuscated_res_0x7f060002);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(defaultColor);
        textPaint.setTextSize(dimension);
        textPaint.setFakeBoldText(z2);
        textPaint.density = resources.getDisplayMetrics().density;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float ceil = (float) Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.e = ceil;
        this.f = -fontMetrics.top;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f29580_resource_name_obfuscated_res_0x7f08011f);
        this.c = dimensionPixelSize;
        this.d = (int) Math.max(dimensionPixelSize, ceil);
        int max = (int) (Math.max(resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels) * 1.0f);
        this.a = max;
        this.c = Math.min(max, dimensionPixelSize);
    }
}
