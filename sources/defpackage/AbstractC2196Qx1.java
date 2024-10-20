package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qx1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2196Qx1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.WEBAPK_API");
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 131072)) {
            String str = resolveInfo.serviceInfo.packageName;
            if (str != null) {
                if (AbstractC3641al4.c(context, str) == 1) {
                    try {
                        Kn4 c = Kn4.c(AbstractC7071kk4.b(new Intent(), packageManager.getPackageInfo(resolveInfo.serviceInfo.packageName, 0).packageName, "", 0, false, false, null, null));
                        if (c != null) {
                            arrayList.add(new C1806Nx1(c.t(), c.p(), c.n(), c.s(), c.g().a(), c.q()));
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        AbstractC4851eH1.a("LaunchpadUtils", Y5.a(new StringBuilder(), resolveInfo.serviceInfo.packageName, " doesn't exist"), new Object[0]);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: Px1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C1806Nx1) obj).b.compareTo(((C1806Nx1) obj2).b);
            }
        });
        return arrayList;
    }
}
