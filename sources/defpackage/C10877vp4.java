package defpackage;

import android.view.View;
import android.view.WindowId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vp4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10877vp4 implements InterfaceC11220wp4 {
    public final WindowId a;

    public C10877vp4(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10877vp4) && ((C10877vp4) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
