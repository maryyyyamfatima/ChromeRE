package org.chromium.device.usb;

import android.hardware.usb.UsbEndpoint;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeUsbEndpoint {
    public final UsbEndpoint a;

    public ChromeUsbEndpoint(UsbEndpoint usbEndpoint) {
        this.a = usbEndpoint;
    }

    public static ChromeUsbEndpoint create(UsbEndpoint usbEndpoint) {
        return new ChromeUsbEndpoint(usbEndpoint);
    }

    public final int getAddress() {
        return this.a.getAddress();
    }

    public final int getMaxPacketSize() {
        return this.a.getMaxPacketSize();
    }

    public final int getAttributes() {
        return this.a.getAttributes();
    }

    public final int getInterval() {
        return this.a.getInterval();
    }
}
