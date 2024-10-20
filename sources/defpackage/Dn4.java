package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Dn4 {
    public final Activity a;
    public final String b;
    public final boolean c;
    public final ArrayList d = new ArrayList();

    public Dn4(Activity activity, PC pc) {
        this.a = activity;
        In4 F = pc.F();
        this.b = F != null ? F.a : null;
        this.c = pc.K();
    }

    public final void a(C12237zn4 c12237zn4, boolean z) {
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Cn4) it.next()).a(c12237zn4, z);
        }
        arrayList.clear();
    }
}
