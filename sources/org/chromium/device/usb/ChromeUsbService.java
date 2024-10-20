package org.chromium.device.usb;

import J.N;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import defpackage.AbstractC2281Ro1;
import defpackage.NR;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeUsbService {
    public final long a;
    public final UsbManager b = (UsbManager) V60.a.getSystemService("usb");
    public NR c = new NR(this);

    public final boolean hasDevicePermission(ChromeUsbDevice chromeUsbDevice) {
        return this.b.hasPermission(chromeUsbDevice.a);
    }

    public final UsbDeviceConnection openDevice(ChromeUsbDevice chromeUsbDevice) {
        return this.b.openDevice(chromeUsbDevice.a);
    }

    public final void requestDevicePermission(ChromeUsbDevice chromeUsbDevice) {
        UsbDevice usbDevice = chromeUsbDevice.a;
        UsbManager usbManager = this.b;
        if (usbManager.hasPermission(usbDevice)) {
            N.MDvFAfgT(this.a, this, usbDevice.getDeviceId(), true);
        } else {
            usbManager.requestPermission(chromeUsbDevice.a, PendingIntent.getBroadcast(V60.a, 0, new Intent("org.chromium.device.ACTION_USB_PERMISSION"), AbstractC2281Ro1.d(true)));
        }
    }

    public ChromeUsbService(long j) {
        this.a = j;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction("org.chromium.device.ACTION_USB_PERMISSION");
        V60.a.registerReceiver(this.c, intentFilter);
    }

    public static ChromeUsbService create(long j) {
        return new ChromeUsbService(j);
    }

    public final Object[] getDevices() {
        return this.b.getDeviceList().values().toArray();
    }

    public final void close() {
        V60.a.unregisterReceiver(this.c);
        this.c = null;
    }
}
