package defpackage;

import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8592p92 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC1314Kc3 a;
    public final long g;
    public final Object h;
    public InterfaceC6416iq0 i;
    public long j;
    public boolean k;

    public C8592p92(InterfaceC1314Kc3 interfaceC1314Kc3, long j, Object obj) {
        this.a = interfaceC1314Kc3;
        this.g = j;
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
        if (this.k) {
            return;
        }
        long j = this.j;
        if (j == this.g) {
            this.k = true;
            this.i.dispose();
            this.a.a(obj);
            return;
        }
        this.j = j + 1;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.k) {
            MR2.b(th);
        } else {
            this.k = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        InterfaceC1314Kc3 interfaceC1314Kc3 = this.a;
        Object obj = this.h;
        if (obj != null) {
            interfaceC1314Kc3.a(obj);
        } else {
            interfaceC1314Kc3.onError(new NoSuchElementException());
        }
    }
}
