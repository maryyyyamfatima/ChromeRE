package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y92 extends AtomicInteger implements InterfaceC6416iq0 {
    public final C4260ca2 a;
    public final InterfaceC11128wa2 g;
    public Serializable h;
    public volatile boolean i;

    public Y92(C4260ca2 c4260ca2, InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = c4260ca2;
        this.g = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.e(this);
        this.h = null;
    }
}
