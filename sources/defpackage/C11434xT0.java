package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11434xT0 extends AbstractC9776sd4 {
    public static final C11091wT0 n = new C11091wT0();
    public final boolean k;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public boolean l = false;
    public boolean m = false;

    public C11434xT0(boolean z) {
        this.k = z;
    }

    @Override // defpackage.AbstractC9776sd4
    public final void a() {
        this.l = true;
    }

    public final void b(String str) {
        HashMap hashMap = this.i;
        C11434xT0 c11434xT0 = (C11434xT0) hashMap.get(str);
        if (c11434xT0 != null) {
            c11434xT0.l = true;
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.j;
        C11834yd4 c11834yd4 = (C11834yd4) hashMap2.get(str);
        if (c11834yd4 != null) {
            c11834yd4.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11434xT0.class != obj.getClass()) {
            return false;
        }
        C11434xT0 c11434xT0 = (C11434xT0) obj;
        return this.h.equals(c11434xT0.h) && this.i.equals(c11434xT0.i) && this.j.equals(c11434xT0.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.i.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.j.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
