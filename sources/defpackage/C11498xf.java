package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xf */
/* loaded from: classes.dex */
public final class C11498xf extends AbstractC12184zf {
    public final PowerManager c;
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef d;

    @Override // defpackage.AbstractC12184zf
    public final void d() {
        this.d.o(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11498xf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef, Context context) {
        super(layoutInflaterFactory2C0545Ef);
        this.d = layoutInflaterFactory2C0545Ef;
        this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.AbstractC12184zf
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.AbstractC12184zf
    public final int c() {
        return this.c.isPowerSaveMode() ? 2 : 1;
    }
}
