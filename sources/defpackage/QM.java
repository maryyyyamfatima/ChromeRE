package defpackage;

import J.N;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattCharacteristicWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QM implements Runnable {
    public final /* synthetic */ Wrappers$BluetoothGattCharacteristicWrapper a;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ VM h;

    public QM(VM vm, Wrappers$BluetoothGattCharacteristicWrapper wrappers$BluetoothGattCharacteristicWrapper, byte[] bArr) {
        this.h = vm;
        this.a = wrappers$BluetoothGattCharacteristicWrapper;
        this.g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChromeBluetoothRemoteGattCharacteristic chromeBluetoothRemoteGattCharacteristic = (ChromeBluetoothRemoteGattCharacteristic) this.h.a.e.get(this.a);
        if (chromeBluetoothRemoteGattCharacteristic == null) {
            return;
        }
        AbstractC4851eH1.d("Bluetooth", "onCharacteristicChanged", new Object[0]);
        long j = chromeBluetoothRemoteGattCharacteristic.a;
        if (j != 0) {
            N.MZCKcdTH(j, chromeBluetoothRemoteGattCharacteristic, this.g);
        }
    }
}
