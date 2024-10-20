package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.chrome.browser.autofill.settings.AndroidPaymentAppsFragment;
import org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge;
import org.chromium.components.browser_ui.settings.TextMessagePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780Ga implements ServiceWorkerPaymentAppBridge.GetServiceWorkerPaymentAppsInfoCallback {
    public final /* synthetic */ AndroidPaymentAppsFragment a;

    @Override // org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.GetServiceWorkerPaymentAppsInfoCallback
    public final void a(Map map) {
        Drawable bitmapDrawable;
        HashMap hashMap = new HashMap();
        List<ResolveInfo> b = AbstractC3017Xf2.b(new Intent("org.chromium.intent.action.PAY"), 0);
        if (!b.isEmpty()) {
            for (ResolveInfo resolveInfo : b) {
                CharSequence loadLabel = resolveInfo.loadLabel(V60.a.getPackageManager());
                if (!TextUtils.isEmpty(loadLabel)) {
                    hashMap.put(resolveInfo.activityInfo.packageName, new Pair(loadLabel.toString(), resolveInfo.loadIcon(V60.a.getPackageManager())));
                }
            }
        }
        int i = AndroidPaymentAppsFragment.j0;
        AndroidPaymentAppsFragment androidPaymentAppsFragment = this.a;
        androidPaymentAppsFragment.getClass();
        if (hashMap.isEmpty() && map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0650Fa c0650Fa = new C0650Fa(androidPaymentAppsFragment.c0.a);
            c0650Fa.R((CharSequence) ((Pair) entry.getValue()).first);
            c0650Fa.J((Drawable) ((Pair) entry.getValue()).second);
            androidPaymentAppsFragment.N0().W(c0650Fa);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            C0650Fa c0650Fa2 = new C0650Fa(androidPaymentAppsFragment.c0.a);
            c0650Fa2.R((CharSequence) ((Pair) entry2.getValue()).first);
            c0650Fa2.P((CharSequence) entry2.getKey());
            if (((Pair) entry2.getValue()).second == null) {
                bitmapDrawable = new ColorDrawable(0);
            } else {
                bitmapDrawable = new BitmapDrawable(androidPaymentAppsFragment.N(), (Bitmap) ((Pair) entry2.getValue()).second);
            }
            c0650Fa2.J(bitmapDrawable);
            androidPaymentAppsFragment.N0().W(c0650Fa2);
        }
        TextMessagePreference textMessagePreference = new TextMessagePreference(androidPaymentAppsFragment.c0.a, null);
        textMessagePreference.Q(R.string.f81000_resource_name_obfuscated_res_0x7f1407f0);
        textMessagePreference.W(false);
        androidPaymentAppsFragment.N0().W(textMessagePreference);
    }

    public C0780Ga(AndroidPaymentAppsFragment androidPaymentAppsFragment) {
        this.a = androidPaymentAppsFragment;
    }
}
