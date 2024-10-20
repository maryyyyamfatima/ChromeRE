package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ul3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10509ul3 extends HF {
    public final /* synthetic */ ViewOnLayoutChangeListenerC0059Al3 g;

    @Override // defpackage.HF
    public final void b() {
        ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = this.g;
        viewOnLayoutChangeListenerC0059Al3.q = null;
        Iterator it = viewOnLayoutChangeListenerC0059Al3.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC6389il3) it.next()).a();
        }
    }

    @Override // defpackage.HF
    public final void c() {
        this.g.o.run();
    }

    public C10509ul3(ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3) {
        this.g = viewOnLayoutChangeListenerC0059Al3;
    }
}
