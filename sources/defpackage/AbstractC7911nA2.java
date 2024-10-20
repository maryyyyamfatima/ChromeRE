package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nA2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7911nA2 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(EnumC7223lA2.DEFAULT, 0);
        hashMap.put(EnumC7223lA2.VERY_LOW, 1);
        hashMap.put(EnumC7223lA2.HIGHEST, 2);
        for (EnumC7223lA2 enumC7223lA2 : hashMap.keySet()) {
            a.append(((Integer) b.get(enumC7223lA2)).intValue(), enumC7223lA2);
        }
    }

    public static EnumC7223lA2 b(int i) {
        EnumC7223lA2 enumC7223lA2 = (EnumC7223lA2) a.get(i);
        if (enumC7223lA2 != null) {
            return enumC7223lA2;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown Priority for value ", i));
    }

    public static int a(EnumC7223lA2 enumC7223lA2) {
        Integer num = (Integer) b.get(enumC7223lA2);
        if (num == null) {
            throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(enumC7223lA2)));
        }
        return num.intValue();
    }
}
