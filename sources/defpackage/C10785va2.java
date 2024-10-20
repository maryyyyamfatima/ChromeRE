package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: va2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10785va2 implements InterfaceC11128wa2 {
    public final C10442ua2 a;

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this.a.i, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        C10442ua2 c10442ua2 = this.a;
        EnumC7791mq0.a(c10442ua2.h);
        c10442ua2.a.onError(th);
    }

    public C10785va2(C10442ua2 c10442ua2) {
        this.a = c10442ua2;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        this.a.lazySet(obj);
    }
}
