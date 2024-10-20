package org.chromium.components.signin.base;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountInfo extends CoreAccountInfo {
    public final String d;
    public final String e;
    public final Bitmap f;
    public final AccountCapabilities g;

    public AccountInfo(CoreAccountId coreAccountId, String str, String str2, String str3, String str4, Bitmap bitmap, AccountCapabilities accountCapabilities) {
        super(coreAccountId, str, str2);
        this.d = str3;
        this.e = str4;
        this.f = bitmap;
        this.g = accountCapabilities;
    }
}
