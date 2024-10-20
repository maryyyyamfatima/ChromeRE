package org.chromium.chrome.browser.dom_distiller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.FI2;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DomDistillerUIUtils {
    public static void openSettings(WebContents webContents) {
        WindowAndroid Q0;
        Activity activity = (webContents == null || (Q0 = webContents.Q0()) == null) ? null : (Activity) Q0.k().get();
        if (webContents == null || activity == null) {
            return;
        }
        FI2.a("DomDistiller_DistilledPagePrefsOpened");
        C5490g8 c5490g8 = new C5490g8(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        int i = DistilledPagePrefsView.m;
        c5490g8.j((DistilledPagePrefsView) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00d2, (ViewGroup) null));
        c5490g8.k();
    }
}
