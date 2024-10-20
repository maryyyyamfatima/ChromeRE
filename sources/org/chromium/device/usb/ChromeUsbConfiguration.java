package org.chromium.device.usb;

import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeUsbConfiguration {
    public final UsbConfiguration a;

    public ChromeUsbConfiguration(UsbConfiguration usbConfiguration) {
        this.a = usbConfiguration;
    }

    public static ChromeUsbConfiguration create(UsbConfiguration usbConfiguration) {
        return new ChromeUsbConfiguration(usbConfiguration);
    }

    public final int getConfigurationValue() {
        return this.a.getId();
    }

    public final boolean isSelfPowered() {
        return this.a.isSelfPowered();
    }

    public final boolean isRemoteWakeup() {
        return this.a.isRemoteWakeup();
    }

    public final int getMaxPower() {
        return this.a.getMaxPower();
    }

    public final UsbInterface[] getInterfaces() {
        UsbConfiguration usbConfiguration = this.a;
        int interfaceCount = usbConfiguration.getInterfaceCount();
        UsbInterface[] usbInterfaceArr = new UsbInterface[interfaceCount];
        for (int i = 0; i < interfaceCount; i++) {
            usbInterfaceArr[i] = usbConfiguration.getInterface(i);
        }
        return usbInterfaceArr;
    }
}
