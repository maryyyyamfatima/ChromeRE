package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N7 implements InterfaceC11333x90 {
    public final InterfaceC11333x90 a;
    public final float b;

    public N7(float f, InterfaceC11333x90 interfaceC11333x90) {
        while (interfaceC11333x90 instanceof N7) {
            interfaceC11333x90 = ((N7) interfaceC11333x90).a;
            f += ((N7) interfaceC11333x90).b;
        }
        this.a = interfaceC11333x90;
        this.b = f;
    }

    @Override // defpackage.InterfaceC11333x90
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N7)) {
            return false;
        }
        N7 n7 = (N7) obj;
        return this.a.equals(n7.a) && this.b == n7.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
