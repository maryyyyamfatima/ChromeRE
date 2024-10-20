package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.ChromeTabbedActivity2;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7851n02 implements InterfaceC11179wj {
    public static final C7851n02 i = new C7851n02();
    public final boolean a = r();
    public Boolean g;
    public WeakReference h;

    public static long u(int i2) {
        return O83.a.h(AbstractC6265iP.j.b(String.valueOf(i2)));
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        Context context = V60.a;
        try {
            return context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), ChromeTabbedActivity.class.getCanonicalName()), 0).launchMode == 4;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static int g() {
        return r() ? 5 : 3;
    }

    public static boolean p(Activity activity) {
        if (activity == null) {
            return false;
        }
        return AbstractC9771sd.f(activity);
    }

    public static boolean n(Activity activity) {
        return AbstractC9771sd.d(activity).size() == 2;
    }

    public final boolean s(Activity activity) {
        return (p(activity) || n(activity)) && h(activity) != null;
    }

    public static boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 > 31 || Build.VERSION.CODENAME.equals("Sv2"))) {
            if (!(i2 >= 30 && Build.MANUFACTURER.toUpperCase(Locale.ENGLISH).equals("SAMSUNG"))) {
                return false;
            }
        }
        return true;
    }

    public final Class h(Activity activity) {
        if (this.a) {
            return ChromeTabbedActivity.class;
        }
        boolean z = activity instanceof ChromeTabbedActivity2;
        C7851n02 c7851n02 = i;
        if (z) {
            ApplicationStatus.f(c7851n02);
            return ChromeTabbedActivity.class;
        }
        if (!(activity instanceof ChromeTabbedActivity)) {
            return null;
        }
        this.g = Boolean.TRUE;
        ApplicationStatus.f(c7851n02);
        return ChromeTabbedActivity2.class;
    }

    public static void v(Intent intent, Activity activity, Class cls) {
        intent.setClass(activity, cls);
        intent.addFlags(4096);
        if (!r() && cls.equals(ChromeTabbedActivity.class) && t()) {
            intent.setFlags(intent.getFlags() & (-4097));
        }
        intent.putExtra("com.android.browser.application_id", activity.getPackageName());
        intent.putExtra("create_new_tab", true);
    }

    public static Intent c(int i2, Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) ChromeTabbedActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        if (i2 != -1) {
            intent.putExtra("org.chromium.chrome.browser.window_id", i2);
        }
        if (z) {
            intent.putExtra("com.android.chrome.prefer_new", true);
        }
        if (z2) {
            intent.addFlags(4096);
        }
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", true);
        AbstractC2281Ro1.a(intent);
        return intent;
    }

    public static Bundle i(Activity activity) {
        int i2;
        i.getClass();
        if (!n(activity)) {
            return null;
        }
        ArrayList d = AbstractC9771sd.d(activity);
        Display a = DisplayAndroidManager.a(activity);
        if (d.size() != 0) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                i2 = ((Integer) it.next()).intValue();
                if (i2 != a.getDisplayId()) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            throw new IllegalStateException("Attempting to open window in other display, but one is not found");
        }
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        makeBasic.setLaunchDisplayId(i2);
        return makeBasic.toBundle();
    }

    public static int f() {
        int i2 = 0;
        for (int i3 = 0; i3 < g(); i3++) {
            if (UZ1.u(i3)) {
                Q83 q83 = O83.a;
                if ((q83.f(0, AbstractC6265iP.h.b(String.valueOf(i3))) == 0 && q83.f(-1, AbstractC6265iP.e.b(String.valueOf(i3))) == -1) ? false : true) {
                    i2++;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i2) {
        if (i2 == 3 && (activity instanceof ChromeTabbedActivity)) {
            this.h = new WeakReference((ChromeTabbedActivity) activity);
        }
    }

    public static String d(ActivityManager.AppTask appTask) {
        ComponentName componentName;
        ActivityManager.RecentTaskInfo d = AbstractC2599Ua.d(appTask);
        if (d == null || (componentName = d.baseActivity) == null) {
            return "";
        }
        String className = componentName.getClassName();
        return TextUtils.equals(className, "com.google.android.apps.chrome.Main") ? ChromeTabbedActivity.class.getName() : className;
    }

    public static Activity e(Activity activity) {
        ArrayList b = ApplicationStatus.b();
        int taskId = activity.getTaskId();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Activity activity2 = (Activity) it.next();
            int taskId2 = activity2.getTaskId();
            if (taskId2 != taskId && m(activity2)) {
                Iterator it2 = b.iterator();
                while (it2.hasNext()) {
                    Activity activity3 = (Activity) it2.next();
                    if ((activity3 instanceof ChromeTabbedActivity) && activity3.getTaskId() == taskId2) {
                        return activity3;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        Iterator it = ApplicationStatus.b().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity.getClass().equals(ChromeTabbedActivity.class)) {
                z = true;
            } else if (activity.getClass().equals(ChromeTabbedActivity2.class)) {
                z2 = true;
            }
        }
        if (z && z2) {
            return true;
        }
        Iterator<ActivityManager.AppTask> it2 = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
        while (it2.hasNext()) {
            String d = d(it2.next());
            if (TextUtils.equals(d, ChromeTabbedActivity.class.getName())) {
                z = true;
            } else if (TextUtils.equals(d, ChromeTabbedActivity2.class.getName())) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public final Class j(Context context, Intent intent) {
        Boolean bool;
        ChromeTabbedActivity chromeTabbedActivity;
        boolean z;
        if (!this.a && Build.VERSION.SDK_INT > 23 && ((bool = this.g) == null || bool.booleanValue())) {
            if (intent != null) {
                ComponentName componentName = AbstractC2281Ro1.a;
                try {
                    z = intent.hasExtra("org.chromium.chrome.browser.window_id");
                } catch (Throwable unused) {
                    AbstractC4851eH1.a("IntentUtils", "hasExtra failed on intent " + intent, new Object[0]);
                    z = false;
                }
                if (z) {
                    int p = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.window_id");
                    if (p == 1) {
                        return ChromeTabbedActivity.class;
                    }
                    if (p == 2) {
                        return ChromeTabbedActivity2.class;
                    }
                }
            }
            boolean l = l(context, ChromeTabbedActivity2.class.getName());
            if (!l) {
                this.g = Boolean.FALSE;
                return ChromeTabbedActivity.class;
            }
            boolean l2 = l(context, ChromeTabbedActivity.class.getName());
            if (!l2) {
                return ChromeTabbedActivity2.class;
            }
            Iterator it = ApplicationStatus.b().iterator();
            Activity activity = null;
            Activity activity2 = null;
            while (it.hasNext()) {
                Activity activity3 = (Activity) it.next();
                if (activity3.getClass().equals(ChromeTabbedActivity.class)) {
                    activity = activity3;
                } else if (activity3.getClass().equals(ChromeTabbedActivity2.class)) {
                    activity2 = activity3;
                }
            }
            boolean m = m(activity);
            if (m(activity2) ^ m) {
                return m ? ChromeTabbedActivity.class : ChromeTabbedActivity2.class;
            }
            WeakReference weakReference = this.h;
            if (weakReference != null && (chromeTabbedActivity = (ChromeTabbedActivity) weakReference.get()) != null) {
                Class<?> cls = chromeTabbedActivity.getClass();
                if ((!l2 || !cls.equals(ChromeTabbedActivity.class)) && l && cls.equals(ChromeTabbedActivity2.class)) {
                    return ChromeTabbedActivity2.class;
                }
            }
        }
        return ChromeTabbedActivity.class;
    }

    public static boolean l(Context context, String str) {
        Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(d(it.next()), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Activity activity) {
        if (activity == null) {
            return false;
        }
        int c = ApplicationStatus.c(activity);
        return c == 3 || c == 4;
    }

    public static SparseBooleanArray k() {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (m(activity)) {
                sparseBooleanArray.put(activity.getTaskId(), true);
            }
        }
        return sparseBooleanArray;
    }

    public static boolean q(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager.hasSystemFeature((String) packageManager.getClass().getField("FEATURE_MULTIWINDOW").get(null))) {
                return (((Integer) activity.getClass().getMethod("getWindowMode", null).invoke(activity, null)).intValue() & ((Integer) Class.forName("android.view.WindowManagerPolicy").getField("WINDOW_MODE_FREESTYLE").get(null)).intValue()) != 0;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean t() {
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            if (((Activity) it.next()).getClass().equals(ChromeTabbedActivity.class)) {
                return true;
            }
        }
        return false;
    }
}
