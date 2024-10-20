package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ro1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2281Ro1 {
    public static ComponentName a;
    public static final Object b = new Object();

    public static void a(Intent intent) {
        if (e(V60.a, intent)) {
            intent.putExtra("trusted_application_code_extra", b());
        }
    }

    public static boolean f(ResolveInfo resolveInfo) {
        if (Build.VERSION.SDK_INT >= 26) {
            return resolveInfo.isInstantAppAvailable;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return "com.google.android.gms.instantapps.routing.EphemeralInstallerActivity".equals(activityInfo.name);
        }
        return false;
    }

    public static boolean j(Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getBooleanExtra failed on intent " + intent, new Object[0]);
            return z;
        }
    }

    public static boolean i(Bundle bundle, String str, boolean z) {
        try {
            return bundle.getBoolean(str, z);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getBoolean failed on bundle " + bundle, new Object[0]);
            return z;
        }
    }

    public static int p(int i, Intent intent, String str) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getIntExtra failed on intent " + intent, new Object[0]);
            return i;
        }
    }

    public static int m(String str, int i, Bundle bundle) {
        try {
            return bundle.getInt(str, i);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getInt failed on bundle " + bundle, new Object[0]);
            return i;
        }
    }

    public static int[] o(Intent intent, String str) {
        try {
            return intent.getIntArrayExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getIntArrayExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static int[] n(String str, Bundle bundle) {
        try {
            return bundle.getIntArray(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getIntArray failed on bundle " + bundle, new Object[0]);
            return null;
        }
    }

    public static long q(Intent intent, String str, long j) {
        try {
            return intent.getLongExtra(str, j);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getLongExtra failed on intent " + intent, new Object[0]);
            return j;
        }
    }

    public static String w(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getStringExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static String u(String str, Bundle bundle) {
        try {
            return bundle.getString(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getString failed on bundle " + bundle, new Object[0]);
            return null;
        }
    }

    public static Bundle k(Intent intent, String str) {
        try {
            return intent.getBundleExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getBundleExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static Parcelable r(String str, Bundle bundle) {
        try {
            return bundle.getParcelable(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getParcelable failed on bundle " + bundle, new Object[0]);
            return null;
        }
    }

    public static Parcelable s(Intent intent, String str) {
        try {
            return intent.getParcelableExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getParcelableExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static ArrayList c(Intent intent, String str) {
        try {
            return intent.getParcelableArrayListExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getParcelableArrayListExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static ArrayList v(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getStringArrayListExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static byte[] l(Intent intent, String str) {
        try {
            return intent.getByteArrayExtra(str);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getByteArrayExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static Serializable t(Intent intent, String str) {
        try {
            return intent.getSerializableExtra(str);
        } catch (ClassCastException e) {
            AbstractC4851eH1.a("IntentUtils", "Invalide class for Serializable: ".concat(str), e);
            return null;
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "getSerializableExtra failed on intent " + intent, new Object[0]);
            return null;
        }
    }

    public static void x(Intent intent, IBinder iBinder) {
        Bundle bundle = new Bundle();
        try {
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("IntentUtils", "putBinder failed on bundle " + bundle, new Object[0]);
        }
        intent.putExtras(bundle);
    }

    public static Intent y(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            intent.getBooleanExtra("TriggerUnparcel", false);
            return intent;
        } catch (BadParcelableException e) {
            AbstractC4851eH1.a("IntentUtils", "Invalid incoming intent.", e);
            return intent.replaceExtras((Bundle) null);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ClassNotFoundException) {
                AbstractC4851eH1.a("IntentUtils", "Invalid incoming intent.", e2);
                return intent.replaceExtras((Bundle) null);
            }
            throw e2;
        }
    }

    public static boolean g(Intent intent) {
        return intent != null && TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 1048576) == 0;
    }

    public static int d(boolean z) {
        if (z) {
            return (!z || Build.VERSION.SDK_INT < 31) ? 0 : 33554432;
        }
        return 67108864;
    }

    public static boolean e(Context context, Intent intent) {
        boolean z = !TextUtils.isEmpty(intent.getPackage());
        boolean z2 = z && context.getPackageName().equals(intent.getPackage());
        boolean z3 = intent.getComponent() != null;
        if (z3 && context.getPackageName().equals(intent.getComponent().getPackageName())) {
            if (z) {
                return z2;
            }
            return true;
        }
        if (z2) {
            return !z3;
        }
        return false;
    }

    public static PendingIntent b() {
        Intent intent = new Intent();
        Context context = V60.a;
        String packageName = context.getPackageName();
        synchronized (b) {
            if (a == null) {
                a = new ComponentName(packageName, "FakeClass");
            }
        }
        intent.setComponent(a);
        return PendingIntent.getActivity(context, 0, intent, d(false));
    }

    public static boolean h(Intent intent) {
        PendingIntent pendingIntent;
        if (intent == null || (pendingIntent = (PendingIntent) s(intent, "trusted_application_code_extra")) == null) {
            return false;
        }
        return b().equals(pendingIntent);
    }
}
