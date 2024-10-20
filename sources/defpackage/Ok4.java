package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ok4 extends AbstractC0185Bl {
    public long h;
    public long i;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        long j = this.h;
        long j2 = this.i;
        EI2.m(Math.min(1000, Math.max(-1000, (int) (((j / 1048576) / 10) * 10))), "WebApk.Install.AvailableSpace.Fail");
        EI2.m(Math.min(1000, Math.max(-1000, (int) ((((j + j2) / 1048576) / 10) * 10))), "WebApk.Install.AvailableSpaceAfterFreeUpCache.Fail");
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        this.h = Pk4.a();
        this.i = Pk4.b(V60.a.getCacheDir());
        return null;
    }
}
