package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MY extends AbstractC3724b0 {
    public final Object a;
    public int g;
    public final /* synthetic */ OY h;

    public MY(OY oy, int i) {
        this.h = oy;
        Object obj = OY.o;
        this.a = oy.c(i);
        this.g = i;
    }

    @Override // defpackage.AbstractC3724b0, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    public final void a() {
        int i = this.g;
        Object obj = this.a;
        OY oy = this.h;
        if (i == -1 || i >= oy.size() || !V82.a(obj, oy.c(this.g))) {
            Object obj2 = OY.o;
            this.g = oy.b(obj);
        }
    }

    @Override // defpackage.AbstractC3724b0, java.util.Map.Entry
    public final Object getValue() {
        OY oy = this.h;
        Map a = oy.a();
        if (a != null) {
            return a.get(this.a);
        }
        a();
        int i = this.g;
        if (i == -1) {
            return null;
        }
        return oy.j(i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        OY oy = this.h;
        Map a = oy.a();
        Object obj2 = this.a;
        if (a != null) {
            return a.put(obj2, obj);
        }
        a();
        int i = this.g;
        if (i != -1) {
            Object j = oy.j(i);
            oy.h()[this.g] = obj;
            return j;
        }
        oy.put(obj2, obj);
        return null;
    }
}
