package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4294cg0 {
    public static C4294cg0 f;
    public final CN3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public boolean e = false;

    public final void b(C11647y41 c11647y41) {
        ArrayList arrayList = c11647y41.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            M74 m74 = (M74) arrayList.get(i);
            HashMap hashMap = this.d;
            C3951bg0 c3951bg0 = (C3951bg0) hashMap.get(m74);
            if (c3951bg0 != null) {
                c3951bg0.b++;
            } else {
                C3951bg0 c3951bg02 = new C3951bg0();
                c3951bg02.b = 1;
                hashMap.put(m74, c3951bg02);
            }
        }
    }

    public C4294cg0(C5557gL c5557gL) {
        this.a = c5557gL;
    }

    public final void a() {
        Collection<M74> values;
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() == 0) {
            return;
        }
        C5348fk c5348fk = new C5348fk(0);
        C1439Lb3 c1439Lb3 = new C1439Lb3(0);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = ((C11647y41) arrayList2.get(i)).c;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                M74 m74 = (M74) arrayList3.get(i2);
                ArrayList arrayList4 = m74.b;
                int size3 = arrayList4 == null ? 0 : arrayList4.size();
                if (size3 == 0) {
                    c5348fk.add(m74);
                } else {
                    c1439Lb3.put(m74, Integer.valueOf(size3));
                }
            }
        }
        if (!c1439Lb3.isEmpty() && c5348fk.isEmpty()) {
            throw new C0446Dl0("Graph has nodes, but they represent a cycle with no leaf nodes!");
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addAll(c5348fk);
        while (!arrayDeque.isEmpty()) {
            M74 m742 = (M74) arrayDeque.pollFirst();
            arrayList.add(m742);
            LinkedHashMap linkedHashMap = m742.a;
            if (linkedHashMap == null) {
                values = Collections.emptySet();
            } else {
                values = linkedHashMap.values();
            }
            for (M74 m743 : values) {
                int intValue = ((Integer) c1439Lb3.get(m743)).intValue() - 1;
                c1439Lb3.put(m743, Integer.valueOf(intValue));
                if (intValue == 0) {
                    arrayDeque.addLast(m743);
                } else if (intValue < 0) {
                    throw new C0446Dl0("Detected cycle.");
                }
            }
        }
        if (arrayList.size() != c1439Lb3.h + c5348fk.h) {
            throw new C0446Dl0("Had unreachable nodes in graph -- this likely means there was a cycle");
        }
        Collections.reverse(arrayList);
        this.e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        HashMap hashMap;
        boolean z;
        Collection values;
        boolean z2;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hashMap = this.d;
            if (i >= size) {
                break;
            }
            M74 m74 = (M74) arrayList.get(i);
            C3951bg0 c3951bg0 = (C3951bg0) hashMap.get(m74);
            if (c3951bg0 != null && !c3951bg0.a) {
                LinkedHashMap linkedHashMap = m74.a;
                if (linkedHashMap == null) {
                    values = Collections.emptySet();
                } else {
                    values = linkedHashMap.values();
                }
                Iterator it = values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C3951bg0) hashMap.get((M74) it.next())).a) {
                            z2 = false;
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    if (!(m74 instanceof C52) || ((C52) m74).a()) {
                        c3951bg0.a = true;
                    }
                }
            }
            i++;
        }
        ArrayList arrayList2 = this.b;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            C11647y41 c11647y41 = (C11647y41) arrayList2.get(size2);
            ArrayList arrayList3 = c11647y41.c;
            int size3 = arrayList3.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size3) {
                    z = true;
                    break;
                } else {
                    if (!((C3951bg0) hashMap.get(arrayList3.get(i2))).a) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                RV3 rv3 = c11647y41.d;
                if (rv3 != null) {
                    SV3 sv3 = rv3.a;
                    CopyOnWriteArrayList copyOnWriteArrayList = sv3.a;
                    int size4 = copyOnWriteArrayList.size();
                    while (true) {
                        size4--;
                        if (size4 < 0) {
                            break;
                        } else {
                            ((InterfaceC12166zc) copyOnWriteArrayList.get(size4)).c(sv3);
                        }
                    }
                    sv3.e();
                }
                c11647y41.b();
            }
        }
    }
}
