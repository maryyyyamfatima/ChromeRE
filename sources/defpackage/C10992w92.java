package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10992w92 extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0 {
    public final /* synthetic */ C11335x92 a;

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        C11335x92 c11335x92 = this.a;
        c11335x92.j.c(this);
        c11335x92.b();
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        C11335x92 c11335x92 = this.a;
        c11335x92.j.c(this);
        c11335x92.onError(th);
    }

    public C10992w92(C11335x92 c11335x92) {
        this.a = c11335x92;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }
}
