package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I92 extends AbstractC5770gx {
    public final InterfaceC11128wa2 a;
    public final Iterator g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    public I92(InterfaceC11128wa2 interfaceC11128wa2, Iterator it) {
        this.a = interfaceC11128wa2;
        this.g = it;
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.i = true;
        return 1;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        if (this.j) {
            return null;
        }
        boolean z = this.k;
        Iterator it = this.g;
        if (z) {
            if (!it.hasNext()) {
                this.j = true;
                return null;
            }
        } else {
            this.k = true;
        }
        Object next = it.next();
        Q82.a(next, "The iterator returned a null value");
        return next;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.j = true;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.h = true;
    }
}
