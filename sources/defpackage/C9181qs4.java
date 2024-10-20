package defpackage;

import com.facebook.yoga.YogaNative;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qs4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9181qs4 extends AbstractC8838ps4 {
    public final void finalize() {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
