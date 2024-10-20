package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Hq4 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;
    public final InterfaceC9989tE2 d;

    public Hq4(InterfaceC9989tE2 interfaceC9989tE2, InterfaceC9989tE2 interfaceC9989tE22, PW2 pw2, InterfaceC9989tE2 interfaceC9989tE23) {
        this.a = interfaceC9989tE2;
        this.b = interfaceC9989tE22;
        this.c = pw2;
        this.d = interfaceC9989tE23;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return new Gq4((Executor) this.a.get(), (InterfaceC11011wD0) this.b.get(), (Jq4) this.c.get(), (InterfaceC2828Vt3) this.d.get());
    }
}
