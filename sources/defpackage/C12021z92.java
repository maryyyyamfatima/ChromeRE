package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12021z92 extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0 {
    public final /* synthetic */ A92 a;

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        A92 a92 = this.a;
        a92.j.c(this);
        a92.b();
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        A92 a92 = this.a;
        a92.j.c(this);
        a92.onError(th);
    }

    public C12021z92(A92 a92) {
        this.a = a92;
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
