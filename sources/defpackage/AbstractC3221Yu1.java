package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3221Yu1 {
    public static boolean a(C5175fD1 c5175fD1, int[] iArr) {
        HashSet hashSet = new HashSet(iArr.length);
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        Iterator it = c5175fD1.iterator();
        while (it.hasNext()) {
            C1142Iu1 c1142Iu1 = ((C5416fv1) it.next()).b;
            if (c1142Iu1 != null && hashSet.contains(Integer.valueOf(c1142Iu1.d))) {
                return true;
            }
        }
        return false;
    }
}
