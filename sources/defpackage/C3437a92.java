package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3437a92 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC1314Kc3 a;
    public final RV0 g;
    public final Object h;
    public InterfaceC6416iq0 i;
    public boolean j;

    public C3437a92(InterfaceC1314Kc3 interfaceC1314Kc3, Object obj, RV0 rv0) {
        this.a = interfaceC1314Kc3;
        this.g = rv0;
        this.h = obj;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.i, interfaceC6416iq0)) {
            this.i = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.i.dispose();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.j) {
            return;
        }
        try {
            RV0 rv0 = this.g;
            Object obj2 = this.h;
            rv0.getClass();
            ((Map) obj2).put(rv0.b.apply(obj), rv0.a.apply(obj));
        } catch (Throwable th) {
            this.i.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.j) {
            MR2.b(th);
        } else {
            this.j = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.a.a(this.h);
    }
}
