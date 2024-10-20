package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class D10 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap(4);
    public static final WeakHashMap c = new WeakHashMap();
    public static final WeakHashMap d = new WeakHashMap();
    public static C10 e;

    public static InterfaceC9750sZ1 a(Context context, WZ wz, int i) {
        if (wz.N() != 0) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            if (z) {
                synchronized (a) {
                    HashMap hashMap = b;
                    SparseArray sparseArray = (SparseArray) hashMap.get(context);
                    if (sparseArray == null) {
                        if (c.containsKey(W60.a(context))) {
                            return null;
                        }
                        if (!d.containsKey(context) && e == null) {
                            e = new C10();
                            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(e);
                        }
                        sparseArray = new SparseArray();
                        hashMap.put(context, sparseArray);
                    }
                    InterfaceC9750sZ1 interfaceC9750sZ1 = (InterfaceC9750sZ1) sparseArray.get(wz.a);
                    if (interfaceC9750sZ1 == null) {
                        boolean z2 = B10.a;
                        interfaceC9750sZ1 = wz.C();
                        sparseArray.put(wz.a, interfaceC9750sZ1);
                    }
                    return interfaceC9750sZ1;
                }
            }
        }
        return null;
    }
}
