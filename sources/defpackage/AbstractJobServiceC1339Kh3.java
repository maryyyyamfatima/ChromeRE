package defpackage;

import android.content.Context;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractJobServiceC1339Kh3 extends AbstractJobServiceC9397rX1 {
    public final String i = "IO";
    public IO j;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        IO io2 = (IO) BundleUtils.e(b, this.i);
        this.j = io2;
        io2.a = this;
        super.attachBaseContext(b);
    }
}
