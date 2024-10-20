package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import org.chromium.media.AudioManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9140qm extends BroadcastReceiver {
    public final /* synthetic */ AudioManagerAndroid a;

    public C9140qm(AudioManagerAndroid audioManagerAndroid) {
        this.a = audioManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
        AudioManagerAndroid audioManagerAndroid = this.a;
        String[] strArr = AudioManagerAndroid.u;
        audioManagerAndroid.getClass();
        if (AudioManagerAndroid.e(usbDevice)) {
            boolean z = true;
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                synchronized (this.a.k) {
                    if (!this.a.a.isWiredHeadsetOn()) {
                        boolean[] zArr = this.a.l;
                        zArr[4] = true;
                        zArr[2] = false;
                    }
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction()) && !this.a.d()) {
                synchronized (this.a.k) {
                    if (!this.a.a.isWiredHeadsetOn()) {
                        this.a.l[4] = false;
                        if (AudioManagerAndroid.b()) {
                            this.a.l[2] = true;
                        }
                    }
                }
            }
            AudioManagerAndroid audioManagerAndroid2 = this.a;
            synchronized (audioManagerAndroid2.k) {
                if (audioManagerAndroid2.i == -1) {
                    z = false;
                }
            }
            if (z) {
                AudioManagerAndroid.a(this.a);
            }
        }
    }
}
