package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9696sO2 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(GN2 gn2) {
        boolean z = true;
        if (gn2 == null) {
            return true;
        }
        boolean remove = this.a.remove(gn2);
        if (!this.b.remove(gn2) && !remove) {
            z = false;
        }
        if (z) {
            gn2.clear();
        }
        return z;
    }

    public final void b() {
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            GN2 gn2 = (GN2) it.next();
            if (!gn2.j() && !gn2.i()) {
                gn2.clear();
                if (!this.c) {
                    gn2.c();
                } else {
                    this.b.add(gn2);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
