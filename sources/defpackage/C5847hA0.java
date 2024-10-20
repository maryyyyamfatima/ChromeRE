package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5847hA0 extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0 {
    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        lazySet(EnumC7791mq0.a);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        lazySet(EnumC7791mq0.a);
        MR2.b(new C2222Rc2(th));
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }
}
