package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IN3 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public static IN3 m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new IN3(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public IN3(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final Drawable e(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return AbstractC2884Wf.a(this.a, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public final Drawable f(int i) {
        int resourceId;
        Drawable f;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C1195Jf a = C1195Jf.a();
        Context context = this.a;
        synchronized (a) {
            f = a.a.f(resourceId, context, true);
        }
        return f;
    }

    public final Typeface g(int i, int i2, C7042kg c7042kg) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal threadLocal = GP2.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return GP2.c(context, resourceId, typedValue, i2, c7042kg, true, false);
    }

    public final CharSequence k(int i) {
        return this.b.getText(i);
    }

    public final String j(int i) {
        return this.b.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int h(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final ColorStateList b(int i) {
        int resourceId;
        ColorStateList b;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = Y50.b(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : b;
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int i(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final boolean l(int i) {
        return this.b.hasValue(i);
    }

    public final void n() {
        this.b.recycle();
    }
}
