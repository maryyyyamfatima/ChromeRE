package defpackage;

import android.content.Context;
import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jf0 */
/* loaded from: classes.dex */
public final class C1196Jf0 implements Closeable {
    public InterfaceC9989tE2 a = C2680Uq0.b(AbstractC5867hE0.a);
    public C0327Cn1 g;
    public InterfaceC9989tE2 h;
    public InterfaceC9989tE2 i;
    public InterfaceC9989tE2 j;

    public C1196Jf0(Context context) {
        C0327Cn1 a = C0327Cn1.a(context);
        this.g = a;
        this.h = C2680Uq0.b(new C11107wW1(a, new C1820Oa0(a)));
        InterfaceC9989tE2 b = C2680Uq0.b(new C5944hT2(new XW2(this.g)));
        this.i = b;
        OW2 ow2 = new OW2();
        C0327Cn1 c0327Cn1 = this.g;
        PW2 pw2 = new PW2(c0327Cn1, b, ow2);
        InterfaceC9989tE2 interfaceC9989tE2 = this.a;
        InterfaceC9989tE2 interfaceC9989tE22 = this.h;
        this.j = C2680Uq0.b(new C4933eX3(new C9129qk0(interfaceC9989tE2, interfaceC9989tE22, pw2, b, b), new K24(c0327Cn1, interfaceC9989tE22, b, pw2, interfaceC9989tE2, b), new Hq4(interfaceC9989tE2, b, pw2, b)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: b */
    public final void close() {
        ((C5600gT2) ((InterfaceC11011wD0) this.i.get())).close();
    }
}
