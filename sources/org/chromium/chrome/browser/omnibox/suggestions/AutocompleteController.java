package org.chromium.chrome.browser.omnibox.suggestions;

import J.N;
import android.text.TextUtils;
import defpackage.InterfaceC2799Vo;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.omnibox.AutocompleteResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutocompleteController {
    public long b;
    public final HashSet a = new HashSet();
    public AutocompleteResult c = AutocompleteResult.e;

    public AutocompleteController(Profile profile, long j) {
        this.b = j;
    }

    public final void a(int i, int i2, String str, String str2, boolean z) {
        if (this.b == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        N.Mc4QrncX(this.b, str2, i2, null, str, i, z, false, false, true);
    }

    public final void onSuggestionsReceived(AutocompleteResult autocompleteResult, String str, boolean z) {
        this.c = autocompleteResult;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2799Vo) it.next()).a(autocompleteResult, str, z);
        }
    }

    public final void notifyNativeDestroyed() {
        this.b = 0L;
    }
}
