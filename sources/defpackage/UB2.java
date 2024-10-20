package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.chrome.safebrowsing.SafeBrowsingApiHandlerInternal;
import org.chromium.base.task.PostTask;
import org.chromium.components.safe_browsing.SafeBrowsingApiBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UB2 extends RB2 {
    public final C4502dG0 f;

    public UB2(C4502dG0 c4502dG0) {
        this.f = c4502dG0;
    }

    @Override // defpackage.RB2
    public final void d() {
        super.d();
        SafeBrowsingApiHandlerInternal safeBrowsingApiHandlerInternal = new SafeBrowsingApiHandlerInternal();
        synchronized (SafeBrowsingApiBridge.a) {
            SafeBrowsingApiBridge.c = safeBrowsingApiHandlerInternal;
        }
        AbstractC7683mX3.a = new C7339lX3();
        RG1.a = new SB2(this);
        RG1.b = null;
    }

    @Override // defpackage.RB2
    public final void c() {
        super.c();
        if (C8125no2.b == null) {
            C8125no2.b = new C8125no2();
        }
        C8125no2.b.b(new Q31(), Q31.class.getName());
        if (AbstractC11403xN.a == null) {
            try {
                Class.forName("com.google.android.apps.chrome.cloudsearch.ChromeCloudSearchService");
                AbstractC11403xN.a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                AbstractC11403xN.a = Boolean.FALSE;
            }
        }
        if (AbstractC11403xN.a.booleanValue()) {
            PostTask.c(QF3.g, new Runnable() { // from class: wN
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = V60.a;
                    if (AbstractC11403xN.a == null) {
                        try {
                            Class.forName("com.google.android.apps.chrome.cloudsearch.ChromeCloudSearchService");
                            AbstractC11403xN.a = Boolean.TRUE;
                        } catch (ClassNotFoundException unused2) {
                            AbstractC11403xN.a = Boolean.FALSE;
                        }
                    }
                    boolean z = false;
                    if (AbstractC11403xN.a.booleanValue()) {
                        if (!UN.a.a()) {
                            EI2.h(1, 4, "Android.CloudSearch.EnabledState");
                        } else if (Build.VERSION.SDK_INT < 32) {
                            EI2.h(2, 4, "Android.CloudSearch.EnabledState");
                        } else if (TextUtils.equals(Build.MANUFACTURER, "Google")) {
                            EI2.h(0, 4, "Android.CloudSearch.EnabledState");
                            z = true;
                        } else {
                            EI2.h(3, 4, "Android.CloudSearch.EnabledState");
                        }
                    }
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.chrome.cloudsearch.ChromeCloudSearchService"), z ? 1 : 2, 1);
                }
            });
        }
        if (OZ2.b == null) {
            OZ2.b = new OZ2();
        }
        OZ2.b.a();
    }

    @Override // defpackage.RB2
    public final void b() {
        super.b();
        C3637al0.b().a(new TB2());
    }
}
