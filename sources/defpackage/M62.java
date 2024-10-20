package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class M62 {
    public K62 a;
    public CharSequence b;
    public boolean c = false;

    public abstract void b(S62 s62);

    public String c() {
        return null;
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(K62 k62) {
        if (this.a != k62) {
            this.a = k62;
            if (k62 != null) {
                k62.k(this);
            }
        }
    }

    public void a(Bundle bundle) {
        if (this.c) {
            bundle.putCharSequence("android.summaryText", this.b);
        }
        String c = c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }
}
