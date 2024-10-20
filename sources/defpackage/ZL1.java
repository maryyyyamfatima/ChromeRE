package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ZL1 extends AbstractMap {
    public transient Set a;
    public transient Set g;
    public transient YL1 h;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set a = a();
        this.a = a;
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        Set b = b();
        this.g = b;
        return b;
    }

    public Set b() {
        return new XL1(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        YL1 yl1 = this.h;
        if (yl1 != null) {
            return yl1;
        }
        YL1 yl12 = new YL1(this);
        this.h = yl12;
        return yl12;
    }
}
