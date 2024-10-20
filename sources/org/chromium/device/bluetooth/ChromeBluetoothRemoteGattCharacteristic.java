package org.chromium.device.bluetooth;

import J.N;
import android.bluetooth.BluetoothGattDescriptor;
import defpackage.AbstractC4851eH1;
import defpackage.Uq4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothRemoteGattCharacteristic {
    public long a;
    public final Wrappers$BluetoothGattCharacteristicWrapper b;
    public final String c;
    public final ChromeBluetoothDevice d;

    public ChromeBluetoothRemoteGattCharacteristic(long j, Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper, String str, ChromeBluetoothDevice chromeBluetoothDevice) {
        this.a = j;
        this.b = wrappers$BluetoothGattCharacteristicWrapper;
        this.c = str;
        this.d = chromeBluetoothDevice;
        chromeBluetoothDevice.e.put(wrappers$BluetoothGattCharacteristicWrapper, this);
    }

    public final void onBluetoothRemoteGattCharacteristicAndroidDestruction() {
        ChromeBluetoothDevice chromeBluetoothDevice = this.d;
        Uq4 uq4 = chromeBluetoothDevice.c;
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = this.b;
        if (uq4 != null) {
            uq4.a.setCharacteristicNotification(wrappers$BluetoothGattCharacteristicWrapper.a, false);
        }
        this.a = 0L;
        chromeBluetoothDevice.e.remove(wrappers$BluetoothGattCharacteristicWrapper);
    }

    public static ChromeBluetoothRemoteGattCharacteristic create(long j, Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper, String str, ChromeBluetoothDevice chromeBluetoothDevice) {
        return new ChromeBluetoothRemoteGattCharacteristic(j, wrappers$BluetoothGattCharacteristicWrapper, str, chromeBluetoothDevice);
    }

    public final boolean readRemoteCharacteristic() {
        if (this.d.c.a.readCharacteristic(this.b.a)) {
            return true;
        }
        AbstractC4851eH1.d("Bluetooth", "readRemoteCharacteristic readCharacteristic failed.", new Object[0]);
        return false;
    }

    public final boolean setCharacteristicNotification(boolean z) {
        return this.d.c.a.setCharacteristicNotification(this.b.a, z);
    }

    public final void createDescriptors() {
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = this.b;
        List<BluetoothGattDescriptor> descriptors = wrappers$BluetoothGattCharacteristicWrapper.a.getDescriptors();
        ArrayList arrayList = new ArrayList(descriptors.size());
        for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
            Wrappers$BluetoothDeviceWrapper wrappers$BluetoothDeviceWrapper = wrappers$BluetoothGattCharacteristicWrapper.b;
            Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper = (Wrappers$BluetoothGattDescriptorWrapper) wrappers$BluetoothDeviceWrapper.c.get(bluetoothGattDescriptor);
            if (wrappers$BluetoothGattDescriptorWrapper == null) {
                wrappers$BluetoothGattDescriptorWrapper = new Wrappers$BluetoothGattDescriptorWrapper(bluetoothGattDescriptor);
                wrappers$BluetoothDeviceWrapper.c.put(bluetoothGattDescriptor, wrappers$BluetoothGattDescriptorWrapper);
            }
            arrayList.add(wrappers$BluetoothGattDescriptorWrapper);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper2 = (Wrappers$BluetoothGattDescriptorWrapper) it.next();
            N.MkqvrLoV(this.a, this, this.c + "/" + wrappers$BluetoothGattDescriptorWrapper2.a.getUuid().toString() + ";" + i, wrappers$BluetoothGattDescriptorWrapper2, this.d);
            i++;
        }
    }

    public final int getProperties() {
        return this.b.a.getProperties();
    }

    public final String getUUID() {
        return this.b.a.getUuid().toString();
    }

    public final boolean writeRemoteCharacteristic(byte[] bArr, int i) {
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = this.b;
        if (!wrappers$BluetoothGattCharacteristicWrapper.a.setValue(bArr)) {
            AbstractC4851eH1.d("Bluetooth", "writeRemoteCharacteristic setValue failed.", new Object[0]);
            return false;
        }
        if (i != 0) {
            wrappers$BluetoothGattCharacteristicWrapper.a.setWriteType(i);
        }
        if (this.d.c.a.writeCharacteristic(wrappers$BluetoothGattCharacteristicWrapper.a)) {
            return true;
        }
        AbstractC4851eH1.d("Bluetooth", "writeRemoteCharacteristic writeCharacteristic failed.", new Object[0]);
        return false;
    }
}
