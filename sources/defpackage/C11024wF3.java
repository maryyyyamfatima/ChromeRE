package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11024wF3 implements InterfaceC1702Nc2 {
    public final /* synthetic */ C11367xF3 a;

    public /* synthetic */ C11024wF3(C11367xF3 c11367xF3) {
        this.a = c11367xF3;
    }

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        C11367xF3 c11367xF3 = this.a;
        if (af3.d) {
            c11367xF3.cancel(false);
            return;
        }
        if (af3.l()) {
            c11367xF3.t(af3.k());
            return;
        }
        Exception j = af3.j();
        if (j != null) {
            c11367xF3.u(j);
            return;
        }
        throw new IllegalStateException();
    }
}
