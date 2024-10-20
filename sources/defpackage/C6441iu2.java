package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6441iu2 implements Comparable {
    public final Uri a;
    public final long g;
    public final int h;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C6441iu2) obj).g;
        long j2 = this.g;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public C6441iu2(Uri uri, long j, int i) {
        this.a = uri;
        this.g = j;
        this.h = i;
    }
}
