package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U83 {
    public AB1 a;
    public final List b;
    public List c;

    public U83(AB1 ab1, List list) {
        this.a = ab1;
        this.b = list;
    }

    public final List a() {
        List list = this.b;
        if (list == null && this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = this.c;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
