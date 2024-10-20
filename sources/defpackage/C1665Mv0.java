package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665Mv0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d = Process.myTid();
    public final long e = System.nanoTime();
    public final long f = SystemClock.currentThreadTimeMillis();

    public C1665Mv0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
