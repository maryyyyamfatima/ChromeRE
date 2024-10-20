package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.BundleUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.background_task_scheduler.ChromeBackgroundTaskFactory;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vM */
/* loaded from: classes.dex */
public class C10712vM extends C9456rh3 {
    public static final Object b = new Object();
    public static volatile C12185zf0 c;

    public static boolean f(int i) {
        return (i >= 10 && i < 20) || i >= 60;
    }

    @Override // defpackage.C9456rh3
    public final void b() {
        InterfaceC2271Rm1 c0169Bh3;
        if (AbstractApplicationC9799sh3.d()) {
            FR0 a = FR0.a();
            AbstractApplicationC9799sh3 abstractApplicationC9799sh3 = this.a;
            a.a.getClass();
            if (!a.c) {
                a.c = true;
                Context applicationContext = abstractApplicationC9799sh3.getApplicationContext();
                ER0 er0 = new ER0(a);
                for (Integer num : a.b) {
                    int intValue = num.intValue();
                    ThreadLocal threadLocal = GP2.a;
                    if (applicationContext.isRestricted()) {
                        er0.a(-4);
                    } else {
                        GP2.c(applicationContext, intValue, new TypedValue(), 0, er0, false, false);
                    }
                }
                a.e = SystemClock.elapsedRealtime();
            }
            if (UN.v.a()) {
                new Thread(new Runnable() { // from class: tM
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj = C10712vM.b;
                        b.n.b();
                    }
                }).start();
            }
            if (ViewTreeObserverOnDrawListenerC5921hP.g == null) {
                ViewTreeObserverOnDrawListenerC5921hP.g = new ViewTreeObserverOnDrawListenerC5921hP();
            }
            ApplicationStatus.f(ViewTreeObserverOnDrawListenerC5921hP.g);
            if (BundleUtils.c()) {
                C9692sN3 c9692sN3 = new C9692sN3();
                try {
                    Object obj = ThreadUtils.a;
                    if (!AbstractC0689Fh3.a) {
                        C7432ln3 e = C7432ln3.e();
                        try {
                            C8771ph3.a(V60.a, false);
                            e.close();
                            AbstractC0689Fh3.a = true;
                        } catch (Throwable th) {
                            try {
                                e.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    if (L5.a == null) {
                        if (!BundleUtils.c()) {
                            c0169Bh3 = new C0670Fe();
                        } else {
                            c0169Bh3 = new C0169Bh3();
                        }
                        J5 j5 = new J5(c0169Bh3);
                        ApplicationStatus.f(j5);
                        L5.a = j5;
                    }
                    C7052kh3.a();
                    c9692sN3.close();
                } catch (Throwable th2) {
                    try {
                        c9692sN3.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            }
            ChromeBackgroundTaskFactory.setAsDefault();
            Y60.a = X60.a;
            AbstractC12211zj2.a.a(new CC2());
            AppHooks.get().t().a();
        }
    }

    @Override // defpackage.C9456rh3
    public final void c(int i) {
        C1241Jo0 c1241Jo0;
        if (f(i) && (c1241Jo0 = AbstractC6474j01.a) != null) {
            Set set = c1241Jo0.a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C1111Io0) it.next()).a = null;
            }
            set.clear();
        }
        if ((CustomTabsConnection.k != null) && f(i)) {
            EU eu = CustomTabsConnection.g().c;
            synchronized (eu) {
                Iterator it2 = new ArrayList(eu.c.keySet()).iterator();
                while (it2.hasNext()) {
                    CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) it2.next();
                    if (((DU) eu.c.get(customTabsSessionToken)).b == null) {
                        AU au = new AU(eu, customTabsSessionToken);
                        synchronized (eu) {
                            DU du = (DU) eu.c.get(customTabsSessionToken);
                            if (du != null) {
                                au.a(du);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.C9456rh3
    public final void d(Intent intent, Bundle bundle) {
        if (!VrModuleProvider.b().d()) {
            VrModuleProvider.d().getClass();
            if (!Hi4.b(intent)) {
                VrModuleProvider.b().N(new C10369uM(this, intent, bundle));
                return;
            }
        }
        super.d(intent, bundle);
    }

    @Override // defpackage.C9456rh3
    public final void a() {
        if (!AbstractApplicationC9799sh3.d()) {
            return;
        }
        C0624Eu3 a = C0624Eu3.a();
        boolean z = a.b;
        boolean z2 = (V60.a.getResources().getConfiguration().uiMode & 48) == 32;
        a.b = z2;
        if (z == z2) {
            return;
        }
        Iterator it = a.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0494Du3) c11814ya2.next()).a();
            }
        }
    }

    public static C12185zf0 e() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new C12185zf0(new C9340rM(), new C8767ph());
                }
            }
        }
        return c;
    }
}
