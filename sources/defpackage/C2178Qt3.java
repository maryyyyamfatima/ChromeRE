package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2178Qt3 implements Callback {
    public final /* synthetic */ int a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        AbstractC4851eH1.a("SyncSettingsUtils", "Error opening trusted vault dialog for code ", Integer.valueOf(this.a), ": ", (Exception) obj);
    }
}
