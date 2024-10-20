package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1748Nl3 {
    public final Integer a;
    public final int b;
    public final Bitmap c;
    public final Drawable d;
    public int e;
    public Runnable f;

    public C1748Nl3(Drawable drawable) {
        this.e = 0;
        this.d = drawable;
    }

    public C1748Nl3(Bitmap bitmap) {
        this.e = 0;
        this.c = bitmap;
        this.b = 0;
    }

    public C1748Nl3(int i, int i2) {
        this.e = 0;
        this.a = Integer.valueOf(i);
        this.b = i2;
    }

    public Drawable a(Context context, Resources resources) {
        int i = this.b;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            if (i != 0) {
                bitmapDrawable.setTintList(Y50.b(context, i));
            }
            return bitmapDrawable;
        }
        Integer num = this.a;
        if (num != null) {
            if (i == 0) {
                return AbstractC2884Wf.a(context, num.intValue());
            }
            return AbstractC8540p04.e(num.intValue(), i, context);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1748Nl3)) {
            return false;
        }
        C1748Nl3 c1748Nl3 = (C1748Nl3) obj;
        return this.b == c1748Nl3.b && Objects.equals(this.a, c1748Nl3.a) && this.c == c1748Nl3.c && this.d == c1748Nl3.d;
    }
}
