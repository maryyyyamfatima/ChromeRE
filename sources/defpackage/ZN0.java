package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZN0 implements InterfaceC3855bO0 {
    public final /* synthetic */ C3511aO0 a;

    @Override // defpackage.InterfaceC3855bO0
    public final void a() {
        Iterator it = this.a.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC3855bO0) c11814ya2.next()).a();
            }
        }
    }

    @Override // defpackage.InterfaceC3855bO0
    public final void b() {
        Iterator it = this.a.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC3855bO0) c11814ya2.next()).b();
            }
        }
    }

    public ZN0(C3511aO0 c3511aO0) {
        this.a = c3511aO0;
    }
}
