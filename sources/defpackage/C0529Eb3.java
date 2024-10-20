package defpackage;

import android.app.DirectAction$Builder;
import android.content.LocusId;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529Eb3 {
    public final String a;
    public final List b;
    public final List c;

    public C0529Eb3(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final List a() {
        Bundle bundle = new Bundle();
        bundle.putBundle("arguments", b(this.b));
        bundle.putBundle("results", b(this.c));
        return Collections.singletonList(new DirectAction$Builder(this.a).setExtras(bundle).setLocusId(new LocusId("unused")).build());
    }

    public static Bundle b(List list) {
        String str;
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3315Zn0 c3315Zn0 = (C3315Zn0) it.next();
            Bundle bundle2 = new Bundle();
            int i = c3315Zn0.b;
            if (i == 0) {
                str = "String";
            } else if (i == 1) {
                str = "Boolean";
            } else {
                if (i != 2) {
                    throw new IllegalStateException(AbstractC9076qb1.a("Unknown type: ", i));
                }
                str = "Int";
            }
            bundle2.putCharSequence("type", str);
            bundle2.putBoolean("required", c3315Zn0.c);
            bundle.putBundle(c3315Zn0.a, bundle2);
        }
        return bundle;
    }
}
