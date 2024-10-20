package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class HG0 {
    public final HashMap a;
    public final HashMap b;

    public HG0() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public HG0(HG0 hg0) {
        this.a = new HashMap(hg0.a);
        HashMap hashMap = new HashMap(hg0.b);
        this.b = hashMap;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((FG0) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}
