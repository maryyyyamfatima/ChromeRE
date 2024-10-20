package defpackage;

import com.facebook.yoga.YogaNative;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ps4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8838ps4 {
    public long a;

    public AbstractC8838ps4() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.a = jni_YGConfigNewJNI;
    }
}
