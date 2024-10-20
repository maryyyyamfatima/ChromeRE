package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ha2 */
/* loaded from: classes.dex */
public final class C5979ha2 extends A30 implements InterfaceC11754yO2 {
    public final InterfaceC7353la2 a;
    public final AtomicReference g;
    public final X92 h;
    public final InterfaceC7353la2 i;

    static {
        new C5291fa2();
    }

    public C5979ha2(C4604da2 c4604da2, C7217l92 c7217l92, AtomicReference atomicReference, X92 x92) {
        this.i = c4604da2;
        this.a = c7217l92;
        this.g = atomicReference;
        this.h = x92;
    }

    @Override // defpackage.InterfaceC11754yO2
    public final void e(InterfaceC6416iq0 interfaceC6416iq0) {
        AtomicReference atomicReference;
        C4260ca2 c4260ca2 = (C4260ca2) interfaceC6416iq0;
        do {
            atomicReference = this.g;
            if (atomicReference.compareAndSet(c4260ca2, null)) {
                return;
            }
        } while (atomicReference.get() == c4260ca2);
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        this.i.a(interfaceC11128wa2);
    }
}
