package org.chromium.content.browser;

import J.N;
import android.media.AudioManager;
import defpackage.AbstractC4851eH1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AudioFocusDelegate implements AudioManager.OnAudioFocusChangeListener {
    public int a;
    public boolean b;
    public long c;

    public AudioFocusDelegate(long j) {
        this.c = j;
    }

    public static AudioFocusDelegate create(long j) {
        return new AudioFocusDelegate(j);
    }

    public final void tearDown() {
        abandonAudioFocus();
        this.c = 0L;
    }

    public final boolean requestAudioFocus(boolean z) {
        this.a = z ? 3 : 1;
        return ((AudioManager) V60.a.getSystemService("audio")).requestAudioFocus(this, 3, this.a) == 1;
    }

    public final void abandonAudioFocus() {
        ((AudioManager) V60.a.getSystemService("audio")).abandonAudioFocus(this);
    }

    public final boolean isFocusTransient() {
        return this.a == 3;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        long j = this.c;
        if (j == 0) {
            return;
        }
        if (i == -3) {
            this.b = true;
            N.Mn3dG6eh(j, this);
            N.My_SIOp6(this.c, this);
            return;
        }
        if (i == -2) {
            N.MUFA7yj7(j, this);
            return;
        }
        if (i == -1) {
            abandonAudioFocus();
            N.MUFA7yj7(this.c, this);
        } else if (i != 1) {
            AbstractC4851eH1.f("MediaSession", "onAudioFocusChange called with unexpected value %d", Integer.valueOf(i));
        } else if (!this.b) {
            N.MqbF3KiE(j, this);
        } else {
            N.MeoE5HbI(j, this);
            this.b = false;
        }
    }
}
