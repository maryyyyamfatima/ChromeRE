package org.chromium.chrome.browser.feed;

import J.N;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.bumptech.glide.a;
import defpackage.AZ0;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9664sI0;
import defpackage.C0676Ff0;
import defpackage.C12075zK0;
import defpackage.C1421Ky0;
import defpackage.C5892hJ0;
import defpackage.DE0;
import defpackage.IN2;
import defpackage.InterfaceC2678Up3;
import defpackage.NJ0;
import defpackage.V60;
import defpackage.VB2;
import defpackage.WB2;
import defpackage.WK0;
import defpackage.WN2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.app.feed.ProcessScopeDependencyProviderFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FeedServiceBridge {
    public static VB2 a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class UnreadContentObserver {
        public long a = N.MrqoIpvG(this, true);

        public void hasUnreadContentChanged(boolean z) {
        }
    }

    public static VB2 a() {
        WB2 wb2;
        VB2 vb2 = a;
        if (vb2 != null) {
            return vb2;
        }
        if (C5892hJ0.a == null) {
            C5892hJ0.a = new C5892hJ0();
        }
        C5892hJ0.a.getClass();
        VB2 vb22 = null;
        try {
            wb2 = (WB2) ProcessScopeDependencyProviderFactory.class.getDeclaredMethod("create", new Class[0]).invoke(null, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            wb2 = null;
        }
        if (wb2 == null) {
            return null;
        }
        Context context = V60.a;
        if (BundleUtils.d(context, "feedv2")) {
            context = BundleUtils.a(context, "feedv2");
        }
        try {
            vb22 = (VB2) context.getClassLoader().loadClass("com.google.chrome.elements.ElementsProcessScopeWrapper").getMethod("createElementsProcessScope", WB2.class).invoke(null, wb2);
        } catch (ReflectiveOperationException e) {
            AbstractC4851eH1.a("FeedHooks", "Loading Elements by reflection failed. cause=%s", e.getCause(), e);
        }
        a = vb22;
        return vb22;
    }

    public static double[] getDisplayMetrics() {
        DisplayMetrics displayMetrics = V60.a.getResources().getDisplayMetrics();
        return new double[]{displayMetrics.density, displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static String getLanguageTag() {
        Locale locale;
        LocaleList locales;
        Context context = V60.a;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        return locale.toLanguageTag();
    }

    public static void clearAll() {
        WK0 a2 = WK0.a();
        if (a2.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a2.c.iterator();
        while (it.hasNext()) {
            InterfaceC2678Up3 interfaceC2678Up3 = (InterfaceC2678Up3) it.next();
            if (((C12075zK0) interfaceC2678Up3).p) {
                arrayList.add(interfaceC2678Up3);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C12075zK0 c12075zK0 = (C12075zK0) ((InterfaceC2678Up3) it2.next());
            c12075zK0.getClass();
            if (WK0.a().a) {
                c12075zK0.p = false;
                c12075zK0.f.r(false);
                AbstractC9664sI0.c(4);
            }
        }
        VB2 a3 = a();
        if (a3 != null) {
            C1421Ky0 c1421Ky0 = (C1421Ky0) a3;
            c1421Ky0.b = new C0676Ff0(c1421Ky0.a.a);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((C12075zK0) ((InterfaceC2678Up3) it3.next())).e();
        }
    }

    public static void prefetchImage(String str) {
        AZ0 az0;
        VB2 a2 = a();
        if (a2 == null || (az0 = (AZ0) ((C1421Ky0) a2).a.f.get()) == null) {
            return;
        }
        NJ0 nj0 = (NJ0) az0.a;
        IN2 M = a.d(nj0.a).o().M(str);
        M.getClass();
        final WN2 wn2 = new WN2();
        M.H(wn2, wn2, M, DE0.b);
        nj0.a(new Runnable() { // from class: zZ0
            @Override // java.lang.Runnable
            public final void run() {
                WN2 wn22 = (WN2) wn2;
                if (wn22.isDone()) {
                    return;
                }
                wn22.cancel(true);
            }
        }, 10000L);
    }
}
