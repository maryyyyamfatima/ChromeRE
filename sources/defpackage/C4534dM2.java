package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dM2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4534dM2 implements InterfaceC11333x90 {
    public final float a;

    public C4534dM2(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC11333x90
    public final float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4534dM2) && this.a == ((C4534dM2) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
