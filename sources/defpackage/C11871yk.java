package defpackage;

import android.content.Context;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yk */
/* loaded from: classes.dex */
public final class C11871yk implements BY1 {
    public final /* synthetic */ C0180Bk a;

    @Override // defpackage.BY1
    public final Context getContext() {
        C0180Bk c0180Bk = this.a;
        if (c0180Bk.a.m() != null) {
            return (Context) c0180Bk.a.m().k().get();
        }
        return null;
    }

    @Override // defpackage.BY1
    public final WindowAndroid m() {
        return this.a.a.m();
    }

    public C11871yk(C0180Bk c0180Bk) {
        this.a = c0180Bk;
    }
}
