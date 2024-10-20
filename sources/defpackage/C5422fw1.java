package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5422fw1 extends AtomicReference implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11303x40 a;
    public final InterfaceC11303x40 g;
    public final H4 h;
    public final InterfaceC11303x40 i;

    public C5422fw1(InterfaceC11303x40 interfaceC11303x40) {
        QV0 qv0 = TV0.e;
        MV0 mv0 = TV0.c;
        NV0 nv0 = TV0.d;
        this.a = interfaceC11303x40;
        this.g = qv0;
        this.h = mv0;
        this.i = nv0;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0)) {
            try {
                this.i.accept(this);
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                interfaceC6416iq0.dispose();
                onError(th);
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (a()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            ((InterfaceC6416iq0) get()).dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (!a()) {
            lazySet(EnumC7791mq0.a);
            try {
                this.g.accept(th);
                return;
            } catch (Throwable th2) {
                AbstractC4148cE0.a(th2);
                MR2.b(new M10(th, th2));
                return;
            }
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (a()) {
            return;
        }
        lazySet(EnumC7791mq0.a);
        try {
            this.h.run();
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this);
    }

    public final boolean a() {
        return get() == EnumC7791mq0.a;
    }
}
