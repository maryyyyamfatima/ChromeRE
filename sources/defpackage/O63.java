package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.MenuItem;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class O63 extends N63 {
    public static ComponentName f() {
        String i = O83.a.i("Chrome.Sharing.LastSharedComponentName", null);
        if (i == null) {
            return null;
        }
        return ComponentName.unflattenFromString(i);
    }

    public static void h(C6862k73 c6862k73, ComponentName componentName) {
        Intent c = N63.c(c6862k73);
        c.addFlags(50331648);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ChromeSharingHubLaunchAdjacent")) {
            c.addFlags(4096);
        }
        c.setComponent(componentName);
        N63.a(c6862k73.a, c, null);
    }

    public static void i(C6862k73 c6862k73, Profile profile, boolean z) {
        if (z) {
            c6862k73.n = new L63(profile, c6862k73.n);
        }
        Object obj = M63.g;
        N63.d(0);
        M63.a(c6862k73.a, N63.c(c6862k73), c6862k73.n);
    }

    public static void e(Context context, MenuItem menuItem) {
        Pair g = g(N63.b());
        Drawable drawable = (Drawable) g.first;
        CharSequence charSequence = (CharSequence) g.second;
        menuItem.setIcon(drawable);
        if (charSequence != null) {
            menuItem.setTitle(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140142, charSequence));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair g(Intent intent) {
        boolean z;
        CharSequence charSequence;
        Drawable activityIcon;
        String str;
        ComponentName f = f();
        boolean z2 = true;
        if (f != null) {
            intent.setPackage(f.getPackageName());
            Iterator it = AbstractC3017Xf2.b(intent, 0).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                str = activityInfo.applicationInfo.packageName;
                if (f.equals(new ComponentName(str, activityInfo.name))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Drawable drawable = null;
        if (z) {
            PackageManager packageManager = V60.a.getPackageManager();
            try {
                try {
                    C7432ln3 c = C7432ln3.c();
                    try {
                        activityIcon = packageManager.getActivityIcon(f);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        CharSequence loadLabel = packageManager.getActivityInfo(f, 0).loadLabel(packageManager);
                        c.close();
                        charSequence = loadLabel;
                        drawable = activityIcon;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            c.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    charSequence = null;
                    drawable = str;
                    z2 = false;
                    EI2.b("Android.IsLastSharedAppInfoRetrieved", z2);
                    return new Pair(drawable, charSequence);
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                charSequence = null;
                z2 = false;
                EI2.b("Android.IsLastSharedAppInfoRetrieved", z2);
                return new Pair(drawable, charSequence);
            }
            EI2.b("Android.IsLastSharedAppInfoRetrieved", z2);
        } else {
            charSequence = null;
        }
        return new Pair(drawable, charSequence);
    }
}
