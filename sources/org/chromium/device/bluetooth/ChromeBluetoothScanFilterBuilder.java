package org.chromium.device.bluetooth;

import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothScanFilterBuilder {
    public final ScanFilter.Builder a = new ScanFilter.Builder();

    public static ChromeBluetoothScanFilterBuilder create() {
        return new ChromeBluetoothScanFilterBuilder();
    }

    public final void setServiceUuid(String str) {
        if (str != null) {
            this.a.setServiceUuid(ParcelUuid.fromString(str));
        }
    }

    public final void setDeviceName(String str) {
        if (str != null) {
            this.a.setDeviceName(str);
        }
    }

    public ScanFilter build() {
        return this.a.build();
    }
}
