package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cf3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0289Cf3 {
    public final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();

    public final C12188zf3 b(boolean z) {
        InterfaceC0679Ff3 interfaceC0679Ff3;
        C12188zf3 c12188zf3 = (C12188zf3) this.a.pollFirst();
        if (c12188zf3 == null) {
            c12188zf3 = (C12188zf3) this.b.pollFirst();
        }
        if (c12188zf3 != null && (interfaceC0679Ff3 = c12188zf3.a) != null) {
            if (z) {
                interfaceC0679Ff3.b(c12188zf3.e);
            } else {
                interfaceC0679Ff3.a(c12188zf3.e);
            }
        }
        return c12188zf3;
    }

    public final C12188zf3 a() {
        C12188zf3 c12188zf3 = (C12188zf3) this.a.peekFirst();
        return c12188zf3 == null ? (C12188zf3) this.b.peekFirst() : c12188zf3;
    }

    public static boolean c(LinkedList linkedList, InterfaceC0679Ff3 interfaceC0679Ff3) {
        boolean z = false;
        if (interfaceC0679Ff3 == null) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C12188zf3 c12188zf3 = (C12188zf3) it.next();
            if (c12188zf3.a == interfaceC0679Ff3) {
                it.remove();
                interfaceC0679Ff3.a(c12188zf3.e);
                z = true;
            }
        }
        return z;
    }

    public static boolean d(LinkedList linkedList, InterfaceC0679Ff3 interfaceC0679Ff3, Object obj) {
        boolean equals;
        if (interfaceC0679Ff3 == null) {
            return false;
        }
        Iterator it = linkedList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C12188zf3 c12188zf3 = (C12188zf3) it.next();
            if (c12188zf3.a == interfaceC0679Ff3) {
                Object obj2 = c12188zf3.e;
                if (obj2 == null && obj == null) {
                    equals = true;
                } else {
                    equals = (obj2 == null || obj == null) ? false : obj2.equals(obj);
                }
                if (equals) {
                    it.remove();
                    interfaceC0679Ff3.a(c12188zf3.e);
                    z = true;
                }
            }
        }
        return z;
    }
}
