package org.chromium.device.usb;

import android.hardware.usb.UsbDeviceConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeUsbConnection {
    public final UsbDeviceConnection a;

    public ChromeUsbConnection(UsbDeviceConnection usbDeviceConnection) {
        this.a = usbDeviceConnection;
    }

    public static ChromeUsbConnection create(UsbDeviceConnection usbDeviceConnection) {
        return new ChromeUsbConnection(usbDeviceConnection);
    }

    public final int getFileDescriptor() {
        return this.a.getFileDescriptor();
    }

    public final void close() {
        this.a.close();
    }
}
