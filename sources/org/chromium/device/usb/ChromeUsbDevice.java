package org.chromium.device.usb;

import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeUsbDevice {
    public final UsbDevice a;

    public ChromeUsbDevice(UsbDevice usbDevice) {
        this.a = usbDevice;
    }

    public static ChromeUsbDevice create(UsbDevice usbDevice) {
        return new ChromeUsbDevice(usbDevice);
    }

    public final int getDeviceId() {
        return this.a.getDeviceId();
    }

    public final int getDeviceClass() {
        return this.a.getDeviceClass();
    }

    public final int getDeviceSubclass() {
        return this.a.getDeviceSubclass();
    }

    public final int getDeviceProtocol() {
        return this.a.getDeviceProtocol();
    }

    public final int getVendorId() {
        return this.a.getVendorId();
    }

    public final int getProductId() {
        return this.a.getProductId();
    }

    public final int getDeviceVersion() {
        String[] split = this.a.getVersion().split("\\.");
        return Integer.parseInt(split[1]) | (Integer.parseInt(split[0]) << 8);
    }

    public final String getManufacturerName() {
        return this.a.getManufacturerName();
    }

    public final String getProductName() {
        return this.a.getProductName();
    }

    public final String getSerialNumber() {
        return this.a.getSerialNumber();
    }

    public final UsbConfiguration[] getConfigurations() {
        UsbDevice usbDevice = this.a;
        int configurationCount = usbDevice.getConfigurationCount();
        UsbConfiguration[] usbConfigurationArr = new UsbConfiguration[configurationCount];
        for (int i = 0; i < configurationCount; i++) {
            usbConfigurationArr[i] = usbDevice.getConfiguration(i);
        }
        return usbConfigurationArr;
    }
}
