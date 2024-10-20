package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mc4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7711mc4 {
    public final int a;
    public final Class b;
    public final int c;
    public final int d;

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public abstract boolean f(Object obj, Object obj2);

    public AbstractC7711mc4(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    public final Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.c) {
            return b(view);
        }
        Object tag = view.getTag(this.a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void e(View view, Object obj) {
        O0 o0;
        if (Build.VERSION.SDK_INT >= this.c) {
            c(view, obj);
            return;
        }
        if (f(d(view), obj)) {
            View.AccessibilityDelegate d = Ec4.d(view);
            if (d == null) {
                o0 = null;
            } else if (d instanceof N0) {
                o0 = ((N0) d).a;
            } else {
                o0 = new O0(d);
            }
            if (o0 == null) {
                o0 = new O0();
            }
            Ec4.m(view, o0);
            view.setTag(this.a, obj);
            Ec4.g(view, this.d);
        }
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }
}
