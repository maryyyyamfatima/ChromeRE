package defpackage;

import J.N;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3229Yw {
    public static HashSet a(C6755jp2 c6755jp2) {
        HashMap hashMap = new HashMap();
        int i = 0;
        hashMap.put(0, "amex");
        hashMap.put(1, "diners");
        hashMap.put(2, "discover");
        hashMap.put(3, "jcb");
        hashMap.put(4, "mastercard");
        hashMap.put(5, "mir");
        hashMap.put(6, "unionpay");
        hashMap.put(7, "visa");
        int[] iArr = c6755jp2.g;
        if (!((iArr == null || iArr.length == 0) ? false : true)) {
            return new HashSet(hashMap.values());
        }
        HashSet hashSet = new HashSet();
        while (true) {
            int[] iArr2 = c6755jp2.g;
            if (i >= iArr2.length) {
                return hashSet;
            }
            String str = (String) hashMap.get(Integer.valueOf(iArr2[i]));
            if (str != null) {
                hashSet.add(str);
            }
            i++;
        }
    }

    public static boolean b(C4317ck c4317ck) {
        C6755jp2 c6755jp2;
        return (!N.M1X7xdZV("PaymentRequestBasicCard") || (c6755jp2 = (C6755jp2) c4317ck.get("basic-card")) == null || a(c6755jp2).isEmpty()) ? false : true;
    }
}
