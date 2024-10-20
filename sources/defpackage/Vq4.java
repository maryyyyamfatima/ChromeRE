package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Vq4 {
    public final BluetoothLeScanner a;
    public final HashMap b = new HashMap();

    public Vq4(BluetoothLeScanner bluetoothLeScanner) {
        this.a = bluetoothLeScanner;
    }

    public final void a(List list, MM mm) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
        Xq4 xq4 = new Xq4(mm);
        this.b.put(mm, xq4);
        this.a.startScan((List<ScanFilter>) list, build, xq4);
    }
}
