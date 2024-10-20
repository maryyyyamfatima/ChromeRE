package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uy1 */
/* loaded from: classes.dex */
public final class C2721Uy1 extends TZ {
    public C2981Wy1 i;
    public final String[] j = {"componentCallable"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C2981Wy1) wz;
    }

    public final void w(InterfaceC7161l00 interfaceC7161l00) {
        this.i.D = interfaceC7161l00;
        this.k.set(0);
    }

    public final void x(U80 u80) {
        this.i.E = u80;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
