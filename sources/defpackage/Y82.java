package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y82 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final RV0 g;
    public final Object h;
    public InterfaceC6416iq0 i;
    public boolean j;

    public Y82(InterfaceC11128wa2 interfaceC11128wa2, Object obj, RV0 rv0) {
        this.a = interfaceC11128wa2;
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
        Object obj = this.h;
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        interfaceC11128wa2.d(obj);
        interfaceC11128wa2.b();
    }
}
