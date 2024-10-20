package defpackage;

import android.app.role.RoleManager;
import android.content.Intent;
import androidx.appcompat.app.a;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pj0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8780pj0 {
    public static boolean a(a aVar, C10285u6 c10285u6, boolean z) {
        Intent createRequestRoleIntent;
        if (C7749mj0.b == null) {
            C7749mj0.b = new C7749mj0();
        }
        if (!b(C7749mj0.b, aVar, z)) {
            return false;
        }
        Q83 q83 = O83.a;
        q83.d("Chrome.DefaultBrowserPromo.PromoedCount");
        q83.q((int) TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()), "Chrome.DefaultBrowserPromo.LastPromoTime");
        C7749mj0.a(AbstractC3017Xf2.d());
        createRequestRoleIntent = ((RoleManager) aVar.getSystemService("role")).createRequestRoleIntent("android.app.role.BROWSER");
        c10285u6.z(createRequestRoleIntent, new InterfaceC4352cp4() { // from class: oj0
            @Override // defpackage.InterfaceC4352cp4
            public final void b(Intent intent, int i) {
            }
        }, null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:            if ((r7 != -1 ? (int) (java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(java.lang.System.currentTimeMillis()) - r7) : Integer.MAX_VALUE) < 0) goto L319;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(defpackage.C7749mj0 r7, android.content.Context r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8780pj0.b(mj0, android.content.Context, boolean):boolean");
    }
}
