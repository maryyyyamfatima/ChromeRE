package defpackage;

import J.N;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattCharacteristicWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RM implements Runnable {
    public final /* synthetic */ Wrappers$BluetoothGattCharacteristicWrapper a;
    public final /* synthetic */ int g;
    public final /* synthetic */ VM h;

    public RM(VM vm, Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper, int i) {
        this.h = vm;
        this.a = wrappers$BluetoothGattCharacteristicWrapper;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChromeBluetoothRemoteGattCharacteristic chromeBluetoothRemoteGattCharacteristic = (ChromeBluetoothRemoteGattCharacteristic) this.h.a.e.get(this.a);
        if (chromeBluetoothRemoteGattCharacteristic == null) {
            return;
        }
        Object[] objArr = new Object[2];
        int i = this.g;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = i == 0 ? "OK" : "Error";
        AbstractC4851eH1.d("Bluetooth", "onCharacteristicRead status:%d==%s", objArr);
        long j = chromeBluetoothRemoteGattCharacteristic.a;
        if (j != 0) {
            N.Mn9Gzi$d(j, chromeBluetoothRemoteGattCharacteristic, i, chromeBluetoothRemoteGattCharacteristic.b.a.getValue());
        }
    }
}
