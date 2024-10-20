package defpackage;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ua2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10442ua2 extends AtomicReference implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final C0506Dx0 g;
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();

    public C10442ua2(C7532m43 c7532m43, C0506Dx0 c0506Dx0) {
        this.a = c7532m43;
        this.g = c0506Dx0;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this.h, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Pair a = this.g.a(obj, obj2);
                Q82.a(a, "The combiner returned a null value");
                interfaceC11128wa2.d(a);
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                dispose();
                interfaceC11128wa2.onError(th);
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        EnumC7791mq0.a(this.i);
        this.a.onError(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        EnumC7791mq0.a(this.i);
        this.a.b();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this.h);
        EnumC7791mq0.a(this.i);
    }
}
