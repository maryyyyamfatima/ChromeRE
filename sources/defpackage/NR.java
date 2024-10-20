package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import org.chromium.device.usb.ChromeUsbService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NR extends BroadcastReceiver {
    public final /* synthetic */ ChromeUsbService a;

    public NR(ChromeUsbService chromeUsbService) {
        this.a = chromeUsbService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
        boolean equals = "android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction());
        ChromeUsbService chromeUsbService = this.a;
        if (!equals) {
            if (!"android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
                if ("org.chromium.device.ACTION_USB_PERMISSION".equals(intent.getAction())) {
                    N.MDvFAfgT(chromeUsbService.a, chromeUsbService, usbDevice.getDeviceId(), intent.getBooleanExtra("permission", false));
                    return;
                }
                return;
            }
            N.MrBuy2sN(chromeUsbService.a, chromeUsbService, usbDevice.getDeviceId());
            return;
        }
        N.MNmyS$Xi(chromeUsbService.a, chromeUsbService, usbDevice);
    }
}
