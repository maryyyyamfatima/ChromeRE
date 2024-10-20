package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AI {
    public static final ArrayList i = new ArrayList();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public InterfaceC7976nN2 e;
    public ArrayList f;
    public List g;
    public List h;

    public AI(int i2, int i3, int i4, int i5, InterfaceC7976nN2 interfaceC7976nN2, List list, List list2, List list3) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = interfaceC7976nN2 == null ? A00.r() : interfaceC7976nN2;
        if (list == null) {
            this.f = i;
        } else {
            int size = list.size();
            this.f = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = (InterfaceC7976nN2) list.get(i6);
                ArrayList arrayList = this.f;
                if (obj == null) {
                    obj = A00.r();
                }
                arrayList.add(obj);
            }
        }
        if (list2 != null) {
            this.g = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.h = Collections.unmodifiableList(list3);
        }
    }

    public static AI b(int i2, int i3, InterfaceC7976nN2 interfaceC7976nN2, Object obj, Object obj2) {
        return a(i2, i3, -1, 1, interfaceC7976nN2, null, obj != null ? Collections.singletonList(obj) : null, obj2 != null ? Collections.singletonList(obj2) : null);
    }

    public static AI a(int i2, int i3, int i4, int i5, InterfaceC7976nN2 interfaceC7976nN2, List list, List list2, List list3) {
        return new AI(i2, i3, i4, i5, interfaceC7976nN2, list, list2, list3);
    }
}
