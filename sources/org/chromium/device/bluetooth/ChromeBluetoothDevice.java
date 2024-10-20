package org.chromium.device.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import defpackage.AbstractC4851eH1;
import defpackage.Uq4;
import defpackage.V60;
import defpackage.VM;
import defpackage.Wq4;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothDevice {
    public long a;
    public final Wrappers$BluetoothDeviceWrapper b;
    public Uq4 c;
    public final VM d = new VM(this);
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();

    public ChromeBluetoothDevice(long j, Wrappers$BluetoothDeviceWrapper wrappers$BluetoothDeviceWrapper) {
        this.a = j;
        this.b = wrappers$BluetoothDeviceWrapper;
    }

    public final void onBluetoothDeviceAndroidDestruction() {
        Uq4 uq4 = this.c;
        if (uq4 != null) {
            uq4.a.close();
            this.c = null;
        }
        this.a = 0L;
    }

    public static ChromeBluetoothDevice create(long j, Wrappers$BluetoothDeviceWrapper wrappers$BluetoothDeviceWrapper) {
        return new ChromeBluetoothDevice(j, wrappers$BluetoothDeviceWrapper);
    }

    public final void createGattConnectionImpl() {
        AbstractC4851eH1.d("Bluetooth", "connectGatt", new Object[0]);
        Uq4 uq4 = this.c;
        if (uq4 != null) {
            uq4.a.close();
        }
        Context context = V60.a;
        Wrappers$BluetoothDeviceWrapper wrappers$BluetoothDeviceWrapper = this.b;
        wrappers$BluetoothDeviceWrapper.getClass();
        this.c = new Uq4(wrappers$BluetoothDeviceWrapper.a.connectGatt(context, false, new Wq4(this.d, wrappers$BluetoothDeviceWrapper), 2), wrappers$BluetoothDeviceWrapper);
    }

    public final void disconnectGatt() {
        AbstractC4851eH1.d("Bluetooth", "BluetoothGatt.disconnect", new Object[0]);
        Uq4 uq4 = this.c;
        if (uq4 != null) {
            uq4.a.disconnect();
        }
    }

    public final String getAddress() {
        return this.b.a.getAddress();
    }

    public final int getBluetoothClass() {
        BluetoothDevice bluetoothDevice = this.b.a;
        if (bluetoothDevice == null || bluetoothDevice.getBluetoothClass() == null) {
            return 7936;
        }
        return bluetoothDevice.getBluetoothClass().getDeviceClass();
    }

    public final boolean isPaired() {
        return this.b.a.getBondState() == 12;
    }

    public final String getName() {
        return this.b.a.getName();
    }
}
