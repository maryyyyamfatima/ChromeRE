package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LS {
    public final HashMap a = new HashMap();
    public final Map b;

    public LS(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC11340xA1 enumC11340xA1 = (EnumC11340xA1) entry.getValue();
            List list = (List) this.a.get(enumC11340xA1);
            if (list == null) {
                list = new ArrayList();
                this.a.put(enumC11340xA1, list);
            }
            list.add((MS) entry.getKey());
        }
    }

    public static void a(List list, JA1 ja1, EnumC11340xA1 enumC11340xA1, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                MS ms = (MS) list.get(size);
                ms.getClass();
                try {
                    int i = ms.a;
                    Method method = ms.b;
                    if (i == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i == 1) {
                        method.invoke(obj, ja1);
                    } else if (i == 2) {
                        method.invoke(obj, ja1, enumC11340xA1);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
