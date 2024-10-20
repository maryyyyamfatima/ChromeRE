package defpackage;

import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class H1 {
    public Boolean a;
    public Boolean b;
    public C12157za2 c;
    public F1 d;

    public abstract boolean c();

    public abstract boolean d();

    public static AccessibilityManager b() {
        return (AccessibilityManager) V60.a.getSystemService("accessibility");
    }

    public final void e() {
        boolean c = c();
        this.a = null;
        this.b = null;
        if (c == c()) {
            return;
        }
        boolean c2 = c();
        if (this.c == null) {
            this.c = new C12157za2();
        }
        Iterator it = this.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((G1) c11814ya2.next()).D(c2);
            }
        }
    }

    public final void a(G1 g1) {
        if (this.c == null) {
            this.c = new C12157za2();
        }
        this.c.a(g1);
        g1.D(c());
    }
}
