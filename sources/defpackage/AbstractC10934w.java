package defpackage;

import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10934w {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}