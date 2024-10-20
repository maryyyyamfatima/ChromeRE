package defpackage;

import java.util.LinkedList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EY {
    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static List a(String str, List list) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(str);
        return list;
    }

    public static boolean c(SC0 sc0, SC0 sc02) {
        if (sc0 == sc02) {
            return true;
        }
        if (sc0 == null || sc02 == null) {
            return false;
        }
        return sc0.a(sc02);
    }
}
