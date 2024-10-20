package org.chromium.device.usb;

import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeUsbInterface {
    public final UsbInterface a;

    public ChromeUsbInterface(UsbInterface usbInterface) {
        this.a = usbInterface;
    }

    public static ChromeUsbInterface create(UsbInterface usbInterface) {
        return new ChromeUsbInterface(usbInterface);
    }

    public final int getInterfaceNumber() {
        return this.a.getId();
    }

    public final int getAlternateSetting() {
        return this.a.getAlternateSetting();
    }

    public final int getInterfaceClass() {
        return this.a.getInterfaceClass();
    }

    public final int getInterfaceSubclass() {
        return this.a.getInterfaceSubclass();
    }

    public final int getInterfaceProtocol() {
        return this.a.getInterfaceProtocol();
    }

    public final UsbEndpoint[] getEndpoints() {
        UsbInterface usbInterface = this.a;
        int endpointCount = usbInterface.getEndpointCount();
        UsbEndpoint[] usbEndpointArr = new UsbEndpoint[endpointCount];
        for (int i = 0; i < endpointCount; i++) {
            usbEndpointArr[i] = usbInterface.getEndpoint(i);
        }
        return usbEndpointArr;
    }
}
