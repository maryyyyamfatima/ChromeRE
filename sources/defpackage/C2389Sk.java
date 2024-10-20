package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sk */
/* loaded from: classes.dex */
public final class C2389Sk extends AbstractC0185Bl {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ C2649Uk i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return Boolean.valueOf(this.i.q != this.h);
    }

    public C2389Sk(C2649Uk c2649Uk, boolean z) {
        this.i = c2649Uk;
        this.h = z;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        InterfaceC2519Tk interfaceC2519Tk;
        C2649Uk c2649Uk = this.i;
        c2649Uk.q = this.h;
        if (!((Boolean) obj).booleanValue() || (interfaceC2519Tk = c2649Uk.a) == null) {
            return;
        }
        interfaceC2519Tk.b();
    }
}
