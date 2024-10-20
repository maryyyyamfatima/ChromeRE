package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.Task;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskGcmTaskService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11111wX0 {
    public static C11111wX0 c;
    public final Context a;
    public final C4317ck b = new C4317ck();

    public final synchronized void f(Task task) {
        Map map;
        String str = "nts:client:schedule:" + task.g;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
        try {
            g(task.a);
            if (c().b(task) && (map = (Map) this.b.get(task.a)) != null && map.containsKey(task.g)) {
                map.put(task.g, Boolean.TRUE);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public C11111wX0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC11451xW2 c() {
        /*
            r4 = this;
            int r0 = defpackage.I21.a
            android.content.Context r0 = r4.a
            java.lang.String r1 = defpackage.C11083wR2.a(r0)
            if (r1 == 0) goto L18
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            if (r1 == 0) goto L18
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r1 = -1
        L19:
            r2 = 5000000(0x4c4b40, float:7.006492E-39)
            if (r1 >= r2) goto L2b
            java.lang.String r0 = "GcmNetworkManager"
            java.lang.String r1 = "Google Play services is not available, dropping all GcmNetworkManager requests"
            android.util.Log.e(r0, r1)
            yW2 r0 = new yW2
            r0.<init>()
            return r0
        L2b:
            wW2 r1 = new wW2
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11111wX0.c():xW2");
    }

    public final void b(String str) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) BackgroundTaskGcmTaskService.class);
        String a = AbstractC4809e90.a("nts:client:cancel:", str);
        if (a.length() > 127) {
            a = a.substring(0, 127);
        }
        Trace.beginSection(a);
        try {
            h(str);
            g(componentName.getClassName());
            c().a(componentName, str);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    public final void g(String str) {
        Intent intent;
        List<ResolveInfo> queryIntentServices;
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            queryIntentServices = Collections.emptyList();
        } else {
            if (str != null) {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(context, str);
            } else {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(context.getPackageName());
            }
            queryIntentServices = packageManager.queryIntentServices(intent, 0);
        }
        if (queryIntentServices == null ? true : queryIntentServices.isEmpty()) {
            Log.e("GcmNetworkManager", str + " is not available. This may cause the task to be lost.");
            return;
        }
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return;
            }
        }
        throw new IllegalArgumentException(AbstractC4199cO1.a("The GcmTaskService class you provided ", str, " does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY"));
    }

    public final synchronized boolean a(String str, String str2) {
        Map map;
        map = (Map) this.b.get(str2);
        if (map == null) {
            map = new C4317ck();
            this.b.put(str2, map);
        }
        return map.put(str, Boolean.FALSE) == null;
    }

    public final synchronized void e(String str, String str2) {
        Map map = (Map) this.b.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.b.remove(str2);
            }
        }
    }

    public final synchronized boolean i(String str, String str2) {
        Map map = (Map) this.b.get(str2);
        boolean z = false;
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    public final synchronized boolean d(String str) {
        return this.b.containsKey(str);
    }
}
