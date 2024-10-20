package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fH3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5197fH3 extends TZ {
    public C5885hH3 i;
    public final String[] j = {"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
    public final BitSet k = new BitSet(7);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C5885hH3) wz;
    }

    public final void w(Integer num) {
        this.i.N = num;
    }

    public final void x(float f) {
        this.i.O = this.a.a(f);
    }

    public final void y(float f) {
        this.i.P = this.a.a(f);
    }

    public final void z(float f) {
        this.i.Q = this.a.a(f);
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(7, this.k, this.j);
        return this.i;
    }
}
