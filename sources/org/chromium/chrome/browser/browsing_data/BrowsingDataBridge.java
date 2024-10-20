package org.chromium.chrome.browser.browsing_data;

import J.N;
import defpackage.InterfaceC4486dD;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BrowsingDataBridge {
    public static BrowsingDataBridge b;
    public InterfaceC4486dD a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface ImportantSitesCallback {
        void onImportantRegisterableDomainsReady(String[] strArr, String[] strArr2, int[] iArr, boolean z);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface OtherFormsOfBrowsingHistoryListener {
        void enableDialogAboutOtherFormsOfBrowsingHistory();
    }

    public static BrowsingDataBridge b() {
        Object obj = ThreadUtils.a;
        if (b == null) {
            b = new BrowsingDataBridge();
        }
        return b;
    }

    public void browsingDataCleared() {
        InterfaceC4486dD interfaceC4486dD = this.a;
        if (interfaceC4486dD != null) {
            interfaceC4486dD.q();
            this.a = null;
        }
    }

    public final void a(InterfaceC4486dD interfaceC4486dD, int[] iArr, int i) {
        this.a = interfaceC4486dD;
        N.McYsV35Z(this, Profile.d(), iArr, i, new String[0], new int[0], new String[0], new int[0]);
    }
}
