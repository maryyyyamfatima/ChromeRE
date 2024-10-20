package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WL1 extends VL1 {
    public final /* synthetic */ C3163Yi3 a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C3163Yi3 c3163Yi3 = this.a;
        c3163Yi3.b();
        Map map = c3163Yi3.g;
        if (map == null) {
            return EnumC2561Ts1.a;
        }
        return new C2903Wi3(c3163Yi3, map.entrySet().iterator());
    }

    public WL1(C3163Yi3 c3163Yi3) {
        this.a = c3163Yi3;
    }

    @Override // defpackage.VL1
    public final Map a() {
        return this.a;
    }
}
