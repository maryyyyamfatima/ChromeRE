package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6614jQ1 {
    public static final C6614jQ1 c = new C6614jQ1(new Bundle(), null);
    public final Bundle a;
    public List b;

    public C6614jQ1(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.b);
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final boolean d() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6614jQ1)) {
            return false;
        }
        C6614jQ1 c6614jQ1 = (C6614jQ1) obj;
        a();
        c6614jQ1.a();
        return this.b.equals(c6614jQ1.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }

    public static C6614jQ1 b(Bundle bundle) {
        if (bundle != null) {
            return new C6614jQ1(bundle, null);
        }
        return null;
    }
}
