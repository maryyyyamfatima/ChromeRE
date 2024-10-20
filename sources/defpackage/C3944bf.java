package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bf */
/* loaded from: classes.dex */
public final class C3944bf {
    public final View a;
    public GN3 d;
    public GN3 e;
    public GN3 f;
    public int c = -1;
    public final C1195Jf b = C1195Jf.a();

    public C3944bf(View view) {
        this.a = view;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = JG2.g1;
        IN3 m = IN3.m(context, attributeSet, iArr, i);
        View view2 = this.a;
        Ec4.l(view2, view2.getContext(), iArr, attributeSet, m.b, i, 0);
        try {
            if (m.l(0)) {
                this.c = m.i(0, -1);
                C1195Jf c1195Jf = this.b;
                Context context2 = view.getContext();
                int i3 = this.c;
                synchronized (c1195Jf) {
                    i2 = c1195Jf.a.i(context2, i3);
                }
                if (i2 != null) {
                    g(i2);
                }
            }
            if (m.l(1)) {
                view.setBackgroundTintList(m.b(1));
            }
            if (m.l(2)) {
                view.setBackgroundTintMode(AbstractC3085Xt0.c(m.h(2, -1), null));
            }
        } finally {
            m.n();
        }
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        C1195Jf c1195Jf = this.b;
        if (c1195Jf != null) {
            Context context = this.a.getContext();
            synchronized (c1195Jf) {
                colorStateList = c1195Jf.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new GN3();
        }
        GN3 gn3 = this.e;
        gn3.a = colorStateList;
        gn3.d = true;
        a();
    }

    public final ColorStateList b() {
        GN3 gn3 = this.e;
        if (gn3 != null) {
            return gn3.a;
        }
        return null;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new GN3();
        }
        GN3 gn3 = this.e;
        gn3.b = mode;
        gn3.c = true;
        a();
    }

    public final PorterDuff.Mode c() {
        GN3 gn3 = this.e;
        if (gn3 != null) {
            return gn3.b;
        }
        return null;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z = false;
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new GN3();
                }
                GN3 gn3 = this.f;
                gn3.a = null;
                gn3.d = false;
                gn3.b = null;
                gn3.c = false;
                WeakHashMap weakHashMap = Ec4.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    gn3.d = true;
                    gn3.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    gn3.c = true;
                    gn3.b = backgroundTintMode;
                }
                if (gn3.d || gn3.c) {
                    C1195Jf.e(background, gn3, view.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            GN3 gn32 = this.e;
            if (gn32 != null) {
                C1195Jf.e(background, gn32, view.getDrawableState());
                return;
            }
            GN3 gn33 = this.d;
            if (gn33 != null) {
                C1195Jf.e(background, gn33, view.getDrawableState());
            }
        }
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new GN3();
            }
            GN3 gn3 = this.d;
            gn3.a = colorStateList;
            gn3.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
