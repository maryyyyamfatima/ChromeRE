package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12036zC1 extends BC1 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.BC1
    public final List c(long j, Object obj) {
        return d(j, 10, obj);
    }

    @Override // defpackage.BC1
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) Q14.n(j, obj);
        if (list instanceof InterfaceC6812jz1) {
            unmodifiableList = ((InterfaceC6812jz1) list).i();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2337Rz2) && (list instanceof InterfaceC1377Kp1)) {
                AbstractC7504m0 abstractC7504m0 = (AbstractC7504m0) ((InterfaceC1377Kp1) list);
                if (abstractC7504m0.a) {
                    abstractC7504m0.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        Q14.x(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, int i, Object obj) {
        C6468iz1 c6468iz1;
        List arrayList;
        List list = (List) Q14.n(j, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC6812jz1) {
                arrayList = new C6468iz1(i);
            } else if ((list instanceof InterfaceC2337Rz2) && (list instanceof InterfaceC1377Kp1)) {
                arrayList = ((InterfaceC1377Kp1) list).c(i);
            } else {
                arrayList = new ArrayList(i);
            }
            Q14.x(j, obj, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            Q14.x(j, obj, arrayList2);
            c6468iz1 = arrayList2;
        } else if (list instanceof F14) {
            C6468iz1 c6468iz12 = new C6468iz1(list.size() + i);
            c6468iz12.addAll((F14) list);
            Q14.x(j, obj, c6468iz12);
            c6468iz1 = c6468iz12;
        } else {
            if (!(list instanceof InterfaceC2337Rz2) || !(list instanceof InterfaceC1377Kp1)) {
                return list;
            }
            InterfaceC1377Kp1 interfaceC1377Kp1 = (InterfaceC1377Kp1) list;
            if (((AbstractC7504m0) interfaceC1377Kp1).a) {
                return list;
            }
            InterfaceC1377Kp1 c2 = interfaceC1377Kp1.c(list.size() + i);
            Q14.x(j, obj, c2);
            return c2;
        }
        return c6468iz1;
    }

    @Override // defpackage.BC1
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) Q14.n(j, obj2);
        List d = d(j, list.size(), obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        Q14.x(j, obj, list);
    }
}
