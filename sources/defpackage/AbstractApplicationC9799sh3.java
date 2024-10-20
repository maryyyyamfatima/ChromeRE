package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.chromium.base.BundleUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sh3 */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC9799sh3 extends Application {
    public InterfaceC0079Ap3 a;
    public C9456rh3 g;

    public final C9456rh3 c() {
        if (this.g == null) {
            C9456rh3 c9456rh3 = (C9456rh3) this.a.get();
            this.g = c9456rh3;
            c9456rh3.a = this;
        }
        return this.g;
    }

    public static void a(AbstractApplicationC9799sh3 abstractApplicationC9799sh3, Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:            if (r11 != false) goto L1070;     */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractApplicationC9799sh3.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Application
    public void onCreate() {
        boolean isIsolated;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28) {
            isIsolated = Process.isIsolated();
            if (isIsolated) {
                try {
                    Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
                    if (bundle != null && bundle.containsKey("preloaded_fonts")) {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        cls.getMethod("currentActivityThread", new Class[0]);
                        Method method = cls.getMethod("getPackageManager", new Class[0]);
                        Field declaredField = cls.getDeclaredField("sPackageManager");
                        declaredField.setAccessible(true);
                        Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
                        declaredField.set(null, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new GR0(method.invoke(null, new Object[0]))));
                    }
                } catch (Exception e) {
                    AbstractC4851eH1.f("FontWorkaround", "Installing workaround failed, continuing without", e);
                }
            }
        }
        C10058tS1 c10058tS1 = C10058tS1.h;
        c10058tS1.getClass();
        Object obj = ThreadUtils.a;
        V60.a.registerComponentCallbacks(new ComponentCallbacks2C9715sS1(c10058tS1));
        c().b();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        c().c(i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        c().d(intent, bundle);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c().a();
    }

    public static boolean d() {
        return !V60.b().contains(":");
    }

    public static Context b(Context context) {
        return !BundleUtils.d(context, "chrome") ? context : BundleUtils.a(context, "chrome");
    }
}
