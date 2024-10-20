package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CQ1 {
    public final AbstractC5584gQ1 a;
    public final ArrayList b = new ArrayList();
    public final C4553dQ1 c;
    public C5928hQ1 d;

    public CQ1(AbstractC5584gQ1 abstractC5584gQ1) {
        this.a = abstractC5584gQ1;
        this.c = abstractC5584gQ1.g;
    }

    public final DQ1 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((DQ1) arrayList.get(i)).b.equals(str)) {
                return (DQ1) arrayList.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + this.c.a.getPackageName() + " }";
    }
}
