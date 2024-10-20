package org.chromium.chrome.browser.search_resumption;

import J.N;
import android.text.TextUtils;
import defpackage.AbstractC9224r03;
import defpackage.C8196o03;
import defpackage.C8539p03;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchResumptionModuleBridge {
    public long a;
    public C8196o03 b;

    public SearchResumptionModuleBridge(Profile profile) {
        this.a = N.MSl$dHUT(this, profile);
    }

    public void onSuggestionsReceived(String[] strArr, GURL[] gurlArr) {
        boolean z;
        C8539p03 c8539p03 = this.b.a;
        if (c8539p03.m != null) {
            return;
        }
        if (gurlArr.length == strArr.length && gurlArr.length >= 2) {
            int i = 0;
            for (int i2 = 0; i2 < gurlArr.length; i2++) {
                z = true;
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i++;
                }
                if (i >= 2) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            AbstractC9224r03.a(0);
        } else {
            c8539p03.e(strArr, gurlArr, false);
        }
    }
}
