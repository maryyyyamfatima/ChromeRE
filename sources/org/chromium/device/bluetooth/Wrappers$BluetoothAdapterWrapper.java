package org.chromium.device.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import defpackage.AbstractC4851eH1;
import defpackage.V60;
import defpackage.Vq4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Wrappers$BluetoothAdapterWrapper {
    public final BluetoothAdapter a;
    public final Context b;
    public Vq4 c;

    public static Wrappers$BluetoothAdapterWrapper createWithDefaultAdapter() {
        if (Build.VERSION.SDK_INT < 31) {
            if (!(V60.a.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0 && V60.a.checkCallingOrSelfPermission("android.permission.BLUETOOTH_ADMIN") == 0)) {
                AbstractC4851eH1.f("Bluetooth", "BluetoothAdapterWrapper.create failed: Lacking Bluetooth permissions.", new Object[0]);
                return null;
            }
        }
        if (!(V60.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))) {
            AbstractC4851eH1.d("Bluetooth", "BluetoothAdapterWrapper.create failed: No Low Energy support.", new Object[0]);
            return null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return new Wrappers$BluetoothAdapterWrapper(defaultAdapter, V60.a);
        }
        AbstractC4851eH1.d("Bluetooth", "BluetoothAdapterWrapper.create failed: Default adapter not found.", new Object[0]);
        return null;
    }

    public Wrappers$BluetoothAdapterWrapper(BluetoothAdapter bluetoothAdapter, Context context) {
        this.a = bluetoothAdapter;
        this.b = context;
    }
}
