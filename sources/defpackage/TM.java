package defpackage;

import J.N;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattDescriptorWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TM implements Runnable {
    public final /* synthetic */ Wrappers$BluetoothGattDescriptorWrapper a;
    public final /* synthetic */ int g;
    public final /* synthetic */ VM h;

    public TM(VM vm, Wrappers$BluetoothGattDescriptorWrapper wrappers$BluetoothGattDescriptorWrapper, int i) {
        this.h = vm;
        this.a = wrappers$BluetoothGattDescriptorWrapper;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChromeBluetoothRemoteGattDescriptor chromeBluetoothRemoteGattDescriptor = (ChromeBluetoothRemoteGattDescriptor) this.h.a.f.get(this.a);
        if (chromeBluetoothRemoteGattDescriptor == null) {
            return;
        }
        Object[] objArr = new Object[2];
        int i = this.g;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = i == 0 ? "OK" : "Error";
        AbstractC4851eH1.d("Bluetooth", "onDescriptorRead status:%d==%s", objArr);
        long j = chromeBluetoothRemoteGattDescriptor.a;
        if (j != 0) {
            N.MaKNZo8k(j, chromeBluetoothRemoteGattDescriptor, i, chromeBluetoothRemoteGattDescriptor.b.a.getValue());
        }
    }
}
