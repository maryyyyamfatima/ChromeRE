package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oz3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1948Oz3 {
    public final C12157za2 b = new C12157za2();
    public final C7638mO3 a = new C7638mO3(new Runnable() { // from class: Mz3
        @Override // java.lang.Runnable
        public final void run() {
            C1948Oz3 c1948Oz3 = C1948Oz3.this;
            Iterator it = c1948Oz3.b.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((InterfaceC1818Nz3) c11814ya2.next()).o(c1948Oz3.a.b());
                }
            }
        }
    });
}
