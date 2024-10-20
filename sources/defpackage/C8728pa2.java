package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pa2 */
/* loaded from: classes.dex */
public final class C8728pa2 extends AtomicReference implements InterfaceC11128wa2 {
    public final C9071qa2 a;
    public final long g;
    public final int h;
    public volatile InterfaceC3586ac3 i;
    public volatile boolean j;

    public C8728pa2(C9071qa2 c9071qa2, long j, int i) {
        this.a = c9071qa2;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0)) {
            if (interfaceC6416iq0 instanceof AG2) {
                AG2 ag2 = (AG2) interfaceC6416iq0;
                int e = ag2.e(7);
                if (e == 1) {
                    this.i = ag2;
                    this.j = true;
                    this.a.e();
                    return;
                } else if (e == 2) {
                    this.i = ag2;
                    return;
                }
            }
            this.i = new C7402li3(this.h);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.g == this.a.o) {
            if (obj != null) {
                this.i.offer(obj);
            }
            this.a.e();
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        C9071qa2 c9071qa2 = this.a;
        c9071qa2.getClass();
        if (this.g == c9071qa2.o && c9071qa2.j.a(th)) {
            if (!c9071qa2.i) {
                c9071qa2.m.dispose();
                c9071qa2.k = true;
            }
            this.j = true;
            c9071qa2.e();
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.g == this.a.o) {
            this.j = true;
            this.a.e();
        }
    }
}
