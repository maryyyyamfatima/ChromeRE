package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Et0 */
/* loaded from: classes.dex */
public final class C0616Et0 extends WZ {
    public final Drawable D;
    public int E;
    public int F;

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 2;
    }

    public C0616Et0(Drawable drawable) {
        super("DrawableComponent");
        this.D = drawable;
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        this.E = interfaceC3331Zq1.getWidth();
        this.F = interfaceC3331Zq1.getHeight();
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new LM1();
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        LM1 lm1 = (LM1) obj;
        Drawable drawable = lm1.a;
        Drawable drawable2 = this.D;
        if (drawable == drawable2) {
            return;
        }
        if (drawable != null) {
            lm1.c(false, false);
            lm1.a.setCallback(null);
        }
        lm1.a = drawable2;
        if (drawable2 != null) {
            lm1.c(lm1.isVisible(), false);
            lm1.a.setCallback(lm1);
        }
        lm1.g = lm1.a instanceof InsetDrawable;
        lm1.invalidateSelf();
    }

    @Override // defpackage.AbstractC10593v00
    public final void x(C7849n00 c7849n00, Object obj) {
        int i = this.E;
        int i2 = this.F;
        Drawable drawable = ((LM1) obj).a;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.AbstractC10593v00
    public final void d(C7849n00 c7849n00, Object obj) {
        x(c7849n00, obj);
    }

    @Override // defpackage.AbstractC10593v00
    public final void t(C7849n00 c7849n00, Object obj) {
        H(c7849n00, obj);
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        LM1 lm1 = (LM1) obj;
        if (lm1.a != null) {
            lm1.c(false, false);
            lm1.a.setCallback(null);
        }
        lm1.a = null;
        lm1.g = false;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        return !AbstractC2955Wt0.a(((C0616Et0) wz).D, ((C0616Et0) wz2).D);
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || C0616Et0.class != wz.getClass()) {
            return false;
        }
        return AbstractC2955Wt0.a(this.D, ((C0616Et0) wz).D);
    }
}
