package org.chromium.midi;

import android.media.midi.MidiDeviceInfo;
import android.media.midi.MidiManager;
import android.os.Handler;
import defpackage.C6307iX1;
import defpackage.C6993kX1;
import defpackage.RunnableC5963hX1;
import defpackage.RunnableC6649jX1;
import defpackage.V60;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MidiManagerAndroid {
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final MidiManager d = (MidiManager) V60.a.getSystemService("midi");
    public final Handler e = new Handler(ThreadUtils.c());
    public final long f;
    public boolean g;

    public static boolean hasSystemFeatureMidi() {
        return V60.a.getPackageManager().hasSystemFeature("android.software.midi");
    }

    public static MidiManagerAndroid create(long j) {
        return new MidiManagerAndroid(j);
    }

    public MidiManagerAndroid(long j) {
        this.f = j;
    }

    public void initialize() {
        Handler handler = this.e;
        MidiManager midiManager = this.d;
        if (midiManager == null) {
            handler.post(new RunnableC5963hX1(this));
            return;
        }
        midiManager.registerDeviceCallback(new C6307iX1(this), handler);
        for (MidiDeviceInfo midiDeviceInfo : midiManager.getDevices()) {
            this.c.add(midiDeviceInfo);
            midiManager.openDevice(midiDeviceInfo, new C6993kX1(this, midiDeviceInfo), handler);
        }
        handler.post(new RunnableC6649jX1(this));
    }

    public synchronized void stop() {
        this.g = true;
    }
}
