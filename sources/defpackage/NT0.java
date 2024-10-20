package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NT0 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public C11434xT0 d;

    public final void g(k kVar) {
        c cVar = kVar.c;
        String str = cVar.k;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(cVar.k, kVar);
    }

    public final void a(c cVar) {
        if (this.a.contains(cVar)) {
            throw new IllegalStateException("Fragment already added: " + cVar);
        }
        synchronized (this.a) {
            this.a.add(cVar);
        }
        cVar.q = true;
    }

    public final void h(k kVar) {
        c cVar = kVar.c;
        if (cVar.G) {
            C11434xT0 c11434xT0 = this.d;
            if (!c11434xT0.m) {
                c11434xT0.h.remove(cVar.k);
            }
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap hashMap = this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.b.values()) {
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.b.values()) {
            if (kVar != null) {
                arrayList.add(kVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final c c(String str) {
        for (k kVar : this.b.values()) {
            if (kVar != null) {
                c cVar = kVar.c;
                if (!str.equals(cVar.k)) {
                    cVar = cVar.z.c.c(str);
                }
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final c b(String str) {
        k kVar = (k) this.b.get(str);
        if (kVar != null) {
            return kVar.c;
        }
        return null;
    }
}
