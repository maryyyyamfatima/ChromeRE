package org.chromium.components.content_settings;

import J.N;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C3152Yg2;
import defpackage.V80;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.page_info.PageInfoCookiesPreference;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CookieControlsBridge {
    public long a;
    public final V80 b;

    public CookieControlsBridge(V80 v80, WebContents webContents, Profile profile) {
        this.b = v80;
        this.a = N.Ma648rK8(this, webContents, profile);
    }

    public final void onCookieBlockingStatusChanged(int i, int i2) {
        C3152Yg2 c3152Yg2 = (C3152Yg2) this.b;
        c3152Yg2.p = i;
        boolean z = i2 != 0;
        c3152Yg2.q = z;
        PageInfoCookiesPreference pageInfoCookiesPreference = c3152Yg2.m;
        if (pageInfoCookiesPreference != null) {
            pageInfoCookiesPreference.R0(i, z);
        }
    }

    public final void onCookiesCountChanged(int i, int i2) {
        C3152Yg2 c3152Yg2 = (C3152Yg2) this.b;
        c3152Yg2.n = i;
        c3152Yg2.o = i2;
        PageInfoRowView pageInfoRowView = c3152Yg2.i;
        String quantityString = i2 > 0 ? pageInfoRowView.getContext().getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120010, i2, Integer.valueOf(i2)) : null;
        TextView textView = pageInfoRowView.h;
        textView.setText(quantityString);
        textView.setVisibility(quantityString == null ? 8 : 0);
        PageInfoCookiesPreference pageInfoCookiesPreference = c3152Yg2.m;
        if (pageInfoCookiesPreference != null) {
            pageInfoCookiesPreference.S0(i, i2);
        }
    }
}
