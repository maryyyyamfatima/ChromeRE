package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K24 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;
    public final InterfaceC9989tE2 d;
    public final InterfaceC9989tE2 e;
    public final InterfaceC9989tE2 f;
    public final InterfaceC9989tE2 g;

    public K24(InterfaceC9989tE2 interfaceC9989tE2, InterfaceC9989tE2 interfaceC9989tE22, InterfaceC9989tE2 interfaceC9989tE23, PW2 pw2, InterfaceC9989tE2 interfaceC9989tE24, InterfaceC9989tE2 interfaceC9989tE25) {
        MM3 mm3 = LM3.a;
        this.a = interfaceC9989tE2;
        this.b = interfaceC9989tE22;
        this.c = interfaceC9989tE23;
        this.d = pw2;
        this.e = interfaceC9989tE24;
        this.f = interfaceC9989tE25;
        this.g = mm3;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return new J24((Context) this.a.get(), (C10764vW1) this.b.get(), (InterfaceC11011wD0) this.c.get(), (Jq4) this.d.get(), (Executor) this.e.get(), (InterfaceC2828Vt3) this.f.get(), (InterfaceC4919eV) this.g.get());
    }
}
