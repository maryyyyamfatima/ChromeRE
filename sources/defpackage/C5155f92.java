package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5155f92 extends AtomicReference implements InterfaceC9277r92, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;

    public C5155f92(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    public final void c(Object obj) {
        if (a()) {
            return;
        }
        this.a.d(obj);
    }

    public final void b(Throwable th) {
        boolean z;
        if (a()) {
            z = false;
        } else {
            try {
                this.a.onError(th);
                EnumC7791mq0.a(this);
                z = true;
            } catch (Throwable th2) {
                EnumC7791mq0.a(this);
                throw th2;
            }
        }
        if (z) {
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    public final boolean a() {
        return EnumC7791mq0.b((InterfaceC6416iq0) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", C5155f92.class.getSimpleName(), super.toString());
    }
}
