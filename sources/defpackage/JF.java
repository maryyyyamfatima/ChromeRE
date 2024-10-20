package defpackage;

import android.graphics.Typeface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JF {
    public final Typeface a;
    public final PV b;
    public boolean c;

    public JF(PV pv, Typeface typeface) {
        this.a = typeface;
        this.b = pv;
    }

    public final void a(Typeface typeface) {
        if (this.c) {
            return;
        }
        QV qv = this.b.a;
        if (qv.j(typeface)) {
            qv.h(false);
        }
    }
}
