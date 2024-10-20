package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GO implements GC {
    public Runnable a;
    public final /* synthetic */ HO g;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    public GO(HO ho) {
        this.g = ho;
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        if (this.a == null || !HC.a(this.g.h)) {
            return;
        }
        this.a.run();
        this.a = null;
    }
}
