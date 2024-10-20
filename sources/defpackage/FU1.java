package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FU1 extends HF {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Runnable h;
    public final /* synthetic */ GU1 i;

    @Override // defpackage.HF
    public final void c() {
        this.i.n = 1;
    }

    public FU1(GU1 gu1, boolean z, Runnable runnable) {
        this.i = gu1;
        this.g = z;
        this.h = runnable;
    }

    @Override // defpackage.HF
    public final void b() {
        int i = this.g ? 2 : 0;
        GU1 gu1 = this.i;
        gu1.n = i;
        this.h.run();
        gu1.m = null;
    }
}
