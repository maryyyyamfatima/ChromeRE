package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PD1 {
    public static final int[] a = {0, 2, 3, 4, 1, 6, 5, 7};

    public static ArrayList c(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            OC1 oc1 = (OC1) it.next();
            if (oc1 instanceof KC1) {
                arrayList.add(((KC1) oc1).e);
            }
        }
        return arrayList;
    }

    public static int b(OC1 oc1, C0351Cs0 c0351Cs0) {
        if (oc1 instanceof NC1) {
            return 7;
        }
        if (oc1 instanceof MC1) {
            return 8;
        }
        if (oc1 instanceof LC1) {
            return 18;
        }
        if (oc1 instanceof IC1) {
            return 13;
        }
        if (oc1 instanceof HC1) {
            return 14;
        }
        if (oc1 instanceof GC1) {
            int b = AbstractC2373Sg3.b(((GC1) oc1).d);
            if (b == 0) {
                return 15;
            }
            if (b == 1) {
                return 16;
            }
            if (b == 2) {
                return 17;
            }
        }
        if (!(oc1 instanceof KC1)) {
            return 2;
        }
        KC1 kc1 = (KC1) oc1;
        if (kc1.g) {
            return 12;
        }
        OfflineItem offlineItem = kc1.e;
        if (offlineItem.K != null) {
            return 2;
        }
        int i = offlineItem.B;
        boolean z = i == 0 || i == 6 || i == 4 || i == 1 || i == 5;
        if (c0351Cs0.c) {
            return z ? 1 : 2;
        }
        if (offlineItem.k) {
            int i2 = offlineItem.i;
            if (i2 == 0) {
                return 11;
            }
            if (i2 == 2) {
                return 4;
            }
        }
        int i3 = offlineItem.i;
        if (i3 == 1) {
            return z ? 9 : 3;
        }
        if (i3 != 3) {
            return z ? 1 : 2;
        }
        if (z) {
            return 10;
        }
        return kc1.f ? 6 : 5;
    }

    public static boolean a(OC1 oc1) {
        C6161i50 c6161i50;
        return (oc1 instanceof KC1) && (c6161i50 = ((KC1) oc1).e.a) != null && TextUtils.equals("content_index", c6161i50.a);
    }
}
