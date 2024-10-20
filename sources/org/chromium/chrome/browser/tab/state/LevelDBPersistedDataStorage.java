package org.chromium.chrome.browser.tab.state;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LevelDBPersistedDataStorage {
    public long a;
    public final String b = "";

    public LevelDBPersistedDataStorage(Profile profile) {
        N.MkxB9Tdj(this, profile);
    }

    public final String a(String str) {
        return String.format("%s_%s", this.b, str);
    }

    public final void setNativePtr(long j) {
        this.a = j;
    }
}
