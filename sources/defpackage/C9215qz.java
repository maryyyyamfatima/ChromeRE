package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.components.permissions.BluetoothChooserDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qz */
/* loaded from: classes2.dex */
public final class C9215qz extends BroadcastReceiver {
    public final /* synthetic */ BluetoothChooserDialog a;

    public C9215qz(BluetoothChooserDialog bluetoothChooserDialog) {
        this.a = bluetoothChooserDialog;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
            BluetoothChooserDialog bluetoothChooserDialog = this.a;
            if (bluetoothChooserDialog.d()) {
                C12264zs1 c12264zs1 = bluetoothChooserDialog.d;
                c12264zs1.k.clear();
                c12264zs1.b(1);
                if (bluetoothChooserDialog.o) {
                    bluetoothChooserDialog.notifyAdapterTurnedOff();
                } else {
                    N.MsAog9yr(bluetoothChooserDialog.k);
                }
            }
        }
    }
}
