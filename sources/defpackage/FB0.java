package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FB0 {
    public final boolean a;
    public final boolean b;

    public FB0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FB0)) {
            return false;
        }
        FB0 fb0 = (FB0) obj;
        return this.a == fb0.a && this.b == fb0.b;
    }
}
