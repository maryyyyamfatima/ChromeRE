package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g94 */
/* loaded from: classes.dex */
public final class C5501g94 extends TZ {
    public C6531j94 i;
    public final String[] j = {"aspectRatio", "conductor", "duploUiManagerFactory", "loggerCoordinatorFactory", "options", "preloaderProvider", "surfaceScopeDependencyProvider", "tracer", "transitionCoordinator", "type", "videoPlayerFactory"};
    public final BitSet k = new BitSet(11);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C6531j94) wz;
    }

    @Override // defpackage.TZ
    /* renamed from: w */
    public final void b(float f) {
        super.b(f);
        this.i.D = f;
        this.k.set(0);
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(11, this.k, this.j);
        return this.i;
    }
}
