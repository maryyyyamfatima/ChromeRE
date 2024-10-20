package org.chromium.media;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.provider.Settings;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9771sd;
import defpackage.C7766mm;
import defpackage.C8110nm;
import defpackage.C8454om;
import defpackage.C8797pm;
import defpackage.C9140qm;
import defpackage.IK3;
import defpackage.V60;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AudioManagerAndroid {
    public static final String[] u = {"Speakerphone", "Wired headset", "Headset earpiece", "Bluetooth headset", "USB audio"};
    public static final Integer[] v = {0, 1, 2, 3, 4};
    public static final Method w;
    public final long b;
    public boolean c;
    public boolean d;
    public boolean f;
    public boolean g;
    public boolean h;
    public C8797pm n;
    public HandlerThread o;
    public C7766mm p;
    public C8110nm q;
    public C8454om r;
    public C9140qm t;
    public int e = -1;
    public int i = -1;
    public final IK3 j = new IK3();
    public final Object k = new Object();
    public final boolean[] l = new boolean[5];
    public final AudioManager a = (AudioManager) V60.a.getSystemService("audio");
    public final ContentResolver m = V60.a.getContentResolver();
    public final UsbManager s = (UsbManager) V60.a.getSystemService("usb");

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class AudioDeviceName {
        public final int a;
        public final String b;

        public AudioDeviceName(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final String id() {
            return String.valueOf(this.a);
        }

        public final String name() {
            return this.b;
        }
    }

    public static boolean b() {
        return V60.a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static boolean c(String str) {
        return V60.a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static int getAudioEncodingFormatsSupported() {
        boolean z = true;
        int i = 0;
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) V60.a.getSystemService("audio")).getDevices(2)) {
            int[] encodings = audioDeviceInfo.getEncodings();
            if (encodings.length > 0) {
                int i2 = 0;
                for (int i3 : encodings) {
                    if (i3 == 2) {
                        i2 |= 1;
                    } else if (i3 == 13) {
                        i2 |= 128;
                    } else if (i3 == 5) {
                        i2 |= 4;
                    } else if (i3 == 6) {
                        i2 |= 8;
                    } else if (i3 == 7) {
                        i2 |= 16;
                    } else if (i3 == 8) {
                        i2 |= 32;
                    }
                }
                if (z) {
                    z = false;
                    i = i2;
                } else {
                    i &= i2;
                }
            }
        }
        return i;
    }

    public static boolean isAudioSinkConnected() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) V60.a.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.isSink()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAudioLowLatencySupported() {
        return V60.a.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    static {
        Method method;
        try {
            method = AudioManager.class.getMethod("getOutputLatency", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        w = method;
    }

    public static AudioManagerAndroid createAudioManagerAndroid(long j) {
        return new AudioManagerAndroid(j);
    }

    public AudioManagerAndroid(long j) {
        this.b = j;
    }

    public final void init() {
        this.j.getClass();
        if (this.f) {
            return;
        }
        this.c = c("android.permission.MODIFY_AUDIO_SETTINGS");
        boolean b = b();
        boolean[] zArr = this.l;
        zArr[2] = b;
        zArr[1] = this.a.isWiredHeadsetOn();
        zArr[4] = d();
        boolean z = false;
        zArr[0] = true;
        boolean c = c("android.permission.BLUETOOTH");
        this.d = c;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d = c & (AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.BLUETOOTH_CONNECT") == 0);
        }
        boolean z2 = this.d;
        if (z2) {
            if (z2) {
                BluetoothAdapter adapter = ((BluetoothManager) V60.a.getSystemService("bluetooth")).getAdapter();
                if (adapter != null) {
                    int profileConnectionState = adapter.getProfileConnectionState(1);
                    if (adapter.isEnabled() && profileConnectionState == 2) {
                        z = true;
                    }
                }
            } else {
                AbstractC4851eH1.f("media", "hasBluetoothHeadset() requires BLUETOOTH permission", new Object[0]);
            }
            zArr[3] = z;
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            C8110nm c8110nm = new C8110nm(this);
            this.q = c8110nm;
            V60.a.registerReceiver(c8110nm, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            C8454om c8454om = new C8454om(this);
            this.r = c8454om;
            V60.a.registerReceiver(c8454om, intentFilter2);
        } else {
            AbstractC4851eH1.f("media", "Requires BLUETOOTH permission", new Object[0]);
        }
        IntentFilter intentFilter3 = new IntentFilter("android.intent.action.HEADSET_PLUG");
        C7766mm c7766mm = new C7766mm(this);
        this.p = c7766mm;
        V60.a.registerReceiver(c7766mm, intentFilter3);
        this.t = new C9140qm(this);
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter4.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        V60.a.registerReceiver(this.t, intentFilter4);
        this.f = true;
    }

    public final void close() {
        this.j.getClass();
        if (this.f) {
            j();
            V60.a.unregisterReceiver(this.p);
            this.p = null;
            if (this.d) {
                this.a.stopBluetoothSco();
                V60.a.unregisterReceiver(this.q);
                this.q = null;
                V60.a.unregisterReceiver(this.r);
                this.r = null;
            }
            V60.a.unregisterReceiver(this.t);
            this.t = null;
            this.f = false;
        }
    }

    public final void setCommunicationAudioModeOn(boolean z) {
        this.j.getClass();
        if (this.f) {
            if (!this.c) {
                AbstractC4851eH1.f("media", "MODIFY_AUDIO_SETTINGS is missing => client will run with reduced functionality", new Object[0]);
                return;
            }
            if (z) {
                this.g = this.a.isSpeakerphoneOn();
                this.h = this.a.isMicrophoneMute();
                if (this.o == null) {
                    HandlerThread handlerThread = new HandlerThread("SettingsObserver");
                    this.o = handlerThread;
                    handlerThread.start();
                    C8797pm c8797pm = new C8797pm(this, new Handler(this.o.getLooper()));
                    this.n = c8797pm;
                    this.m.registerContentObserver(Settings.System.CONTENT_URI, true, c8797pm);
                }
            } else {
                j();
                i();
                synchronized (this.k) {
                    this.i = -1;
                }
                boolean z2 = this.h;
                AudioManager audioManager = this.a;
                if (audioManager.isMicrophoneMute() != z2) {
                    audioManager.setMicrophoneMute(z2);
                }
                h(this.g);
            }
            AudioManager audioManager2 = this.a;
            if (z) {
                try {
                    audioManager2.setMode(3);
                    return;
                } catch (SecurityException e) {
                    String str = Build.VERSION.RELEASE;
                    String str2 = Build.BRAND;
                    String str3 = Build.DEVICE;
                    String str4 = Build.ID;
                    String str5 = Build.HARDWARE;
                    String str6 = Build.MANUFACTURER;
                    String str7 = Build.MODEL;
                    String str8 = Build.PRODUCT;
                    throw e;
                }
            }
            try {
                audioManager2.setMode(0);
            } catch (SecurityException e2) {
                String str9 = Build.VERSION.RELEASE;
                String str10 = Build.BRAND;
                String str11 = Build.DEVICE;
                String str12 = Build.ID;
                String str13 = Build.HARDWARE;
                String str14 = Build.MANUFACTURER;
                String str15 = Build.MODEL;
                String str16 = Build.PRODUCT;
                throw e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:            if (r5[3] != false) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setDevice(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4.f
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = c(r0)
            boolean r2 = r4.c
            if (r2 == 0) goto L70
            if (r0 != 0) goto L13
            goto L70
        L13:
            boolean r0 = r5.isEmpty()
            r2 = -2
            if (r0 == 0) goto L1c
            r5 = r2
            goto L20
        L1c:
            int r5 = java.lang.Integer.parseInt(r5)
        L20:
            r0 = 1
            if (r5 != r2) goto L4b
            java.lang.Object r3 = r4.k
            monitor-enter(r3)
            boolean[] r5 = r4.l     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.clone()     // Catch: java.lang.Throwable -> L48
            boolean[] r5 = (boolean[]) r5     // Catch: java.lang.Throwable -> L48
            r4.i = r2     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            boolean r2 = r5[r0]
            if (r2 == 0) goto L37
            r1 = r0
            goto L44
        L37:
            r2 = 4
            boolean r3 = r5[r2]
            if (r3 == 0) goto L3e
        L3c:
            r1 = r2
            goto L44
        L3e:
            r2 = 3
            boolean r5 = r5[r2]
            if (r5 == 0) goto L44
            goto L3c
        L44:
            r4.g(r1)
            return r0
        L48:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            throw r5
        L4b:
            java.lang.Integer[] r2 = org.chromium.media.AudioManagerAndroid.v
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L6f
            boolean[] r2 = r4.l
            boolean r2 = r2[r5]
            if (r2 != 0) goto L62
            goto L6f
        L62:
            java.lang.Object r2 = r4.k
            monitor-enter(r2)
            r4.i = r5     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            r4.g(r5)
            return r0
        L6c:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r5
        L6f:
            return r1
        L70:
            java.lang.String r5 = "media"
            java.lang.String r0 = "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO. Selected device will not be available for recording"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            defpackage.AbstractC4851eH1.f(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.AudioManagerAndroid.setDevice(java.lang.String):boolean");
    }

    public final AudioDeviceName[] getAudioInputDeviceNames() {
        boolean[] zArr;
        if (!this.f) {
            return null;
        }
        boolean c = c("android.permission.RECORD_AUDIO");
        if (!this.c || !c) {
            AbstractC4851eH1.f("media", "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO. No audio device will be available for recording", new Object[0]);
            return null;
        }
        synchronized (this.k) {
            zArr = (boolean[]) this.l.clone();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            if (zArr[i2]) {
                i++;
            }
        }
        AudioDeviceName[] audioDeviceNameArr = new AudioDeviceName[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            if (zArr[i4]) {
                String[] strArr = u;
                audioDeviceNameArr[i3] = new AudioDeviceName(i4, strArr[i4]);
                arrayList.add(strArr[i4]);
                i3++;
            }
        }
        return audioDeviceNameArr;
    }

    public final int getNativeOutputSampleRate() {
        String property = this.a.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 44100;
        }
        return Integer.parseInt(property);
    }

    public static int getMinInputFrameSize(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else {
            if (i2 != 2) {
                return -1;
            }
            i3 = 12;
        }
        return (AudioRecord.getMinBufferSize(i, i3, 2) / 2) / i2;
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = 4;
        } else {
            if (i2 != 2) {
                return -1;
            }
            i3 = 12;
        }
        return (AudioTrack.getMinBufferSize(i, i3, 2) / 2) / i2;
    }

    public final int getAudioLowLatencyOutputFrameSize() {
        String property = this.a.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    public static boolean acousticEchoCancelerIsAvailable() {
        return AcousticEchoCanceler.isAvailable();
    }

    public final int getOutputLatency() {
        this.j.getClass();
        Method method = w;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(this.a, 3)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void h(boolean z) {
        AudioManager audioManager = this.a;
        if (audioManager.isSpeakerphoneOn() == z) {
            return;
        }
        audioManager.setSpeakerphoneOn(z);
    }

    public final boolean d() {
        try {
            Iterator<UsbDevice> it = this.s.getDeviceList().values().iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final void g(int i) {
        int i2;
        if (i == 3) {
            if (this.d && (i2 = this.e) != 1 && i2 != 2) {
                AudioManager audioManager = this.a;
                if (audioManager.isBluetoothScoOn()) {
                    this.e = 1;
                } else {
                    this.e = 2;
                    audioManager.startBluetoothSco();
                }
            }
        } else {
            i();
        }
        if (i == 0) {
            h(true);
            return;
        }
        if (i == 1) {
            h(false);
            return;
        }
        if (i == 2) {
            h(false);
        } else if (i != 3) {
            if (i == 4) {
                h(false);
            } else {
                f("Invalid audio device selection");
            }
        }
    }

    public final void i() {
        if (this.d) {
            int i = this.e;
            if (i == 1 || i == 2) {
                AudioManager audioManager = this.a;
                if (!audioManager.isBluetoothScoOn()) {
                    f("Unable to stop BT SCO since it is already disabled");
                    this.e = 0;
                } else {
                    this.e = 3;
                    audioManager.stopBluetoothSco();
                }
            }
        }
    }

    public static void a(AudioManagerAndroid audioManagerAndroid) {
        int i;
        boolean[] zArr;
        synchronized (audioManagerAndroid.k) {
            i = audioManagerAndroid.i;
            zArr = (boolean[]) audioManagerAndroid.l.clone();
        }
        if (i == -1) {
            f("Unable to activate device since no device is selected");
            return;
        }
        if (i == -2 || !zArr[i]) {
            int i2 = 1;
            if (!zArr[1]) {
                i2 = 4;
                if (!zArr[4]) {
                    i2 = 3;
                    if (!zArr[3]) {
                        i2 = 0;
                    }
                }
            }
            audioManagerAndroid.g(i2);
            return;
        }
        audioManagerAndroid.g(i);
    }

    public static void f(String str) {
        AbstractC4851eH1.a("media", str, new Object[0]);
    }

    public final void j() {
        if (this.o == null) {
            return;
        }
        this.m.unregisterContentObserver(this.n);
        this.n = null;
        this.o.quit();
        try {
            this.o.join();
        } catch (InterruptedException e) {
            AbstractC4851eH1.a("media", "Thread.join() exception: ", e);
        }
        this.o = null;
    }

    public static boolean e(UsbDevice usbDevice) {
        for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
            UsbInterface usbInterface = usbDevice.getInterface(i);
            if (usbInterface.getInterfaceClass() == 1 && usbInterface.getInterfaceSubclass() == 2) {
                return true;
            }
        }
        return false;
    }
}
