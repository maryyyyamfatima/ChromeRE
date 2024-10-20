package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820Oa0 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;

    public C1820Oa0(C0327Cn1 c0327Cn1) {
        MM3 mm3 = LM3.a;
        OM3 om3 = NM3.a;
        this.a = c0327Cn1;
        this.b = mm3;
        this.c = om3;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return new C1690Na0((Context) this.a.get(), (InterfaceC4919eV) this.b.get(), (InterfaceC4919eV) this.c.get());
    }
}
