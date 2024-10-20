package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Zn4 implements B84 {
    public abstract String c();

    public abstract boolean e(String str);

    @Override // defpackage.B84
    public final MC2 h(String str) {
        return MC2.c(Boolean.valueOf(e(str)));
    }

    @Override // defpackage.B84
    public final boolean d(String str) {
        return e(str);
    }

    @Override // defpackage.B84
    public final String a(String str) {
        return e(str) ? c() : str;
    }

    @Override // defpackage.B84
    public final boolean b(String str) {
        return e(str);
    }
}
