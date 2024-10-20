package defpackage;

import android.content.IntentFilter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Af */
/* loaded from: classes.dex */
public final class C0025Af extends AbstractC12184zf {
    public final C5975hZ3 c;
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    @Override // defpackage.AbstractC12184zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0025Af.c():int");
    }

    @Override // defpackage.AbstractC12184zf
    public final void d() {
        this.d.o(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025Af(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef, C5975hZ3 c5975hZ3) {
        super(layoutInflaterFactory2C0545Ef);
        this.d = layoutInflaterFactory2C0545Ef;
        this.c = c5975hZ3;
    }

    @Override // defpackage.AbstractC12184zf
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
