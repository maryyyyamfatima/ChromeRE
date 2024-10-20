package org.chromium.midi;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import defpackage.A44;
import defpackage.AbstractC2281Ro1;
import defpackage.V60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class UsbMidiDeviceFactoryAndroid {
    public final A44 b;
    public final HashSet d;
    public boolean e;
    public long f;
    public final ArrayList c = new ArrayList();
    public final UsbManager a = (UsbManager) V60.a.getSystemService("usb");

    public UsbMidiDeviceFactoryAndroid(long j) {
        this.f = j;
        A44 a44 = new A44(this);
        this.b = a44;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction("org.chromium.midi.USB_PERMISSION");
        V60.d(V60.a, a44, intentFilter);
        this.d = new HashSet();
    }

    public static UsbMidiDeviceFactoryAndroid create(long j) {
        return new UsbMidiDeviceFactoryAndroid(j);
    }

    public boolean enumerateDevices() {
        this.e = true;
        HashMap<String, UsbDevice> deviceList = this.a.getDeviceList();
        if (deviceList.isEmpty()) {
            this.e = false;
            return false;
        }
        Iterator<UsbDevice> it = deviceList.values().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return true ^ this.d.isEmpty();
    }

    public final void a(UsbDevice usbDevice) {
        HashSet hashSet = this.d;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((UsbDevice) it.next()).getDeviceId() == usbDevice.getDeviceId()) {
                return;
            }
        }
        for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
            UsbInterface usbInterface = usbDevice.getInterface(i);
            if (usbInterface.getInterfaceClass() == 1 && usbInterface.getInterfaceSubclass() == 3) {
                Intent intent = new Intent("org.chromium.midi.USB_PERMISSION");
                intent.putExtra("receiver_token", this.b.hashCode());
                this.a.requestPermission(usbDevice, PendingIntent.getBroadcast(V60.a, 0, intent, AbstractC2281Ro1.d(true)));
                hashSet.add(usbDevice);
                return;
            }
        }
    }

    public void close() {
        this.f = 0L;
        V60.a.unregisterReceiver(this.b);
    }
}
