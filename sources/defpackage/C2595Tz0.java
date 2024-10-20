package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2595Tz0 implements InterfaceC1871Ok1 {
    public final boolean a;

    @Override // defpackage.InterfaceC1871Ok1
    public final E52 d() {
        return null;
    }

    public C2595Tz0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.InterfaceC1871Ok1
    public final boolean c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
