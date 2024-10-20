package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3546aV0 {
    public final boolean a;
    public final boolean b;
    public boolean c;

    public C3546aV0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3546aV0)) {
            return false;
        }
        C3546aV0 c3546aV0 = (C3546aV0) obj;
        return this.a == c3546aV0.a && this.b == c3546aV0.b;
    }

    public final String toString() {
        return "FullscreenOptions(showNavigationBar=" + this.a + ",showStatusBar=" + this.b + ", canceled=" + this.c + ")";
    }
}
