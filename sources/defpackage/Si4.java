package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class Si4 {
    public static Qi4 a(Context context) {
        Ri4 c = c(context);
        if (c != null) {
            return new G50(c.a, c.b);
        }
        return new C9559rz1(context);
    }

    public static Ri4 c(Context context) {
        ArrayList b = b(context);
        if (b == null) {
            return null;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str);
            if (acquireContentProviderClient != null) {
                return new Ri4(acquireContentProviderClient, str);
            }
        }
        return null;
    }

    public static ArrayList b(Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
            return arrayList;
        }
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            String str = providerInfo.packageName;
            if (str != null && str.startsWith("com.google.")) {
                arrayList2.add(providerInfo.authority);
            }
        }
        return arrayList2;
    }
}
