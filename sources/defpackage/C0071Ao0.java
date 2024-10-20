package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ao0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0071Ao0 {
    public final /* synthetic */ C0201Bo0 a;

    public final void a(Bundle bundle) {
        C10181to0 c10181to0 = this.a.b;
        c10181to0.getClass();
        c10181to0.a = bundle.getLong("hideDelay", 1000L);
        c10181to0.b = bundle.getLong("keepWritingDelay", 1000L);
        bundle.getInt("triggerVerticalSpace", 56);
        bundle.getInt("triggerHorizontalSpace", 56);
    }

    public C0071Ao0(C0201Bo0 c0201Bo0) {
        this.a = c0201Bo0;
    }
}
