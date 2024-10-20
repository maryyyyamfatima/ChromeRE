package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PW2 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;
    public final InterfaceC9989tE2 d;

    public PW2(InterfaceC9989tE2 interfaceC9989tE2, InterfaceC9989tE2 interfaceC9989tE22, OW2 ow2) {
        OM3 om3 = NM3.a;
        this.a = interfaceC9989tE2;
        this.b = interfaceC9989tE22;
        this.c = ow2;
        this.d = om3;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        Context context = (Context) this.a.get();
        InterfaceC11011wD0 interfaceC11011wD0 = (InterfaceC11011wD0) this.b.get();
        C0460Do c0460Do = (C0460Do) this.c.get();
        return new C11927yt1(context, interfaceC11011wD0, c0460Do);
    }
}
