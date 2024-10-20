package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4252cZ extends AtomicReference implements InterfaceC5627gZ, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;

    public C4252cZ(InterfaceC10434uZ interfaceC10434uZ) {
        this.a = interfaceC10434uZ;
    }

    public final void a() {
        InterfaceC6416iq0 interfaceC6416iq0;
        Object obj = get();
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        if (obj == enumC7791mq0 || (interfaceC6416iq0 = (InterfaceC6416iq0) getAndSet(enumC7791mq0)) == enumC7791mq0) {
            return;
        }
        try {
            this.a.b();
        } finally {
            if (interfaceC6416iq0 != null) {
                interfaceC6416iq0.dispose();
            }
        }
    }

    public final void b(Throwable th) {
        boolean z;
        InterfaceC6416iq0 interfaceC6416iq0;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        Object obj = get();
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        if (obj == enumC7791mq0 || (interfaceC6416iq0 = (InterfaceC6416iq0) getAndSet(enumC7791mq0)) == enumC7791mq0) {
            z = false;
        } else {
            try {
                this.a.onError(nullPointerException);
                z = true;
            } finally {
                if (interfaceC6416iq0 != null) {
                    interfaceC6416iq0.dispose();
                }
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

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", C4252cZ.class.getSimpleName(), super.toString());
    }
}
