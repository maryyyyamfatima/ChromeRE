package org.chromium.chrome.browser.instantapps;

import J.N;
import android.content.Context;
import defpackage.C5265fV1;
import defpackage.InterfaceC4578dV1;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstantAppsMessageDelegate {
    public final WebContents a;
    public final InstantAppsBannerData b;
    public final InterfaceC4578dV1 c;
    public PropertyModel d;

    public InstantAppsMessageDelegate(Context context, WebContents webContents, InterfaceC4578dV1 interfaceC4578dV1, InstantAppsBannerData instantAppsBannerData) {
        this.b = instantAppsBannerData;
        this.a = webContents;
        this.c = interfaceC4578dV1;
        N.MijLmheg(this, webContents, instantAppsBannerData.c);
    }

    public final void dismissMessage() {
        InterfaceC4578dV1 interfaceC4578dV1 = this.c;
        if (interfaceC4578dV1 != null) {
            ((C5265fV1) interfaceC4578dV1).a(9, this.d);
        }
    }
}
