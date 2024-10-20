package androidx.media;

import defpackage.F84;
import defpackage.H84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(F84 f84) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        H84 h84 = audioAttributesCompat.a;
        if (f84.e(1)) {
            h84 = f84.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) h84;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, F84 f84) {
        f84.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        f84.i(1);
        f84.l(audioAttributesImpl);
    }
}
