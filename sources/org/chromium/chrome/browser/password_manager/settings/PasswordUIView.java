package org.chromium.chrome.browser.password_manager.settings;

import J.N;
import defpackage.C8800pm2;
import defpackage.InterfaceC8113nm2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PasswordUIView {
    public long a = N.Mx3ZU1Lr(this);
    public final InterfaceC8113nm2 b;

    public static SavedPasswordEntry createSavedPasswordEntry(String str, String str2, String str3) {
        return new SavedPasswordEntry(str, str2, str3);
    }

    public PasswordUIView(C8800pm2 c8800pm2) {
        this.b = c8800pm2;
    }

    public final void passwordListAvailable(int i) {
        this.b.v(i);
    }

    public final void passwordExceptionListAvailable(int i) {
        this.b.y(i);
    }
}
