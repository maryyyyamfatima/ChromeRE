package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4312cj0 extends AbstractC0185Bl {
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Context context = V60.a;
        C4656dj0 c4656dj0 = new C4656dj0();
        ResolveInfo d = AbstractC3017Xf2.d();
        if (d != null && d.match != 0) {
            c4656dj0.d = true;
            c4656dj0.b = TextUtils.equals(context.getPackageName(), d.activityInfo.applicationInfo.packageName);
            c4656dj0.c = (d.activityInfo.applicationInfo.flags & 1) != 0;
        }
        HashSet hashSet = new HashSet();
        List<ResolveInfo> b = AbstractC3017Xf2.b(AbstractC3017Xf2.a, 983040);
        if (b != null) {
            for (ResolveInfo resolveInfo : b) {
                if (hashSet.add(resolveInfo.activityInfo.packageName)) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                        if (TextUtils.equals(context.getPackageName(), resolveInfo.activityInfo.applicationInfo.packageName)) {
                            c4656dj0.a = true;
                        }
                        c4656dj0.f++;
                    }
                }
            }
        }
        c4656dj0.e = hashSet.size();
        return c4656dj0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String str;
        int i;
        C4656dj0 c4656dj0 = (C4656dj0) obj;
        if (c4656dj0 == null) {
            return;
        }
        EI2.d(c4656dj0.f, c4656dj0.a ? "Mobile.DefaultBrowser.SystemBrowserCount.ChromeSystem" : "Mobile.DefaultBrowser.SystemBrowserCount.ChromeNotSystem");
        if (c4656dj0.d) {
            str = c4656dj0.b ? "Mobile.DefaultBrowser.BrowserCount.ChromeDefault" : "Mobile.DefaultBrowser.BrowserCount.OtherDefault";
        } else {
            str = "Mobile.DefaultBrowser.BrowserCount.NoDefault";
        }
        EI2.d(c4656dj0.e, str);
        if (!c4656dj0.d) {
            i = 0;
        } else if (c4656dj0.b) {
            i = c4656dj0.c ? 1 : 2;
        } else {
            i = c4656dj0.c ? 3 : 4;
        }
        EI2.h(i, 5, "Mobile.DefaultBrowser.State");
    }
}
