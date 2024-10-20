package defpackage;

import android.app.Activity;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m42, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7531m42 implements Callback {
    public final /* synthetic */ C8905q42 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C7531m42(C8905q42 c8905q42) {
        this.a = c8905q42;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C8905q42 c8905q42 = this.a;
        c8905q42.f();
        c8905q42.k = (Activity) obj;
        c8905q42.i();
    }
}
