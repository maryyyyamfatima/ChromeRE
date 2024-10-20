package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qa2 */
/* loaded from: classes.dex */
public final class C9071qa2 extends AtomicInteger implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public static final C8728pa2 p;
    public final InterfaceC11128wa2 a;
    public final DV0 g;
    public final int h;
    public volatile boolean k;
    public volatile boolean l;
    public InterfaceC6416iq0 m;
    public volatile long o;
    public final AtomicReference n = new AtomicReference();
    public final boolean i = false;
    public final C0965Hl j = new C0965Hl();

    static {
        C8728pa2 c8728pa2 = new C8728pa2(null, -1L, 1);
        p = c8728pa2;
        EnumC7791mq0.a(c8728pa2);
    }

    public C9071qa2(InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0, int i) {
        this.a = interfaceC11128wa2;
        this.g = dv0;
        this.h = i;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.m, interfaceC6416iq0)) {
            this.m = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        boolean z;
        long j = this.o + 1;
        this.o = j;
        C8728pa2 c8728pa2 = (C8728pa2) this.n.get();
        if (c8728pa2 != null) {
            EnumC7791mq0.a(c8728pa2);
        }
        try {
            InterfaceC7353la2 interfaceC7353la2 = (InterfaceC7353la2) this.g.apply(obj);
            Q82.a(interfaceC7353la2, "The ObservableSource returned is null");
            C8728pa2 c8728pa22 = new C8728pa2(this, j, this.h);
            do {
                C8728pa2 c8728pa23 = (C8728pa2) this.n.get();
                if (c8728pa23 == p) {
                    return;
                }
                AtomicReference atomicReference = this.n;
                while (true) {
                    if (atomicReference.compareAndSet(c8728pa23, c8728pa22)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != c8728pa23) {
                        z = false;
                        break;
                    }
                }
            } while (!z);
            interfaceC7353la2.a(c8728pa22);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.m.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (!this.k && this.j.a(th)) {
            if (!this.i) {
                a();
            }
            this.k = true;
            e();
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        e();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.m.dispose();
        a();
    }

    public final void a() {
        C8728pa2 c8728pa2;
        AtomicReference atomicReference = this.n;
        C8728pa2 c8728pa22 = (C8728pa2) atomicReference.get();
        C8728pa2 c8728pa23 = p;
        if (c8728pa22 == c8728pa23 || (c8728pa2 = (C8728pa2) atomicReference.getAndSet(c8728pa23)) == c8728pa23 || c8728pa2 == null) {
            return;
        }
        EnumC7791mq0.a(c8728pa2);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9071qa2.e():void");
    }
}
