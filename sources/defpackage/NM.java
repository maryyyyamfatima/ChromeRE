package defpackage;

import J.N;
import org.chromium.device.bluetooth.ChromeBluetoothDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NM implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ VM h;

    public NM(VM vm, int i, int i2) {
        this.h = vm;
        this.a = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uq4 uq4;
        VM vm = this.h;
        int i = this.a;
        if (i == 2) {
            if (!vm.a.c.a.requestMtu(517)) {
                vm.a.c.a.discoverServices();
            }
        } else if (i == 0 && (uq4 = vm.a.c) != null) {
            uq4.a.close();
            vm.a.c = null;
        }
        ChromeBluetoothDevice chromeBluetoothDevice = vm.a;
        long j = chromeBluetoothDevice.a;
        if (j != 0) {
            N.MmnW7gQC(j, chromeBluetoothDevice, this.g, i == 2);
        }
    }
}
