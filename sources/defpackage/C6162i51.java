package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6162i51 {
    public final C5818h51 a = new C5818h51(null);
    public final HashMap b = new HashMap();

    public final void b(InterfaceC8179nx2 interfaceC8179nx2, Object obj) {
        HashMap hashMap = this.b;
        C5818h51 c5818h51 = (C5818h51) hashMap.get(interfaceC8179nx2);
        if (c5818h51 == null) {
            c5818h51 = new C5818h51(interfaceC8179nx2);
            C5818h51 c5818h512 = c5818h51.d;
            c5818h512.c = c5818h51.c;
            c5818h51.c.d = c5818h512;
            C5818h51 c5818h513 = this.a;
            c5818h51.d = c5818h513.d;
            c5818h51.c = c5818h513;
            c5818h513.d = c5818h51;
            c5818h51.d.c = c5818h51;
            hashMap.put(interfaceC8179nx2, c5818h51);
        } else {
            interfaceC8179nx2.a();
        }
        if (c5818h51.b == null) {
            c5818h51.b = new ArrayList();
        }
        c5818h51.b.add(obj);
    }

    public final Object a(InterfaceC8179nx2 interfaceC8179nx2) {
        HashMap hashMap = this.b;
        C5818h51 c5818h51 = (C5818h51) hashMap.get(interfaceC8179nx2);
        if (c5818h51 == null) {
            c5818h51 = new C5818h51(interfaceC8179nx2);
            hashMap.put(interfaceC8179nx2, c5818h51);
        } else {
            interfaceC8179nx2.a();
        }
        C5818h51 c5818h512 = c5818h51.d;
        c5818h512.c = c5818h51.c;
        c5818h51.c.d = c5818h512;
        C5818h51 c5818h513 = this.a;
        c5818h51.d = c5818h513;
        C5818h51 c5818h514 = c5818h513.c;
        c5818h51.c = c5818h514;
        c5818h514.d = c5818h51;
        c5818h51.d.c = c5818h51;
        ArrayList arrayList = c5818h51.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c5818h51.b.remove(size - 1);
        }
        return null;
    }

    public final Object c() {
        C5818h51 c5818h51 = this.a;
        C5818h51 c5818h512 = c5818h51.d;
        while (true) {
            if (c5818h512.equals(c5818h51)) {
                return null;
            }
            ArrayList arrayList = c5818h512.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c5818h512.b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            C5818h51 c5818h513 = c5818h512.d;
            c5818h513.c = c5818h512.c;
            c5818h512.c.d = c5818h513;
            HashMap hashMap = this.b;
            Object obj = c5818h512.a;
            hashMap.remove(obj);
            ((InterfaceC8179nx2) obj).a();
            c5818h512 = c5818h512.d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C5818h51 c5818h51 = this.a;
        C5818h51 c5818h512 = c5818h51.c;
        boolean z = false;
        while (!c5818h512.equals(c5818h51)) {
            sb.append('{');
            sb.append(c5818h512.a);
            sb.append(':');
            ArrayList arrayList = c5818h512.b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            c5818h512 = c5818h512.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
