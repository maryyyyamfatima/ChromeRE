package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7850n01 implements InterfaceC5131f52 {
    public final boolean a;

    @Override // defpackage.InterfaceC5131f52
    public final void b(InterfaceC4787e52 interfaceC4787e52) {
    }

    @Override // defpackage.InterfaceC5131f52
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.InterfaceC5131f52
    public final void j(InterfaceC4787e52 interfaceC4787e52) {
    }

    public C7850n01() {
        boolean g = AX.e().g("force-enable-night-mode");
        this.a = g;
        Cif.m(g ? 2 : 1);
    }

    @Override // defpackage.InterfaceC5131f52
    public final boolean h() {
        return this.a;
    }
}
