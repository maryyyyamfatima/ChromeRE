package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6129i implements InterfaceC11333x90 {
    public final float a;

    public C6129i(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC11333x90
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6129i) && this.a == ((C6129i) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
