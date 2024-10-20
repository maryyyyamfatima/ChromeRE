package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class WD2 {
    public final C12157za2 a = new C12157za2();

    public abstract ArrayList b();

    public final void a(VD2 vd2) {
        this.a.a(vd2);
    }

    public final void d(VD2 vd2) {
        this.a.d(vd2);
    }

    public final void c(Object obj) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((VD2) c11814ya2.next()).d(this, obj);
            }
        }
    }
}
