package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ml3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618Ml3 extends C1748Nl3 {
    public final boolean g;

    public C1618Ml3(Drawable drawable, boolean z) {
        super(drawable);
        this.g = z;
    }

    @Override // defpackage.C1748Nl3
    public final Drawable a(Context context, Resources resources) {
        int a;
        Drawable a2 = super.a(context, resources);
        if (a2 == null) {
            return null;
        }
        int b = Ge4.b(context, 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(b, b, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float width = canvas.getWidth() * 0.5f;
        Paint paint = new Paint();
        if (!this.g) {
            a = AbstractC10957w33.a(context);
        } else {
            a = context.getColor(R.color.f26840_resource_name_obfuscated_res_0x7f0708ab);
        }
        paint.setColor(a);
        paint.setAntiAlias(true);
        canvas.drawCircle(width, width, width, paint);
        int width2 = canvas.getWidth();
        int b2 = Ge4.b(context, 20.0f);
        int i = (width2 - b2) / 2;
        int i2 = b2 + i;
        a2.setBounds(i, i, i2, i2);
        a2.draw(canvas);
        return new BitmapDrawable(resources, createBitmap);
    }
}
