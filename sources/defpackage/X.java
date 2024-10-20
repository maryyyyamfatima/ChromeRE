package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class X extends AbstractC5098f0 implements Serializable {
    public final transient Map h;
    public transient int i;

    public abstract Collection c();

    public abstract Collection f(Collection collection);

    public abstract Collection g(Object obj, Collection collection);

    public X(OY oy) {
        oy.isEmpty();
        this.h = oy;
    }

    public boolean e(Object obj, Object obj2) {
        Map map = this.h;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection c = c();
            if (c.add(obj2)) {
                this.i++;
                map.put(obj, c);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.i++;
        return true;
    }

    public Set d() {
        return new J(this, this.h);
    }

    public Map b() {
        return new H(this, this.h);
    }
}
