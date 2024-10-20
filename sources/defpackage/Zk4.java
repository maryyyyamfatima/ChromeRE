package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.webapps.WebApkUpdateManager$WebApkUpdateCallback;
import org.chromium.chrome.browser.webapps.WebappActivity;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Zk4 extends S02 {
    public C12237zn4 f;
    public boolean g;

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
    }

    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return true;
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        C12237zn4 c;
        WeakReference weakReference;
        C7432ln3 c2 = C7432ln3.c();
        try {
            WebappRegistry webappRegistry = Wn4.a;
            webappRegistry.d(null);
            c2.close();
            webappRegistry.getClass();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : webappRegistry.b.entrySet()) {
                C12237zn4 c12237zn4 = (C12237zn4) entry.getValue();
                if (!TextUtils.isEmpty(c12237zn4.b.getString("pending_update_file_path", null)) && AbstractC4983eg2.d(V60.a, c12237zn4.b.getString("webapk_package_name", null))) {
                    arrayList.add((String) entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    return arrayList.isEmpty() ? 2 : 1;
                }
                c = Wn4.a.c((String) it.next());
                String str = c.a;
                Iterator it2 = ApplicationStatus.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        weakReference = null;
                        break;
                    }
                    Activity activity = (Activity) it2.next();
                    if (activity instanceof WebappActivity) {
                        AbstractActivityC1529Lu abstractActivityC1529Lu = (AbstractActivityC1529Lu) activity;
                        In4 F = abstractActivityC1529Lu.T0.F();
                        if (F != null && TextUtils.equals(str, F.a)) {
                            weakReference = new WeakReference(abstractActivityC1529Lu);
                            break;
                        }
                    }
                }
                if (weakReference == null) {
                    break;
                }
            } while (weakReference.get() != null);
            this.f = c;
            this.g = arrayList.size() > 1;
            return 0;
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Yk4] */
    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, final InterfaceC2559Ts interfaceC2559Ts) {
        final C12237zn4 c12237zn4 = this.f;
        final ?? r4 = new Runnable() { // from class: Yk4
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2559Ts.a(Zk4.this.g);
            }
        };
        AbstractC4851eH1.d("WebApkUpdateManager", "Update now", new Object[0]);
        WebApkUpdateManager$WebApkUpdateCallback webApkUpdateManager$WebApkUpdateCallback = new WebApkUpdateManager$WebApkUpdateCallback() { // from class: Rk4
            @Override // org.chromium.chrome.browser.webapps.WebApkUpdateManager$WebApkUpdateCallback
            public final void onResultFromNative(int i, boolean z) {
                C12237zn4 c12237zn42 = C12237zn4.this;
                c12237zn42.b(false);
                c12237zn42.b.edit().putBoolean("update_scheduled", false).apply();
                Wk4.k(c12237zn42, i, z);
                c12237zn42.a();
                r4.run();
            }
        };
        EI2.h(3, 4, "WebApk.Update.RequestSent");
        N.MEqkTChv(c12237zn4.b.getString("pending_update_file_path", null), webApkUpdateManager$WebApkUpdateCallback);
    }
}
