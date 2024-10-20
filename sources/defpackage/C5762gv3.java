package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5762gv3 {
    public final int a;
    public final List b;

    public C5762gv3(int i, ArrayList arrayList) {
        this.a = i;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5762gv3)) {
            return false;
        }
        C5762gv3 c5762gv3 = (C5762gv3) obj;
        List list = this.b;
        int i = this.a;
        int i2 = c5762gv3.a;
        List list2 = c5762gv3.b;
        if (i == i2 && list == null) {
            return list2 == null;
        }
        return list.equals(list2);
    }

    public final int hashCode() {
        List list = this.b;
        return ((list == null ? 0 : list.hashCode()) * 31 * 31) + this.a;
    }
}
