package com.google.vr.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import defpackage.C1356Kl0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class DeviceInfo {
    public final long a;
    public final Context b;
    public final BroadcastReceiver c = new C1356Kl0(this);

    public DeviceInfo(long j, Context context) {
        this.a = j;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateHeadphoneStateChange(long j, int i);

    private static DeviceInfo createDeviceInfo(long j, Context context) {
        return new DeviceInfo(j, context);
    }

    private void registerHandlers() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.b.registerReceiver(this.c, intentFilter);
    }

    private void unregisterHandlers() {
        this.b.unregisterReceiver(this.c);
    }

    private boolean isHeadphonePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    private int getSystemSampleRate() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
            return 48000;
        }
        return Integer.parseInt(property);
    }

    private int getSystemBufferSize() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
            return 256;
        }
        return Integer.parseInt(property);
    }

    private boolean isBluetoothAudioDevicePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }
}
