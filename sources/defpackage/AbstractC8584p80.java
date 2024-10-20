package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8584p80 {
    public static final Pattern a = Pattern.compile("\\s");
    public static final Map b;

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "None" : "Website" : "Phone" : "Event" : "Email" : "Address";
    }

    static {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        hashMap.put(new Pair(bool, bool), 0);
        Boolean bool2 = Boolean.FALSE;
        hashMap.put(new Pair(bool2, bool), 1);
        hashMap.put(new Pair(bool, bool2), 2);
        hashMap.put(new Pair(bool2, bool2), 3);
        b = Collections.unmodifiableMap(hashMap);
    }

    public static void b(String str, boolean z, boolean z2) {
        EI2.h(((Integer) b.get(new Pair(Boolean.valueOf(z), Boolean.valueOf(z2)))).intValue(), 4, str);
    }
}
