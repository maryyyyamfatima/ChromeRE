package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FK2 {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            EK2 ek2 = (EK2) sparseArray.valueAt(i);
            Iterator it = ek2.a.iterator();
            while (it.hasNext()) {
                AbstractC8522ox2.a(((d) it.next()).a);
            }
            ek2.a.clear();
            i++;
        }
    }

    public final void d(int i, int i2) {
        EK2 c = c(i);
        c.b = i2;
        ArrayList arrayList = c.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public d b(int i) {
        EK2 ek2 = (EK2) this.a.get(i);
        if (ek2 == null) {
            return null;
        }
        ArrayList arrayList = ek2.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((d) arrayList.get(size)).j()) {
                return (d) arrayList.remove(size);
            }
        }
        return null;
    }

    public final EK2 c(int i) {
        SparseArray sparseArray = this.a;
        EK2 ek2 = (EK2) sparseArray.get(i);
        if (ek2 != null) {
            return ek2;
        }
        EK2 ek22 = new EK2();
        sparseArray.put(i, ek22);
        return ek22;
    }
}
