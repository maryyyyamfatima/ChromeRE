package defpackage;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9048qW {
    public static HashSet d(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return hashSet;
    }

    public static HashMap c(Pair... pairArr) {
        HashMap hashMap = new HashMap();
        for (Pair pair : pairArr) {
            hashMap.put(pair.first, pair.second);
        }
        return hashMap;
    }

    public static int[] b(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public static void a(Collection collection, Callback callback) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            callback.onResult(it.next());
        }
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object obj = ((WeakReference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
