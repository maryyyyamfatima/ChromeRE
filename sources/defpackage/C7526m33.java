package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m33, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7526m33 {
    public boolean a;
    public boolean b;
    public Set c = new LinkedHashSet();
    public final C12157za2 d = new C12157za2();

    public boolean g(Object obj) {
        if (this.c.contains(obj)) {
            this.c.remove(obj);
        } else {
            if (this.a) {
                this.c.clear();
            }
            this.c.add(obj);
        }
        if (this.c.isEmpty()) {
            this.b = false;
        }
        f();
        return d(obj);
    }

    public boolean d(Object obj) {
        return this.c.contains(obj);
    }

    public boolean e() {
        return !this.c.isEmpty() || this.b;
    }

    public final void b() {
        this.b = false;
        this.c.clear();
        f();
    }

    public final ArrayList c() {
        return new ArrayList(this.c);
    }

    public final void a(InterfaceC7182l33 interfaceC7182l33) {
        this.d.a(interfaceC7182l33);
    }

    public final void f() {
        ArrayList c = c();
        Iterator it = this.d.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7182l33) c11814ya2.next()).d(c);
            }
        }
    }
}
