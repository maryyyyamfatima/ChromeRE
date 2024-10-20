package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZV3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final HashMap d = new HashMap();

    public final Object a(YV3 yv3) {
        return this.d.get(yv3);
    }

    public final void b(YV3 yv3) {
        if (this.d.remove(yv3) == null) {
            return;
        }
        int i = yv3.a;
        String str = yv3.b;
        if (i == 1) {
            this.a.remove(str);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.c.remove(str);
            return;
        }
        LinkedHashMap linkedHashMap = this.b;
        String str2 = yv3.c;
        Map map = (Map) linkedHashMap.get(str2);
        map.remove(str);
        if (map.isEmpty()) {
            linkedHashMap.remove(str2);
        }
    }
}
