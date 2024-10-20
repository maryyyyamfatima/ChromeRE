package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9748sZ extends AtomicReference implements InterfaceC10434uZ, InterfaceC6416iq0, Runnable {
    public final InterfaceC10434uZ a;
    public final AbstractC10422uW2 g;
    public Throwable h;

    public RunnableC9748sZ(InterfaceC10434uZ interfaceC10434uZ, AbstractC10422uW2 abstractC10422uW2) {
        this.a = interfaceC10434uZ;
        this.g = abstractC10422uW2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0)) {
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.h = th;
        EnumC7791mq0.c(this, this.g.c(this));
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        EnumC7791mq0.c(this, this.g.c(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.h;
        InterfaceC10434uZ interfaceC10434uZ = this.a;
        if (th != null) {
            this.h = null;
            interfaceC10434uZ.onError(th);
        } else {
            interfaceC10434uZ.b();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.a);
    }
}
