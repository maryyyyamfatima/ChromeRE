package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4543dO1 {
    public final Bundle a = new Bundle();

    public final void c(String str, String str2) {
        C4317ck c4317ck = MediaMetadataCompat.i;
        if (c4317ck.containsKey(str) && ((Integer) c4317ck.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC4199cO1.a("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public final void b(long j) {
        C4317ck c4317ck = MediaMetadataCompat.i;
        if (c4317ck.containsKey("android.media.metadata.DURATION") && ((Integer) c4317ck.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.a.putLong("android.media.metadata.DURATION", j);
    }

    public final void a(Bitmap bitmap, String str) {
        C4317ck c4317ck = MediaMetadataCompat.i;
        if (c4317ck.containsKey(str) && ((Integer) c4317ck.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC4199cO1.a("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }
}
