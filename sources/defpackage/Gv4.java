package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Gv4 {
    public final HashMap a = new HashMap();

    public final Mv4 a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new Mv4(Collections.unmodifiableMap(hashMap));
    }

    public final void b(String str, String str2, String str3) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, new HashMap());
        }
        ((Map) hashMap.get(str2)).put(str, str3);
    }
}
