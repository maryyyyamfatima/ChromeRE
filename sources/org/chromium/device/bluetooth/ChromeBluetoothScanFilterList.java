package org.chromium.device.bluetooth;

import android.bluetooth.le.ScanFilter;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothScanFilterList {
    public final ArrayList a = new ArrayList();

    public static ChromeBluetoothScanFilterList create() {
        return new ChromeBluetoothScanFilterList();
    }

    public final void addFilter(ScanFilter scanFilter) {
        this.a.add(scanFilter);
    }

    public ArrayList getList() {
        return this.a;
    }
}
