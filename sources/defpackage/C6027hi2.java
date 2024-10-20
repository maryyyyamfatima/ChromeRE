package defpackage;

import android.graphics.Rect;
import java.util.Arrays;
import org.chromium.base.UnguessableToken;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hi2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6027hi2 {
    public final UnguessableToken a;
    public final int b;
    public final int c;
    public C6027hi2[] d;
    public Rect[] e;
    public final int f;
    public final int g;

    public C6027hi2(UnguessableToken unguessableToken, int i, int i2, int i3, int i4) {
        this.a = unguessableToken;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean a(boolean z) {
        if (this.e != null && this.d != null) {
            int i = 0;
            while (true) {
                C6027hi2[] c6027hi2Arr = this.d;
                if (i >= c6027hi2Arr.length) {
                    break;
                }
                C6027hi2 c6027hi2 = c6027hi2Arr[i];
                Rect rect = this.e[i];
                if ((z && (c6027hi2.b > rect.width() || c6027hi2.c > rect.height())) || c6027hi2.a(true)) {
                    return true;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C6027hi2.class != obj.getClass()) {
            return false;
        }
        C6027hi2 c6027hi2 = (C6027hi2) obj;
        return this.a.equals(c6027hi2.a) && this.c == c6027hi2.c && this.b == c6027hi2.b && Arrays.equals(this.d, c6027hi2.d) && Arrays.equals(this.e, c6027hi2.e);
    }

    public final String toString() {
        return "Guid : " + this.a + ", ContentWidth : " + this.b + ", ContentHeight: " + this.c + ", SubFrames: " + Arrays.deepToString(this.d) + ", SubFrameClips: " + Arrays.deepToString(this.e);
    }
}
