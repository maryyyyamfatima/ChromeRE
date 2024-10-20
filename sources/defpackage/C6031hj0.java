package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6031hj0 extends AbstractC0185Bl {
    public final C12157za2 h = new C12157za2();

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Context context = V60.a;
        ResolveInfo d = AbstractC3017Xf2.d();
        if (d != null && d.match != 0) {
            TextUtils.equals(context.getPackageName(), d.activityInfo.applicationInfo.packageName);
            int i = d.activityInfo.applicationInfo.flags;
        }
        HashSet hashSet = new HashSet();
        List<ResolveInfo> b = AbstractC3017Xf2.b(AbstractC3017Xf2.a, 983040);
        if (b != null) {
            for (ResolveInfo resolveInfo : b) {
                if (hashSet.add(resolveInfo.activityInfo.applicationInfo.packageName)) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                        TextUtils.equals(context.getPackageName(), resolveInfo.activityInfo.applicationInfo.packageName);
                    }
                }
            }
        }
        return new C4999ej0(hashSet.size());
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        n((C4999ej0) obj);
    }

    @Override // defpackage.AbstractC0185Bl
    public final void i() {
        n(null);
    }

    public final void n(C4999ej0 c4999ej0) {
        C12157za2 c12157za2 = this.h;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                c12157za2.clear();
                return;
            }
            ((Callback) c11814ya2.next()).onResult(c4999ej0);
        }
    }
}
