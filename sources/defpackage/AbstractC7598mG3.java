package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mG3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7598mG3 {
    public static int a(HashMap hashMap, int i) {
        int i2 = 1;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            List list = (List) hashMap.get(Integer.valueOf(i));
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += a(hashMap, ((Integer) list.get(i3)).intValue());
            }
        }
        return i2;
    }
}
