package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FO implements InterfaceC3657ao2 {
    public int a = -1;
    public final /* synthetic */ HO g;

    public FO(HO ho) {
        this.g = ho;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        if (this.a == -1) {
            this.a = this.g.b();
        }
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        int i = this.a;
        if (i != -1) {
            ((C5265fV1) this.g.a).a.a.c(i);
            this.a = -1;
        }
    }
}
