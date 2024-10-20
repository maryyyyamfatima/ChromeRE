package org.chromium.chrome.modules.dev_ui;

import J.N;
import defpackage.InterfaceC2401Sm1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DevUiInstallListener implements InterfaceC2401Sm1 {
    public long a;

    @Override // defpackage.InterfaceC2401Sm1
    public final void a(boolean z) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MaWzS2R6(j, z);
    }

    public DevUiInstallListener(long j) {
        this.a = j;
    }

    public final void onNativeDestroy() {
        this.a = 0L;
    }
}
