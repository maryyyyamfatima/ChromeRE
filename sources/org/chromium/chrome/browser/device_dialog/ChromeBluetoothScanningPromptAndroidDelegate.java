package org.chromium.chrome.browser.device_dialog;

import defpackage.C11055wM;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.permissions.BluetoothScanningPromptAndroidDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeBluetoothScanningPromptAndroidDelegate implements BluetoothScanningPromptAndroidDelegate {
    @Override // org.chromium.components.permissions.BluetoothScanningPromptAndroidDelegate
    public final C11055wM a() {
        return new C11055wM(Profile.d());
    }

    public static ChromeBluetoothScanningPromptAndroidDelegate create() {
        return new ChromeBluetoothScanningPromptAndroidDelegate();
    }
}
