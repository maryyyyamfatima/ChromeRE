package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7045kg2 {
    public static final C6701jg2 a = new C6701jg2();

    public static void a(Class cls, List list) {
        if (list == null || list.size() == 0 || ((String) a.get(cls)) == null) {
            return;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }
}
