package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ys4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11924ys4 extends YogaNodeJNIBase {
    public final void finalize() {
        try {
            long j = this.j;
            if (j != 0) {
                this.j = 0L;
                YogaNative.jni_YGNodeFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }

    public C11924ys4(C9181qs4 c9181qs4) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(c9181qs4.a));
    }
}
