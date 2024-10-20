package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5928hQ1 {
    public final List a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public C5928hQ1(ArrayList arrayList, boolean z) {
        this.a = arrayList == null ? Collections.emptyList() : arrayList;
        this.b = z;
    }

    public final boolean b() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TP1 tp1 = (TP1) list.get(i);
            if (tp1 == null || !tp1.e()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.a.toArray()) + ", isValid=" + b() + " }";
    }

    public static C5928hQ1 a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new TP1(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new C5928hQ1(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }
}
