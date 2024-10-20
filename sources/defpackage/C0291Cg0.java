package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291Cg0 implements InterfaceC8030nY1 {
    public final C0031Ag0 a;

    public C0291Cg0(C0031Ag0 c0031Ag0) {
        this.a = c0031Ag0;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        return new C7686mY1(new R82(obj), new C12191zg0(obj.toString(), this.a));
    }

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
