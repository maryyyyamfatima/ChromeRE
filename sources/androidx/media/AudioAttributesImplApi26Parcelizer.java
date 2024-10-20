package androidx.media;

import android.media.AudioAttributes;
import defpackage.F84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(F84 f84) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) f84.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = f84.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, F84 f84) {
        f84.getClass();
        f84.k(audioAttributesImplApi26.a, 1);
        f84.j(audioAttributesImplApi26.b, 2);
    }
}
