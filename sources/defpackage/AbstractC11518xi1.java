package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11518xi1 {
    public abstract AbstractC11518xi1 a(Object obj);

    public static int b(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
