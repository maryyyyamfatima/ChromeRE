package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ga2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5635ga2 extends ArrayList implements InterfaceC3573aa2 {
    public volatile int a;

    @Override // defpackage.InterfaceC3573aa2
    public final void f(Throwable th) {
        add(new W62(th));
        this.a++;
    }

    public C5635ga2() {
        super(16);
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void a() {
        add(X62.a);
        this.a++;
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void d(Y92 y92) {
        if (y92.getAndIncrement() != 0) {
            return;
        }
        InterfaceC11128wa2 interfaceC11128wa2 = y92.g;
        int i = 1;
        while (!y92.i) {
            int i2 = this.a;
            Integer num = (Integer) y92.h;
            int intValue = num != null ? num.intValue() : 0;
            while (intValue < i2) {
                if (X62.a(interfaceC11128wa2, get(intValue)) || y92.i) {
                    return;
                } else {
                    intValue++;
                }
            }
            y92.h = Integer.valueOf(intValue);
            i = y92.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }
}
