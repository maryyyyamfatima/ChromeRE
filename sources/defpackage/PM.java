package defpackage;

import J.N;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.device.bluetooth.ChromeBluetoothDevice;
import org.chromium.device.bluetooth.Wrappers$BluetoothGattServiceWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PM implements Runnable {
    public final /* synthetic */ VM a;

    public PM(VM vm) {
        this.a = vm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uq4 uq4;
        VM vm = this.a;
        ChromeBluetoothDevice chromeBluetoothDevice = vm.a;
        if (chromeBluetoothDevice.a == 0 || (uq4 = chromeBluetoothDevice.c) == null) {
            return;
        }
        List<BluetoothGattService> services = uq4.a.getServices();
        ArrayList arrayList = new ArrayList(services.size());
        Iterator<BluetoothGattService> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(new Wrappers$BluetoothGattServiceWrapper(it.next(), uq4.b));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            ChromeBluetoothDevice chromeBluetoothDevice2 = vm.a;
            if (!hasNext) {
                N.M9HSgyay(chromeBluetoothDevice2.a, chromeBluetoothDevice2);
                return;
            }
            Wrappers$BluetoothGattServiceWrapper wrappers$BluetoothGattServiceWrapper = (Wrappers$BluetoothGattServiceWrapper) it2.next();
            N.MAoRk69U(chromeBluetoothDevice2.a, chromeBluetoothDevice2, chromeBluetoothDevice2.getAddress() + "/" + wrappers$BluetoothGattServiceWrapper.a.getUuid().toString() + "," + wrappers$BluetoothGattServiceWrapper.a.getInstanceId(), wrappers$BluetoothGattServiceWrapper);
        }
    }
}
