package androidx.media;

import defpackage.F84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(F84 f84) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = f84.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = f84.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = f84.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = f84.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, F84 f84) {
        f84.getClass();
        f84.j(audioAttributesImplBase.a, 1);
        f84.j(audioAttributesImplBase.b, 2);
        f84.j(audioAttributesImplBase.c, 3);
        f84.j(audioAttributesImplBase.d, 4);
    }
}
