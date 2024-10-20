package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195Jf {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static C1195Jf c;
    public C9701sP2 a;

    public static synchronized void d() {
        synchronized (C1195Jf.class) {
            if (c == null) {
                C1195Jf c1195Jf = new C1195Jf();
                c = c1195Jf;
                c1195Jf.a = C9701sP2.d();
                C9701sP2 c9701sP2 = c.a;
                C1065If c1065If = new C1065If();
                synchronized (c9701sP2) {
                    c9701sP2.g = c1065If;
                }
            }
        }
    }

    public static synchronized C1195Jf a() {
        C1195Jf c1195Jf;
        synchronized (C1195Jf.class) {
            if (c == null) {
                d();
            }
            c1195Jf = c;
        }
        return c1195Jf;
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.g(context, i);
    }

    public static void e(Drawable drawable, GN3 gn3, int[] iArr) {
        PorterDuff.Mode mode = C9701sP2.h;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC3085Xt0.a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = gn3.d;
            if (z || gn3.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? gn3.a : null;
                PorterDuff.Mode mode2 = gn3.c ? gn3.b : C9701sP2.h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilter = C9701sP2.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (C1195Jf.class) {
            h = C9701sP2.h(i, mode);
        }
        return h;
    }
}
