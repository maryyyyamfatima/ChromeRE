package defpackage;

import android.os.Build;
import android.os.IBinder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j44 */
/* loaded from: classes2.dex */
public class C6501j44 extends AbstractC1598Mh3 {
    public BinderC6159i44 b;

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        C7629mN.a().d(false);
        this.b = new BinderC6159i44(this.a);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.b;
        }
        return null;
    }
}
