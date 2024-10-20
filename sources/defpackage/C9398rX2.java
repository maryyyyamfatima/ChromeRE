package defpackage;

import android.content.Context;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rX2 */
/* loaded from: classes.dex */
public final class C9398rX2 implements BY1 {
    public final /* synthetic */ C10084tX2 a;

    @Override // defpackage.BY1
    public final Context getContext() {
        WindowAndroid windowAndroid = this.a.l;
        if (windowAndroid != null) {
            return (Context) windowAndroid.k().get();
        }
        return null;
    }

    @Override // defpackage.BY1
    public final WindowAndroid m() {
        return this.a.l;
    }

    public C9398rX2(C10084tX2 c10084tX2) {
        this.a = c10084tX2;
    }
}
