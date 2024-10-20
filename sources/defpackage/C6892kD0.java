package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kD0 */
/* loaded from: classes.dex */
public final class C6892kD0 {
    public final HashMap a = new HashMap();

    public final synchronized void a(C7849n00 c7849n00, InterfaceC4449d61 interfaceC4449d61, String str) {
        if (str == null) {
            return;
        }
        C6548jD0 c6548jD0 = (C6548jD0) this.a.get(str);
        if (c6548jD0 == null) {
            return;
        }
        c6548jD0.b = true;
        C1593Mg3 c1593Mg3 = c6548jD0.a;
        int i = c1593Mg3.i();
        for (int i2 = 0; i2 < i; i2++) {
            C6206iD0 c6206iD0 = (C6206iD0) c1593Mg3.j(i2);
            c6206iD0.a = interfaceC4449d61;
            Object[] objArr = c6206iD0.h;
            if (objArr != null) {
                objArr[0] = c7849n00;
            }
        }
    }

    public final synchronized void b() {
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            C6548jD0 c6548jD0 = (C6548jD0) this.a.get(it.next());
            if (c6548jD0 != null && c6548jD0.b) {
                c6548jD0.b = false;
            }
            it.remove();
        }
    }

    public final synchronized void c(String str, C6206iD0 c6206iD0) {
        C6206iD0 c6206iD02;
        if (str == null) {
            return;
        }
        C6548jD0 c6548jD0 = (C6548jD0) this.a.get(str);
        C7849n00 c7849n00 = null;
        if (c6548jD0 == null) {
            c6548jD0 = new C6548jD0();
            this.a.put(str, c6548jD0);
            c6206iD02 = null;
        } else {
            c6206iD02 = (C6206iD0) c6548jD0.a.d(c6206iD0.g);
        }
        if (c6206iD0.a(c6206iD02)) {
            Object[] objArr = c6206iD0.h;
            if (objArr != null) {
                c7849n00 = (C7849n00) objArr[0];
            }
            c6206iD02.a = c6206iD0.a;
            Object[] objArr2 = c6206iD02.h;
            if (objArr2 != null) {
                objArr2[0] = c7849n00;
            }
        } else {
            c6548jD0.a.g(c6206iD0.g, c6206iD0);
        }
    }
}
