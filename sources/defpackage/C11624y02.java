package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11624y02 {
    public final String a;
    public final boolean[] b;

    public C11624y02(String str, boolean[] zArr) {
        this.a = str;
        this.b = zArr;
    }

    public final boolean a() {
        for (boolean z : this.b) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
