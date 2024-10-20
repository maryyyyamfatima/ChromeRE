package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9645sE1 implements Cloneable {
    public HashMap a;
    public ArrayList g;
    public HashMap h;
    public ArrayList i;
    public final C10926vy1 j;

    public C9645sE1(C10926vy1 c10926vy1) {
        if (c10926vy1 == null) {
            throw new IllegalArgumentException("Null output used for LithoRenderUnit.");
        }
        c10926vy1.i.m();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            c((C9691sN2) it.next());
        }
        Iterator it2 = emptyList2.iterator();
        while (it2.hasNext()) {
            a((C9691sN2) it2.next());
        }
        c(new C9691sN2(this, C9302rE1.a));
        a(new C9691sN2(this, C8960qE1.a));
        this.j = c10926vy1;
    }

    public final void c(C9691sN2 c9691sN2) {
        if (this.g == null) {
            this.g = new ArrayList();
            if (this.a != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.a = new HashMap();
        }
        b(this.a, this.g, c9691sN2);
    }

    public final void a(C9691sN2 c9691sN2) {
        if (this.i == null) {
            this.i = new ArrayList();
            if (this.h != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.h = new HashMap();
        }
        b(this.h, this.i, c9691sN2);
    }

    public static void b(Map map, List list, C9691sN2 c9691sN2) {
        if (((C9691sN2) map.put(c9691sN2.b.getClass(), c9691sN2)) != null) {
            boolean z = true;
            int size = list.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    break;
                } else {
                    if (((C9691sN2) list.get(size)).b.getClass() == c9691sN2.b.getClass()) {
                        list.remove(size);
                        break;
                    }
                    size--;
                }
            }
            if (!z) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
        }
        list.add(c9691sN2);
    }
}
