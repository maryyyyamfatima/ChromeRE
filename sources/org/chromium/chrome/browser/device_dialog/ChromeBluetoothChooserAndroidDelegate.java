package org.chromium.chrome.browser.device_dialog;

import defpackage.C11055wM;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.permissions.BluetoothChooserAndroidDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeBluetoothChooserAndroidDelegate implements BluetoothChooserAndroidDelegate {
    @Override // org.chromium.components.permissions.BluetoothChooserAndroidDelegate
    public final C11055wM a() {
        return new C11055wM(Profile.d());
    }

    public static ChromeBluetoothChooserAndroidDelegate create() {
        return new ChromeBluetoothChooserAndroidDelegate();
    }
}
