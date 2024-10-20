package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gU */
/* loaded from: classes.dex */
public abstract class AbstractC5602gU {
    public static final AtomicInteger a = new AtomicInteger();
    public static final VD0 b;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        SystemClock.elapsedRealtime();
        UD0 ud0 = (UD0) VD0.o.j();
        if (ud0.h) {
            ud0.l();
            ud0.h = false;
        }
        VD0 vd0 = (VD0) ud0.g;
        vd0.j |= 2;
        vd0.l = 0;
        if (ud0.h) {
            ud0.l();
            ud0.h = false;
        }
        VD0 vd02 = (VD0) ud0.g;
        vd02.j |= 4;
        vd02.m = 0;
        if (ud0.h) {
            ud0.l();
            ud0.h = false;
        }
        VD0 vd03 = (VD0) ud0.g;
        vd03.j |= 1;
        vd03.k = currentTimeMillis;
        b = (VD0) ud0.j();
    }
}
