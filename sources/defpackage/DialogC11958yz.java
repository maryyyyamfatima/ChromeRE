package defpackage;

import android.app.Dialog;
import android.content.Context;
import org.chromium.components.permissions.BluetoothScanningPermissionDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC11958yz extends Dialog {
    public final /* synthetic */ BluetoothScanningPermissionDialog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC11958yz(BluetoothScanningPermissionDialog bluetoothScanningPermissionDialog, Context context) {
        super(context);
        this.a = bluetoothScanningPermissionDialog;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BluetoothScanningPermissionDialog bluetoothScanningPermissionDialog = this.a;
        if (!bluetoothScanningPermissionDialog.f && !z) {
            dismiss();
        }
        bluetoothScanningPermissionDialog.f = false;
    }
}
