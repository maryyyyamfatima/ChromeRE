package org.chromium.device.bluetooth;

import defpackage.AbstractC4851eH1;
import defpackage.Uq4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothRemoteGattDescriptor {
    public long a;
    public final Wrappers$BluetoothGattDescriptorWrapper b;
    public final ChromeBluetoothDevice c;

    public ChromeBluetoothRemoteGattDescriptor(long j, Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper, ChromeBluetoothDevice chromeBluetoothDevice) {
        this.a = j;
        this.b = wrappers$BluetoothGattDescriptorWrapper;
        this.c = chromeBluetoothDevice;
        chromeBluetoothDevice.f.put(wrappers$BluetoothGattDescriptorWrapper, this);
    }

    public final void onBluetoothRemoteGattDescriptorAndroidDestruction() {
        this.a = 0L;
        this.c.f.remove(this.b);
    }

    public static ChromeBluetoothRemoteGattDescriptor create(long j, Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper, ChromeBluetoothDevice chromeBluetoothDevice) {
        return new ChromeBluetoothRemoteGattDescriptor(j, wrappers$BluetoothGattDescriptorWrapper, chromeBluetoothDevice);
    }

    public final boolean readRemoteDescriptor() {
        Uq4 uq4 = this.c.c;
        uq4.getClass();
        if (uq4.a.readDescriptor(this.b.a)) {
            return true;
        }
        AbstractC4851eH1.d("Bluetooth", "readRemoteDescriptor readDescriptor failed.", new Object[0]);
        return false;
    }

    public final String getUUID() {
        return this.b.a.getUuid().toString();
    }

    public final boolean writeRemoteDescriptor(byte[] bArr) {
        Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper = this.b;
        if (!wrappers$BluetoothGattDescriptorWrapper.a.setValue(bArr)) {
            AbstractC4851eH1.d("Bluetooth", "writeRemoteDescriptor setValue failed.", new Object[0]);
            return false;
        }
        Uq4 uq4 = this.c.c;
        uq4.getClass();
        if (uq4.a.writeDescriptor(wrappers$BluetoothGattDescriptorWrapper.a)) {
            return true;
        }
        AbstractC4851eH1.d("Bluetooth", "writeRemoteDescriptor writeDescriptor failed.", new Object[0]);
        return false;
    }
}
