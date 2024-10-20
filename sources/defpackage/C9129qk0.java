package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9129qk0 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;
    public final InterfaceC9989tE2 d;
    public final InterfaceC9989tE2 e;

    public C9129qk0(InterfaceC9989tE2 interfaceC9989tE2, InterfaceC9989tE2 interfaceC9989tE22, PW2 pw2, InterfaceC9989tE2 interfaceC9989tE23, InterfaceC9989tE2 interfaceC9989tE24) {
        this.a = interfaceC9989tE2;
        this.b = interfaceC9989tE22;
        this.c = pw2;
        this.d = interfaceC9989tE23;
        this.e = interfaceC9989tE24;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return new C8786pk0((Executor) this.a.get(), (C10764vW1) this.b.get(), (Jq4) this.c.get(), (InterfaceC11011wD0) this.d.get(), (InterfaceC2828Vt3) this.e.get());
    }
}
