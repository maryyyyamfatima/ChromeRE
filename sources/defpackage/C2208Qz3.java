package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qz3 */
/* loaded from: classes.dex */
public final class C2208Qz3 extends AbstractC4276cd0 {
    public final /* synthetic */ C2468Sz3 a;

    public C2208Qz3(C2468Sz3 c2468Sz3) {
        this.a = c2468Sz3;
    }

    @Override // defpackage.AbstractC4276cd0
    public final void b(Tab tab) {
        C2468Sz3 c2468Sz3 = this.a;
        C2468Sz3.a(c2468Sz3);
        Iterator it = c2468Sz3.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC2338Rz3) c11814ya2.next()).V0();
            }
        }
    }

    @Override // defpackage.AbstractC4276cd0
    public final void c(Tab tab) {
        C2468Sz3 c2468Sz3 = this.a;
        C2468Sz3.a(c2468Sz3);
        Iterator it = c2468Sz3.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC2338Rz3) c11814ya2.next()).W0(tab);
            }
        }
    }

    @Override // defpackage.AbstractC4276cd0
    public final void a() {
        C2468Sz3.a(this.a);
    }
}
