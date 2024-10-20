package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pY3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8719pY3 {
    public final Context a;
    public final HashMap b = new HashMap();

    public C8719pY3(Context context) {
        this.a = context.getApplicationContext();
    }

    public static Intent a(Context context, Uri uri, HashSet hashSet, boolean z) {
        boolean z2;
        InterfaceC2367Sf2 c2237Rf2;
        if (hashSet.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C5920hO3 c5920hO3 = (C5920hO3) it2.next();
                    PackageManager packageManager = context.getPackageManager();
                    C6606jO3 c6606jO3 = c5920hO3.a;
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            c2237Rf2 = new C2107Qf2();
                        } else {
                            c2237Rf2 = new C2237Rf2();
                        }
                        z2 = c2237Rf2.b(str2, packageManager, c6606jO3);
                    } catch (PackageManager.NameNotFoundException | IOException e) {
                        Log.e("PackageIdentity", "Could not check if package matches token.", e);
                        z2 = false;
                    }
                    if (z2) {
                        str = str2;
                        break;
                    }
                }
            }
        }
        if (str == null) {
            if (z) {
                Log.w("TWAConnectionPool", "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction("android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE");
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            if (z) {
                Log.w("TWAConnectionPool", "Could not find TWAService for ".concat(str));
            }
            return null;
        }
        if (z) {
            Log.i("TWAConnectionPool", "Found " + resolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }
}
