package org.chromium.chrome.browser.password_manager;

import defpackage.C12157za2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordManagerLifecycleHelper {
    public static PasswordManagerLifecycleHelper b;
    public final C12157za2 a = new C12157za2();

    public static PasswordManagerLifecycleHelper getInstance() {
        if (b == null) {
            b = new PasswordManagerLifecycleHelper();
        }
        return b;
    }

    public void registerObserver(long j) {
        this.a.a(Long.valueOf(j));
    }

    public void unregisterObserver(long j) {
        this.a.d(Long.valueOf(j));
    }
}
