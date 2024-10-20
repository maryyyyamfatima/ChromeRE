package defpackage;

import org.chromium.device.bluetooth.ChromeBluetoothDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OM implements Runnable {
    public final /* synthetic */ VM a;

    public OM(VM vm) {
        this.a = vm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uq4 uq4;
        ChromeBluetoothDevice chromeBluetoothDevice = this.a.a;
        if (chromeBluetoothDevice.a == 0 || (uq4 = chromeBluetoothDevice.c) == null) {
            return;
        }
        uq4.a.discoverServices();
    }
}
