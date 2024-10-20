package org.chromium.chrome.modules.dev_ui;

import defpackage.AbstractC0966Hl0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DevUiModuleProvider {
    public static boolean isModuleInstalled() {
        return AbstractC0966Hl0.a.g();
    }

    public static void installModule(DevUiInstallListener devUiInstallListener) {
        AbstractC0966Hl0.a.d(devUiInstallListener);
    }

    public static void ensureNativeLoaded() {
        AbstractC0966Hl0.a.a();
    }
}
