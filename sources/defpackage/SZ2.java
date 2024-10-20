package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class SZ2 implements TZ2 {
    public final LF1 a;

    @Override // defpackage.TZ2
    public abstract String a();

    public abstract String c();

    public abstract String d();

    public abstract AbstractC1472Li1 e();

    public abstract AbstractC1472Li1 f();

    public abstract AbstractC1472Li1 g();

    public abstract AbstractC1472Li1 h();

    public abstract String i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean n(int i);

    public SZ2(LF1 lf1) {
        this.a = lf1;
    }

    public boolean l() {
        return m(this.a, c(), g());
    }

    public static boolean m(LF1 lf1, String str, AbstractC1472Li1 abstractC1472Li1) {
        lf1.getClass();
        String b = LF1.b();
        if (str.equals(b)) {
            return true;
        }
        if (TextUtils.isEmpty(b)) {
            return abstractC1472Li1.contains(LF1.c().getID()) && str.equals(LF1.a());
        }
        return false;
    }
}
