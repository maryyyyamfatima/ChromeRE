package org.chromium.media;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CodecProfileLevelList$CodecProfileLevelAdapter {
    public final int a;
    public final int b;
    public final int c;

    public CodecProfileLevelList$CodecProfileLevelAdapter(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int getCodec() {
        return this.a;
    }

    public int getProfile() {
        return this.b;
    }

    public int getLevel() {
        return this.c;
    }
}
