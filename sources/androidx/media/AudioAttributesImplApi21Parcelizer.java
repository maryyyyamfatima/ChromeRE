package androidx.media;

import android.media.AudioAttributes;
import defpackage.F84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(F84 f84) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) f84.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = f84.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, F84 f84) {
        f84.getClass();
        f84.k(audioAttributesImplApi21.a, 1);
        f84.j(audioAttributesImplApi21.b, 2);
    }
}
