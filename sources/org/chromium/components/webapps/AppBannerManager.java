package org.chromium.components.webapps;

import android.content.Intent;
import android.util.Log;
import com.android.chrome.R;
import defpackage.AbstractC0940Hg;
import defpackage.C1320Ke;
import defpackage.C1450Le;
import defpackage.C2957Wt2;
import defpackage.ServiceConnectionC3087Xt2;
import defpackage.V60;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AppBannerManager {
    public static final C1450Le b = new C1450Le(R.string.f76960_resource_name_obfuscated_res_0x7f140618, R.string.f67630_resource_name_obfuscated_res_0x7f1401f2);
    public static final C1450Le c = new C1450Le(R.string.f76950_resource_name_obfuscated_res_0x7f140617, R.string.f67200_resource_name_obfuscated_res_0x7f1401c5);
    public static AbstractC0940Hg d;
    public static Boolean e;
    public long a;

    public static boolean isSupported() {
        if (e == null) {
            e = Boolean.valueOf(WebappsUtils.b());
        }
        return e.booleanValue();
    }

    public AppBannerManager(long j) {
        this.a = j;
    }

    public static AppBannerManager create(long j) {
        return new AppBannerManager(j);
    }

    public final void destroy() {
        this.a = 0L;
    }

    public final void fetchAppDetails(String str, String str2, String str3, int i) {
        if (d == null) {
            return;
        }
        int round = Math.round(V60.a.getResources().getDisplayMetrics().density * i);
        AbstractC0940Hg abstractC0940Hg = d;
        C1320Ke c1320Ke = new C1320Ke(this);
        ServiceConnectionC3087Xt2 serviceConnectionC3087Xt2 = (ServiceConnectionC3087Xt2) abstractC0940Hg;
        serviceConnectionC3087Xt2.getClass();
        Object obj = ThreadUtils.a;
        if (round != 0 && ApplicationStatus.hasVisibleActivities()) {
            serviceConnectionC3087Xt2.a.add(new C2957Wt2(serviceConnectionC3087Xt2, str2, str, str3, round, c1320Ke));
            if (serviceConnectionC3087Xt2.g || serviceConnectionC3087Xt2.h != null) {
                return;
            }
            Intent intent = new Intent("com.android.vending.details.IDetailsService.BIND");
            intent.setPackage("com.android.vending");
            try {
                serviceConnectionC3087Xt2.g = V60.a.bindService(intent, serviceConnectionC3087Xt2, 1);
            } catch (SecurityException e2) {
                Log.e("PhoneskyDetailsDelegate", "Failed to bind to service: ", e2);
            }
            if (serviceConnectionC3087Xt2.g) {
                return;
            }
            Log.e("PhoneskyDetailsDelegate", "Failed to bind to service. Clearing requests.");
            serviceConnectionC3087Xt2.b();
        }
    }
}
