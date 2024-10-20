package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10223tv0 {
    public Object a;
    public final HashSet b = new HashSet();

    public C10223tv0(Float f) {
        this.a = f;
    }

    public final void a(Object obj) {
        Object obj2 = this.a;
        if (obj2 != obj) {
            if (obj2 == null || !obj2.equals(obj)) {
                this.a = obj;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    C8509ov0 c8509ov0 = (C8509ov0) it.next();
                    for (WZ wz : (Set) c8509ov0.a.get(this)) {
                        Object obj3 = c8509ov0.c.get(wz);
                        if (wz.e0() && WZ.i0(wz)) {
                            SparseArray Y = wz.Y();
                            for (int i = 0; i < Y.size(); i++) {
                                if (Y.valueAt(i) == this) {
                                    C8509ov0.a(Y.keyAt(i), this, (View) obj3);
                                }
                            }
                        }
                        for (C10223tv0 c10223tv0 : WZ.C) {
                            if (this == c10223tv0) {
                                throw new RuntimeException("Components that have dynamic Props must override this method");
                            }
                        }
                    }
                }
            }
        }
    }
}
