package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import org.chromium.base.ThreadUtils;
import org.chromium.device.bluetooth.Wrappers$BluetoothDeviceWrapper;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattCharacteristicWrapper;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattDescriptorWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Wq4 extends BluetoothGattCallback {
    public final VM a;
    public final Wrappers$BluetoothDeviceWrapper b;

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = (Wrappers$BluetoothGattCharacteristicWrapper) this.b.b.get(bluetoothGattCharacteristic);
        VM vm = this.a;
        vm.getClass();
        Zq4 a = Zq4.a();
        RM rm = new RM(vm, wrappers$BluetoothGattCharacteristicWrapper, i);
        a.getClass();
        ThreadUtils.e(rm);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = (Wrappers$BluetoothGattCharacteristicWrapper) this.b.b.get(bluetoothGattCharacteristic);
        VM vm = this.a;
        vm.getClass();
        Zq4 a = Zq4.a();
        SM sm = new SM(vm, wrappers$BluetoothGattCharacteristicWrapper, i);
        a.getClass();
        ThreadUtils.e(sm);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper = (Wrappers$BluetoothGattDescriptorWrapper) this.b.c.get(bluetoothGattDescriptor);
        VM vm = this.a;
        vm.getClass();
        Zq4 a = Zq4.a();
        TM tm = new TM(vm, wrappers$BluetoothGattDescriptorWrapper, i);
        a.getClass();
        ThreadUtils.e(tm);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper = (Wrappers$BluetoothGattDescriptorWrapper) this.b.c.get(bluetoothGattDescriptor);
        VM vm = this.a;
        vm.getClass();
        Zq4 a = Zq4.a();
        UM um = new UM(vm, wrappers$BluetoothGattDescriptorWrapper, i);
        a.getClass();
        ThreadUtils.e(um);
    }

    public Wq4(VM vm, Wrappers$BluetoothDeviceWrapper wrappers$BluetoothDeviceWrapper) {
        this.a = vm;
        this.b = wrappers$BluetoothDeviceWrapper;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        AbstractC4851eH1.d("Bluetooth", "wrapper onCharacteristicChanged.", new Object[0]);
        Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper = (Wrappers$BluetoothGattCharacteristicWrapper) this.b.b.get(bluetoothGattCharacteristic);
        VM vm = this.a;
        vm.getClass();
        AbstractC4851eH1.d("Bluetooth", "device onCharacteristicChanged.", new Object[0]);
        byte[] value = wrappers$BluetoothGattCharacteristicWrapper.a.getValue();
        Zq4 a = Zq4.a();
        QM qm = new QM(vm, wrappers$BluetoothGattCharacteristicWrapper, value);
        a.getClass();
        ThreadUtils.e(qm);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        VM vm = this.a;
        vm.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = i2 == 2 ? "Connected" : "Disconnected";
        AbstractC4851eH1.d("Bluetooth", "onConnectionStateChange status:%d newState:%s", objArr);
        Zq4 a = Zq4.a();
        NM nm = new NM(vm, i2, i);
        a.getClass();
        ThreadUtils.e(nm);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        VM vm = this.a;
        vm.getClass();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = i2 == 0 ? "OK" : "Error";
        AbstractC4851eH1.d("Bluetooth", "onMtuChanged mtu:%d status:%d==%s", objArr);
        Zq4 a = Zq4.a();
        OM om = new OM(vm);
        a.getClass();
        ThreadUtils.e(om);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        VM vm = this.a;
        vm.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = i == 0 ? "OK" : "Error";
        AbstractC4851eH1.d("Bluetooth", "onServicesDiscovered status:%d==%s", objArr);
        Zq4 a = Zq4.a();
        PM pm = new PM(vm);
        a.getClass();
        ThreadUtils.e(pm);
    }
}
