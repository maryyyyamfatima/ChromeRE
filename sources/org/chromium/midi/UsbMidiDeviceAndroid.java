package org.chromium.midi;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import android.os.Handler;
import android.util.SparseArray;
import defpackage.C11650y44;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class UsbMidiDeviceAndroid {
    public final UsbDeviceConnection a;
    public boolean f;
    public final UsbDevice h;
    public final SparseArray b = new SparseArray();
    public final HashMap c = new HashMap();
    public final Handler d = new Handler();
    public boolean e = false;
    public long g = 0;

    public UsbMidiDeviceAndroid(UsbManager usbManager, UsbDevice usbDevice) {
        this.a = usbManager.openDevice(usbDevice);
        this.h = usbDevice;
        this.f = false;
        for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
            UsbInterface usbInterface = usbDevice.getInterface(i);
            if (usbInterface.getInterfaceClass() == 1 && usbInterface.getInterfaceSubclass() == 3) {
                this.a.claimInterface(usbInterface, true);
                for (int i2 = 0; i2 < usbInterface.getEndpointCount(); i2++) {
                    UsbEndpoint endpoint = usbInterface.getEndpoint(i2);
                    if (endpoint.getDirection() == 0) {
                        this.b.put(endpoint.getEndpointNumber(), endpoint);
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < usbDevice.getInterfaceCount(); i3++) {
            UsbInterface usbInterface2 = usbDevice.getInterface(i3);
            if (usbInterface2.getInterfaceClass() == 1 && usbInterface2.getInterfaceSubclass() == 3) {
                for (int i4 = 0; i4 < usbInterface2.getEndpointCount(); i4++) {
                    UsbEndpoint endpoint2 = usbInterface2.getEndpoint(i4);
                    if (endpoint2.getDirection() == 128) {
                        ByteBuffer allocate = ByteBuffer.allocate(endpoint2.getMaxPacketSize());
                        UsbRequest usbRequest = new UsbRequest();
                        usbRequest.initialize(this.a, endpoint2);
                        usbRequest.queue(allocate, allocate.remaining());
                        hashMap.put(endpoint2, allocate);
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        this.f = true;
        new C11650y44(this, hashMap).start();
    }

    public void registerSelf(long j) {
        this.g = j;
    }

    public void send(int i, byte[] bArr) {
        UsbEndpoint usbEndpoint;
        if (this.e || (usbEndpoint = (UsbEndpoint) this.b.get(i)) == null) {
            return;
        }
        boolean z = this.f;
        UsbDeviceConnection usbDeviceConnection = this.a;
        if (z) {
            usbDeviceConnection.bulkTransfer(usbEndpoint, bArr, bArr.length, 100);
            return;
        }
        HashMap hashMap = this.c;
        UsbRequest usbRequest = (UsbRequest) hashMap.get(usbEndpoint);
        if (usbRequest == null) {
            usbRequest = new UsbRequest();
            usbRequest.initialize(usbDeviceConnection, usbEndpoint);
            hashMap.put(usbEndpoint, usbRequest);
        }
        usbRequest.queue(ByteBuffer.wrap(bArr), bArr.length);
    }

    public byte[] getDescriptors() {
        UsbDeviceConnection usbDeviceConnection = this.a;
        return usbDeviceConnection == null ? new byte[0] : usbDeviceConnection.getRawDescriptors();
    }

    public byte[] getStringDescriptor(int i) {
        UsbDeviceConnection usbDeviceConnection = this.a;
        if (usbDeviceConnection == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[255];
        int controlTransfer = usbDeviceConnection.controlTransfer(128, 6, i | 768, 0, bArr, 255, 0);
        return controlTransfer < 0 ? new byte[0] : Arrays.copyOf(bArr, controlTransfer);
    }

    public void close() {
        this.b.clear();
        HashMap hashMap = this.c;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((UsbRequest) it.next()).close();
        }
        hashMap.clear();
        this.a.close();
        this.g = 0L;
        this.e = true;
    }
}
