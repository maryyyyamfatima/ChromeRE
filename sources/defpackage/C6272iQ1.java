package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6272iQ1 {
    public ArrayList a;

    public C6272iQ1() {
    }

    public C6272iQ1(C6614jQ1 c6614jQ1) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c6614jQ1.a();
        if (c6614jQ1.b.isEmpty()) {
            return;
        }
        this.a = new ArrayList(c6614jQ1.b);
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final C6614jQ1 b() {
        if (this.a == null) {
            return C6614jQ1.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new C6614jQ1(bundle, this.a);
    }
}
