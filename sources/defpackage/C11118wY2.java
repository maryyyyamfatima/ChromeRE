package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wY2 */
/* loaded from: classes.dex */
public final class C11118wY2 extends TZ {
    public C11461xY2 i;
    public final String[] j = {"children", "commandResolver", "conversionContext", "flexDirection", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollableContainerType"};
    public final BitSet k = new BitSet(9);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C11461xY2) wz;
    }

    public final void w(EnumC8151ns4 enumC8151ns4) {
        this.i.D = enumC8151ns4;
    }

    public final void x(EnumC8151ns4 enumC8151ns4) {
        this.i.E = enumC8151ns4;
    }

    public final void y(EnumC10552us4 enumC10552us4) {
        this.i.K = enumC10552us4;
    }

    public final void z(Bs4 bs4) {
        this.i.P = bs4;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(9, this.k, this.j);
        return this.i;
    }
}
