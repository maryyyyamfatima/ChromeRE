package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WF0 {
    public final Object a;
    public final int b;

    public WF0(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WF0)) {
            return false;
        }
        WF0 wf0 = (WF0) obj;
        return this.a == wf0.a && this.b == wf0.b;
    }
}
