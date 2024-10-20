package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SZ {
    public final HashSet a;
    public final HashSet b;
    public int c;
    public int d;
    public InterfaceC8879q00 e;
    public final HashSet f;

    public SZ(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashSet();
        this.c = 0;
        this.d = 0;
        this.f = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(this.a, clsArr);
    }

    public final void a(C11535xl0 c11535xl0) {
        if (!(!this.a.contains(c11535xl0.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.b.add(c11535xl0);
    }

    public final VZ b() {
        if (!(this.e != null)) {
            throw new IllegalStateException("Missing required property: factory.");
        }
        return new VZ(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.f);
    }
}
